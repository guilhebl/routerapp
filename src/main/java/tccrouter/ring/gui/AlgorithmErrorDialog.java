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

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 
 */
public class AlgorithmErrorDialog extends JDialog {
	
	/**
	 * 
	 */
	protected static AlgorithmErrorDialog instance;
	/**
	 * 
	 */
	private JTextArea textArea;
	
	/**
	 * Creates an instance of this class.
	 */
	protected AlgorithmErrorDialog() {
		this.setSize(new Dimension(400,400));
		this.setTitle("Algorithm execution error");
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(textArea);
		
		JButton okButton = new JButton(new AbstractAction("OK") {

			public void actionPerformed(ActionEvent e) {
				dispose();
				Runtime.getRuntime().exit(1);
			}
		});
		
		JPanel contentPane = new JPanel(new BorderLayout());
		contentPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		contentPane.add(scroll,BorderLayout.CENTER);
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(contentPane,BorderLayout.CENTER);
		getContentPane().add(okButton,BorderLayout.SOUTH);
	}
	
	/**
	 * 
	 * @return
	 */
	public static AlgorithmErrorDialog getInstance() {
		if (instance == null)
			instance = new AlgorithmErrorDialog();
		
		return instance;
	}
	
	/**
	 * 
	 * @param exc
	 */
	public void showErrorMessage(final Exception exc) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		String message = "The execution of your algorithm has caused the following exception:\n" +
		exc.getClass().getName() + ": " + exc.getMessage() + "\n";
		
		StackTraceElement [] stack = exc.getStackTrace();
		for (int i=0 ; i<stack.length ; i++)
			message += "    at " + stack[i].toString() + "\n";
		
		textArea.setText(message);
		validate();
		setLocation(
			(int) (screenSize.getWidth()  - getWidth())/2,
			(int) (screenSize.getHeight() - getHeight())/2
		);

		show();
	}
}
