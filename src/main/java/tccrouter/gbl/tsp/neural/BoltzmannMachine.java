package tccrouter.gbl.tsp.neural;

import tccrouter.gbl.common.entity.TSProblemModel;
import tccrouter.gbl.tsp.genetic.tools.MersenneTwister;

/******************************************************************************

@author Guilherme Becker L. 
Class adapted from the C code below:
 
 ========================================================
  Network:      Boltzmann Machine with Simulated Annealing
 =======================================================

Application:  Optimization
Traveling Salesman Problem

Author:       Karsten Kutza
Date:         21.2.96

Reference:    D.H. Ackley, G.E. Hinton, T.J. Sejnowski
A Learning Algorithm for Boltzmann Machines
Cognitive Science, 9, pp. 147-169, 1985

******************************************************************************/

public class BoltzmannMachine {

/******************************************************************************
      D E C L A R A T I O N S
******************************************************************************/

	private class NeuralNet {                 /* A NET:                                */
		public int           units;           /* - number of units in this net         */
		public boolean       output[];        /* - output of ith unit                  */
		public int           on[];            /* - counting on states in equilibrium   */
		public int           off[];           /* - counting off states in equilibrium  */
		public double        threshold[];     /* - threshold of ith unit               */
		public double        weight[][];      /* - connection weights to ith unit      */
		public double        temperature;     /* - actual temperature                  */

		/*
			void generateNetwork(NET* Net)
			{
			INT i;

			Net->Units     = N;
			Net->Output    = (BOOL*)  calloc(N, sizeof(BOOL));
			Net->On        = (INT*)   calloc(N, sizeof(INT));
			Net->Off       = (INT*)   calloc(N, sizeof(INT));
			Net->Threshold = (REAL*)  calloc(N, sizeof(REAL));
			Net->Weight    = (REAL**) calloc(N, sizeof(REAL*));

			for (i=0; i<N; i++) {
			Net->Weight[i] = (REAL*) calloc(N, sizeof(REAL));
			}
			}
		 * 
		 */
		public NeuralNet(int n) {
			units     = n;
			output    = new boolean[n];
			on        = new int[n];
			off       = new int[n];
			threshold = new double[n];
			weight    = new double[n][n];
		}
	}

	private TSProblemModel tsProblemRef;
	private NeuralNet net;
	private int numCities;
	private int n;
	private double gamma;
	private double distance[][];
	
	public BoltzmannMachine() {
		tsProblemRef = TSProblemModel.getInstance();
		numCities = tsProblemRef.getNumNodes() + 1;			
		n = (numCities * numCities);
		net = new NeuralNet(n);
		gamma = 7;
		
		distance = tsProblemRef.getCityDistanceMatrix();

   	    double widthMin = 0.0D;
		double widthMax = tsProblemRef.getWidthMax();
		double heightMin = 0.0D;
		double heightMax = tsProblemRef.getHeightMax();
		
	    double cityScaler =  // we will reuse this in our stopping condition
	        Math.max
	        (
	          ( widthMax - widthMin ),
	          ( heightMax - heightMin )
	        );
		
	    /*
	    ** Scale cities from the input city list to fit this routine's
	    ** expectations of them being in a unit between 0.0 an 1.0,
	    ** copy the results to the local city array.
	    */
	        for ( int cityIndex = 0; cityIndex < numCities; cityIndex++ ) {
		        for ( int j = 0; j < numCities; j++ ) {	        		          
		        	distance[cityIndex][j] = distance[cityIndex][j] / cityScaler;
		        }
	        }

		
//		distance = new double[numCities][numCities];
//		int  n1,n2;
//		double x1,x2,y1,y2;
//		double alpha1, alpha2;
//
//		for (n1 = 0; n1 < numCities; n1++) {		
//			for (n2 = 0; n2 < numCities; n2++) {		
//				alpha1 = ((double) n1 / numCities) * 2 * Math.PI;		
//				alpha2 = ((double) n2 / numCities) * 2 * Math.PI;
//		
//				x1 = Math.cos(alpha1);		
//				y1 = Math.sin(alpha1);		
//				x2 = Math.cos(alpha2);		
//				y2 = Math.sin(alpha2);		
//				distance[n1][n2] = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));		
//			}
//		}
		
	}
	
/******************************************************************************
R A N D O M S   D R A W N   F R O M   D I S T R I B U T I O N S
******************************************************************************/

	private void initializeRandoms()
	{
		MersenneTwister.getTwister().setSeed(4711);
	}

	private boolean randomEqualBOOL()
	{
	 return MersenneTwister.getTwister().nextBoolean();
	}

	private int randomEqualInt(int low, int high)
	{
	 return MersenneTwister.getTwister().nextInt(high-low+1) + low;
	}      

	private double randomEqualReal(double low, double high)
	{
	 return ((double) MersenneTwister.getTwister().nextDouble()) * (high-low) + low;
	}      

/******************************************************************************
A P P L I C A T I O N - S P E C I F I C   C O D E
******************************************************************************/

