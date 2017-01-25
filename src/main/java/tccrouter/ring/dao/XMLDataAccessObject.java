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

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;


/**
 * 
 */
abstract class XMLDataAccessObject {
	
	private Document document;
	private Object value;
	
	public XMLDataAccessObject(Object value,Document document) {
		
		if (document == null)
			createXMLDocument();
		else
			this.document = document;
		
		this.value = value;
	}
	/**
	 * @throws FactoryConfigurationError
	 */
	protected void createXMLDocument() throws FactoryConfigurationError {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {
			// get DocumentBuilder
			DocumentBuilder builder = factory.newDocumentBuilder();

			// make XML root nodo
			document = (Document) builder.newDocument();
		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	public abstract String makeXML();
	
	/**
	 * 
	 * @param xml
	 * @return
	 */
	public abstract Object readXML(String xml);
	
	/**
	 * 
	 * @return
	 */
	public abstract org.w3c.dom.Element getRootElement();
	
	/**
	 * @return Returns the document.
	 */
	protected Document getDocument() {
		return document;
	}
	
	/**
	 * @param document The document to set.
	 */
	protected void setDocument(Document document) {
		this.document = document;
	}
	
	/**
	 * @return Returns the value.
	 */
	protected Object getValue() {
		return value;
	}
	
	/**
	 * @param value The value to set.
	 */
	protected void setValue(Object value) {
		this.value = value;
	}
}
