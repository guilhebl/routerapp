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

import tccrouter.gbl.dao.JDBCGraphDAOFactory;

/**
 * Responsible for selecting a DAO Factory to be used for a given type
 * of output.
 */
public abstract class AbstractDAOFactory {

	/**
	 * An XML output for a graph.
	 */
	public static final int XML_GRAPH = 1;
	/**
	 * An XML output for an algorithm animation.
	 */
	public static final int XML_ANIMATION = 2;
	
	/**
	 * A JDBC database output for a graph.
	 */
	public static final int JDBC_GRAPH = 3;	

	/**
	 * Build the output form.
	 */
	public abstract void makeObject();
	/**
	 * Save the output in a persistent media.
	 */
	public abstract void saveObject();
	/**
	 * Read an object from a persistent media.
	 * @param filePath the path to the media to be read
	 * @return the imported object
	 */
	public abstract Object readObject(String filePath);
	
	/**
	 */
	public abstract void setObjectName(String name);	

	/**
	 * Select the factory for a given output media.
	 * @param whichFactory media type indicator
	 * @param value object to be recorded
	 * @return the factory that will write or read from the selected media
	 */
	public static AbstractDAOFactory getDAOFactory(int whichFactory, Object value) {

		switch (whichFactory) {
			case XML_GRAPH:
				return new XMLGraphDAOFactory(value);
			
			case XML_ANIMATION:
				return new XMLAnimationDAOFactory(value);

			case JDBC_GRAPH:
				return new JDBCGraphDAOFactory(value);
				
			default:
				return null;
		}
	}

}