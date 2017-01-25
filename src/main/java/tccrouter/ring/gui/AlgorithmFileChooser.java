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
package tccrouter.ring.gui;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 * Window that allows the user to select algorithm files in the file system.
 */
public class AlgorithmFileChooser extends JFileChooser {
	
	/**
	 * Filter that will only allow the file chooser window to show '.class'
	 * files.
	 */
	class ClassFileFilter extends FileFilter {

		/**
		 * The accepted extensions.
		 * @see javax.swing.filechooser.FileFilter#accept(java.io.File)
		 */
		public boolean accept(File f) {
			if (f.getName().endsWith(".class") || f.isDirectory()) return true;
			return false;
		}

		/**
		 * The description of the filer.
		 * @see javax.swing.filechooser.FileFilter#getDescription()
		 */
		public String getDescription() {
			return "\'.class\' files";
		}
	}
	
	/**
	 * The unique instance to this class.
	 */
	static AlgorithmFileChooser instance;
	/**
	 * The name of the last selected file.
	 */
	String lastSelected;
	
	/**
	 * Retrieves the unique instance to this class.
	 * @return the instance to this class
	 */
	public static AlgorithmFileChooser getInstance() {
		if (instance == null) instance = new AlgorithmFileChooser();
		
		return instance;
	}
	
	/**
	 * Creates an instance to this class and sets the opening folder
	 * to the current one.
	 */
	protected AlgorithmFileChooser () {
		super("." + File.separator + "user" + File.separator + "algorithms" + File.separator);
		this.setFileFilter(new ClassFileFilter());
		this.setMultiSelectionEnabled(false);
	}
	
	/**
	 * Opens the file chooser dialog and retrieves the user selected file name.
	 */
	public int chooseFile () {
		int option = showOpenDialog(null);
		lastSelected = null;
		
		if (option == JFileChooser.APPROVE_OPTION) {
			lastSelected = this.getSelectedFile().getPath();
		}
		else
			lastSelected = null;
		
		return option;
	}
	
	/**
	 * Retrieves the URL in the file system to the last selected file.
	 * @return the URL of the last selected file if the user pressed OK and
	 * null otherwise
	 */
	public String getLastSelectedFileURL () {
		if (lastSelected == null)
			return null;
			
		String url = lastSelected.substring(0,lastSelected.lastIndexOf(File.separator)) + File.separator;
		
		return url;
	}
	
	/**
	 * Retrieves the name of the last selected file.
	 * @return the name of the last selected file if the user pressed OK and
	 * null otherwise
	 */
	public String getLastSelectedFileName () {
		if (this.getSelectedFile() == null)
			return null;
		
		return this.getSelectedFile().getName();
	}
}