	private void calculateWeights()
	{
		int  n1,n2,n3,n4;
		int  i,j;
		int  pred_n3, succ_n3;
		double weight;

		for (n1=0; n1<numCities; n1++) {
			for (n2=0; n2 < numCities; n2++) {
				 i = n1*numCities + n2;
				 for (n3 = 0; n3 < numCities; n3++) {
					 for (n4 = 0; n4 < numCities; n4++) {
						 j = n3*numCities + n4;
						 weight = 0;
						 if (i!=j) {
							 pred_n3 = (n3 == 0 ? numCities-1 : n3-1);
							 succ_n3 = (n3 == numCities - 1 ? 0 : n3+1);
							 if ((n1==n3) || (n2==n4)) {
								 weight = -gamma;						 
							 }
							 else if ((n1 == pred_n3) || (n1 == succ_n3)) {
								 weight = -distance[n2][n4];						 
							 }
						 }
						 net.weight[i][j] = weight;

					 }
				 }
				 net.threshold[i] = -gamma/2;
			}	
		}		
	}

	private boolean validTour()
	{
		int n1,n2;
		int cities, stops;

		for (n1 = 0; n1 < numCities; n1++) {

			cities = 0;
			stops  = 0;

			for (n2 = 0; n2 < numCities; n2++) {
				if (net.output[n1*numCities+n2]) {
					if (++cities > 1) {
						return false;				
					}
				}

				if (net.output[n2*numCities+n1]) {
					if (++stops > 1) 
						return false;
				}
			}

			if ((cities != 1) || (stops != 1)) {
				return false;
			}
		}

		return true;		
	}

	private double lengthOfTour()
	{
		int  n1,n2,n3;
		double length = 0;

		for (n1 = 0; n1 < numCities; n1++) {
			for (n2 = 0; n2 < numCities; n2++) {
				if (net.output[((n1) % numCities)*numCities+n2])
					return -1;
			}
			
			for (n3 = 0; n3 < numCities; n3++) {
				if (net.output[((n1+1) % numCities)*numCities+n3])
					return -1;
			}

			length += distance[n2][n3];
		}
		return length;
	}

	private int[] getTour()
	{
		int  array[] = new int[numCities];
		int  cityCounter = 0;
		int  n1,n2;

		for (n1=0; n1 < numCities; n1++) {
			 for (n2=0; n2 < numCities; n2++) {
				 if (net.output[n1*numCities+n2]) {
//					 array[cityCounter] = tsProblemRef.getNodeIndex(n2);
					 array[cityCounter] = n2;
					 cityCounter++;
				 }
			 }
		}
		
		return array;
	}



//void FinalizeApplication(NET* Net)
//{
//fclose(f);
//}


/******************************************************************************
    I N I T I A L I Z A T I O N
******************************************************************************/

	private void setRandom()
	{
		int i;

		for (i = 0; i < net.units; i++) {
			 net.output[i] = randomEqualBOOL();
		}		
	}



/******************************************************************************
P R O P A G A T I N G   S I G N A L S
******************************************************************************/


	private void propagateUnit(int i)
	{
		int  j;
		double sum, probability;

		sum = 0;

		for (j = 0; j < net.units; j++) {
			int valueBool = (net.output[j] ? 1 : 0);
			sum += net.weight[i][j] * valueBool;
		}

		sum -= net.threshold[i];

		probability = 1 / (1 + Math.exp(-sum / net.temperature));

		if (randomEqualReal(0, 1) <= probability) {
			net.output[i] = true;
		}
		else {
			net.output[i] = false;
		}		
	}


/******************************************************************************
S I M U L A T I N G   T H E   N E T
******************************************************************************/

	private void bringToThermalEquilibrium()
	{
		int n,i;

		for (i=0; i < net.units; i++) {
		net.on[i]  = 0;
		net.off[i] = 0;
		}

		for (n=0; n < (1000*net.units); n++) {
			propagateUnit(i = randomEqualInt(0, net.units-1));
		}

		for (n=0; n < (100*net.units); n++) {
			propagateUnit(i = randomEqualInt(0, net.units-1));
			
			if (net.output[i]) {
				net.on[i]++;
			}
			else {
				net.off[i]++;
			}
		}

		for (i=0; i < net.units; i++) {
			net.output[i] = net.on[i] > net.off[i];
		}		
	}

	private void anneal()
	{
		net.temperature = 100;

		do {
		bringToThermalEquilibrium();

//		writeTour();

		net.temperature *= 0.99;
		} while (! validTour());		
	}


/******************************************************************************
              M A I N
******************************************************************************/

	public int[] execute()
	{
		initializeRandoms();
//		generateNetwork();
//		initializeApplication();
		calculateWeights();
		setRandom();
		anneal();
		
		
//		finalizeApplication(&Net);
		
		return getTour();
	}

}