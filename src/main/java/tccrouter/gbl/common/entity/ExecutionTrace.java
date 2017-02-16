package tccrouter.gbl.common.entity;


/**
 * Contains the code to measure the 
 * resource management of an executing heuristic.
 */
public class ExecutionTrace {

	int counter;
	int gcCounter;
	
	/**
	 * Time metrics in miliseconds for measure.
	 */
	long initialTime;
	long iterationTime;
	long lastIterationTime;
	long finalTime;
	
	/**
	 * Memory usage metrics in bytes.
	 */
	long totalMemory;
	long totalMemoryAllocated;
	long initialFreeMemory;
	long lastFreeMemory;
	long memoryDifference;	
	long freeMemory;

	/**
	 * Singleton
	 */
	static ExecutionTrace instance;
	
	protected ExecutionTrace() {
		
	}

	public static ExecutionTrace getInstance() {
		if (instance == null)
			instance = new ExecutionTrace();
		
		return instance;
	}
	
	public void initialTrace() {
		counter = gcCounter = 0;
		totalMemoryAllocated = 0;
		initialTime = System.currentTimeMillis();
		lastIterationTime = initialTime;
		totalMemory = Runtime.getRuntime().totalMemory();
		freeMemory = Runtime.getRuntime().freeMemory();
		lastFreeMemory = freeMemory;
		initialFreeMemory = freeMemory;
		System.out.println("\n-------------------------------------------");
		System.out.println(" INIT time(0): " + initialTime);
		System.out.println(" Total Memory(0): " + totalMemory);				
		System.out.println(" Free Memory(0): " + freeMemory);
	}

	public void iterationTrace() {
		counter++;
		iterationTime = System.currentTimeMillis();
		freeMemory = Runtime.getRuntime().freeMemory();
//		System.out.println("\n-------------------------------------------");
//		System.out.println(" iteration time(" + counter + "): " + iterationTime);
//		System.out.println(" Total Memory(" + counter + "): " + totalMemory);
//		System.out.println(" Free Memory(" + counter + "): " + freeMemory);				
//		System.out.println(" Memory Difference(" + counter + "): " + (freeMemory - lastFreeMemory));
		memoryDifference = (freeMemory - lastFreeMemory);
		
		if (memoryDifference > 0) {
			gcCounter++;
		} else {
			totalMemoryAllocated += memoryDifference;	
		}
		 
		lastFreeMemory = freeMemory;		
	}
	
	public void finalTrace() {
		finalTime = (System.currentTimeMillis() - initialTime);

		System.out.println("\n-------------------------------------------");
		System.out.println(" FINAL time(" + counter + "): " + finalTime);
		
		if (totalMemoryAllocated == 0) {
			freeMemory = Runtime.getRuntime().freeMemory();
		    memoryDifference = (freeMemory - lastFreeMemory);
		    System.out.println(" Memory Difference: " + memoryDifference);
	    } else {
			System.out.println(" Total Memory Allocated: " + totalMemoryAllocated);	    	
	    }
	    
		System.out.println(" GC: " + gcCounter);

	}

	public long getFinalTime() {
		return finalTime;
	}

	public void setFinalTime(long finalTime) {
		this.finalTime = finalTime;
	}		
}
