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
package tccrouter.ring.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import tccrouter.ring.gui.XMLFileChooser;

public class XMLGraphDAOFactory extends AbstractDAOFactory {

	XMLGraphDAO xmlDAO;
	String xmlGraph;
	/**
	 * The file writer used by this class.
	 */
	PrintWriter pw;

	public XMLGraphDAOFactory(Object value) {
		xmlDAO = new XMLGraphDAO(value,null);
	}

	public void makeObject() {
		xmlGraph = xmlDAO.makeXML();
	}

	public void saveObject() {
		if (xmlGraph != null) {
		    XMLFileChooser fc = XMLFileChooser.getInstance();
			fc.chooseSaveFile("." + File.separator + "user" + File.separator + "graphs");

			if (fc.getLastSelectedFileName() != null
				&& fc.getLastSelectedFileURL() != null) {
				try {
					pw =
						new PrintWriter(
							new FileWriter(
								fc.getLastSelectedFileURL()
									+ fc.getLastSelectedFileName()
									+ ".xml",
								false),
							true);
				} catch (IOException exc) {
					JOptionPane.showMessageDialog(
						null,
						"Error saving XML file.",
						"Saving XML file",
						JOptionPane.ERROR_MESSAGE);
				}

				pw.println(xmlGraph);
				pw.close();
			}
		} else {
			JOptionPane.showMessageDialog(
				null,
				"Error saving XML file. XML Graph is null",
				"Saving XML file",
				JOptionPane.ERROR_MESSAGE);

		}
	}

	public Object readObject(String filePath) {
	    if (!filePath.endsWith(".xml"))
	        filePath += ".xml";
	    
		return xmlDAO.readXML(filePath);
	}

	public void setObjectName(String name) {
		// TODO Auto-generated method stub
		
	}

	public String[][] findAllGraphs() {
		// TODO Auto-generated method stub
		return null;
	}

}