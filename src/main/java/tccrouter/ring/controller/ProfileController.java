/* 
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  - Redistributions of source code must retain the above copyright notice,
 * 	  this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *  - Neither the name of the Rin'G Project nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE 
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
 * IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package tccrouter.ring.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JOptionPane;

import tccrouter.gbl.tsp.genetic.SimulatedAnnealing;
import tccrouter.ring.gui.UIFacade;
import tccrouter.user.algorithms.AStar;
import tccrouter.user.algorithms.BranchAndBound;
import tccrouter.user.algorithms.BreadthSearch;
import tccrouter.user.algorithms.ClarkeWright;
import tccrouter.user.algorithms.DepthSearch;
import tccrouter.user.algorithms.LocalSearch;
import tccrouter.user.algorithms.NearestNeighbor;
import tccrouter.user.algorithms.NodeDegree;
import tccrouter.user.algorithms.PFIH;
import tccrouter.user.algorithms.SetPartitioningKTSP;
import tccrouter.user.algorithms.TSPBoltzmannMachine;
import tccrouter.user.algorithms.TSPElasticNeuralNet;
import tccrouter.user.algorithms.TSPGeneticAlgorithm;

/**
 * Performs the control of the user profile, the file in which the
 * inserted algorithms and menu separators created by the user are kept
 * so that they can be reloaded at any time.
 */
public class ProfileController {

	/**
	 * String that represents a menu separator in the profile.
	 */
	static final String SEPARATOR_STRING = "___________________";
	/**
	 * The unique instance to this class.
	 */
	static ProfileController instance;
	/**
	 * The URL in the file system to the profile.  
	 */
	static final String DEFAULT_PROFILE_FILENAME = "default-config.xml";
	/**
	 * The file reader used by this class.
	 */
	BufferedReader br;
	/**
	 * The file writer used by this class.
	 */
	PrintWriter pw;
	/**
	 * The name of the profile file.
	 */
	static final String fileName = ".algorithm";
    private UIFacade uiFacade = UIFacade.getInstance();

	/**
	 * Retrieves the unique instance to this class.
	 * @return the instance to this class
	 */
	public static ProfileController getInstance() {
		if (instance == null)
			instance = new ProfileController();
		return instance;
	}

	/**
	 * Creates an instance of this class.
	 */
	protected ProfileController() {
	}

	/**
	 * Adds an algorithm to the profile.
	 * @param aName the name of the new algorithm
	 * @param append indicates wether the new algorithm should be appended
	 * to the end of the file or overwrite the existing ones in that file
	 */
	public void addAlgorithm(String aName,boolean append) {
//		try {
//			pw = new PrintWriter(new FileWriter(profileUrl + fileName,append), true);
//		} catch (IOException exc) {
//			JOptionPane.showMessageDialog(
//				null,
//				"Error adding algorithm to profile.",
//				"Profile controller",
//				JOptionPane.ERROR_MESSAGE
//			);
//		}
//
//		pw.println(aName);
//		pw.close();
	}

	/**
	 * Retrieves the names of all inserted algorithms and separators present
	 * in the profile.
	 * @return a Vector containing the algorithm names and separators.
	 */
	public Vector<String> retrieveAlgorithmNames() {
		
		Vector<String> names = new Vector<String>();
		names.add(AStar.class.getName());
		names.add(BranchAndBound.class.getName());
		names.add(BreadthSearch.class.getName());
		names.add(ClarkeWright.class.getName());
		names.add(DepthSearch.class.getName());
		names.add(LocalSearch.class.getName());
		names.add(NearestNeighbor.class.getName());
		names.add(NodeDegree.class.getName());
		names.add(PFIH.class.getName());
		names.add(SetPartitioningKTSP.class.getName());
		names.add(SimulatedAnnealing.class.getName());
		names.add(TSPBoltzmannMachine.class.getName());
		names.add(TSPElasticNeuralNet.class.getName());
		names.add(TSPGeneticAlgorithm.class.getName());		
		return names;
	}

	/**
	 * Opens the profile file.
	 * @throws java.io.IOException
	 */
	public void openFile() throws java.io.IOException {
		try {
			//br = new BufferedReader(new FileReader(profileUrl + fileName));
		} catch (Exception exc) {
			File toOpen = new File(fileName);
			if (toOpen.isFile())
				exc.printStackTrace();
		}
	}

	/**
	 * Closes the profile file.
	 * @throws java.io.IOException
	 */
	public void closeFile() throws java.io.IOException {
		if (br != null)
			br.close();
		if (pw != null)
			pw.close();
	}

	/**
	 * Loads the algorithms in the profile.
	 */
	public void loadAlgorithms() {
		try {
			Vector<String> names = retrieveAlgorithmNames();			
			Iterator<String> i = names.iterator();
			while (i.hasNext()) {
				String item = (String) i.next();
				
				if (!item.equals(ProfileController.SEPARATOR_STRING))
					UIFacade.getInstance().addAlgorithm(item);
				else
					uiFacade.appendSeparatorToUserMenu();
			}
			
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(
				null,
				"Profile couldn't be opened.",
				"Profile controller",
				JOptionPane.ERROR_MESSAGE
			);
		}
	}
	
	/**
	 * Updates the profile according to the changes made in the menu.
	 * @param menuData a Vector containing the menu data
	 */
	public void updateProfile(Vector menuData) {
		if (menuData.size() > 0) {
			addAlgorithm((String)menuData.elementAt(0),false);
			for (int i=1 ; i<menuData.size() ; i++)
				addAlgorithm((String)menuData.elementAt(i),true);
		}
	}
}