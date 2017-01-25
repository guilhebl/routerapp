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

import java.awt.Component;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 * 
 */
public class NavigationTreeCellRenderer extends DefaultTreeCellRenderer {

    /**
     * @see javax.swing.tree.TreeCellRenderer#getTreeCellRendererComponent(javax.swing.JTree, java.lang.Object, boolean, boolean, boolean, int, boolean)
     */
    public Component getTreeCellRendererComponent(JTree tree, Object value,
            boolean sel, boolean expanded, boolean leaf, int row,
            boolean hasFocus) {
        super.getTreeCellRendererComponent(tree,value,sel,expanded,leaf,row,hasFocus);
        
        if (value.toString().equals("animations")) {
            setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/Animation16.gif"))));
        }
        else if (value.toString().equals("graphs")) {
            setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/Graph16.gif"))));
        }
        else if (value.toString().equals("user")) {
            setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/User16.gif"))));
        }
        else if (value.toString().equals("algorithms")) {
        	setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getClassLoader().getResource("images/Algorithm16.gif"))));
        }
        else setIcon(null);
        
        setText(value.toString());
        return this;
    }
}
