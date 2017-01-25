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

import java.util.Iterator;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import tccrouter.diamante.core.graph.property.ComponentProperties;
import tccrouter.diamante.core.graph.property.Property;
import tccrouter.diamante.extension.graph.property.InteractiveProperty;

/**
 * The table model used by the properties table. Indicates how a graph component's
 * interactive properties are shown.
 */
class PropertyTableModel extends AbstractTableModel {

	/**
	 * The names of the columns.
	 */
	static final String [] columnNames = {"Property","Value"};
	/**
	 * The properties that are being shown.
	 */
	Vector properties;
	/**
	 * The values that have been input by the user.
	 */
	String[] values;
	
	/**
	 * Creates a new table model using a component's properties.
	 * @param properties the component's properties
	 */
	public PropertyTableModel(ComponentProperties properties) {
		super();
		
		if (properties != null) {
			this.properties = selectInteractiveProperties(properties.getAllProperties());
			values = new String[this.properties.size()];
			
			for (int i = 0 ; i < values.length ; i++)
				values[i] = ((InteractiveProperty) this.properties.elementAt(i)).toString();
		}
	}

	/**
	 * Retrieves a Vector containing only the interactive properties from a component's
	 * properties.
	 * @param properties the original component's properties
	 * @return the filtered properties Vector
	 */
	private Vector selectInteractiveProperties(Vector properties) {
		Vector interactiveProperties = new Vector();
		
		Iterator i = properties.iterator();
		while (i.hasNext()) {
			try {
				InteractiveProperty prop = (InteractiveProperty) i.next();
				interactiveProperties.add(prop);
			} catch (ClassCastException exc) {
				/* 
				 * caught to be ignored, so that non-interactive properties
				 * won't be shown in the GUI
				 */
			}
		}
		return interactiveProperties;
	}

	/**
	 * Returns the number of columns in the table.
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	public int getColumnCount() {
		return PropertyTableModel.columnNames.length;
	}

	/**
	 * Returns the number of rows in the table.
	 * @see javax.swing.table.TableModel#getRowCount()
	 */
	public int getRowCount() {
		if (values == null)
			return 0;
			
		return values.length;
	}

	/**
	 * Retrieves the value at the specified row and column.
	 * @see javax.swing.table.TableModel#getValueAt(int, int)
	 */
	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex == 0)
			return ((Property) properties.elementAt(rowIndex)).getName();
		else
			return values[rowIndex];
	}
	
	/**
	 * Retrieves the name of the specified column.
	 * @see javax.swing.table.TableModel#getColumnName(int)
	 */
	public String getColumnName(int column) {
		if ((column >= 0) && (column < this.getColumnCount()))
			return columnNames[column];
		return null;
	}

	/**
	 * Retrieves the property at the given row.
	 * @param row the row of the desired property
	 * @return the requested property
	 */
	public InteractiveProperty getPropertyAtRow(int row) {
		if ((row >= 0) && (row < getRowCount()))
			return ((InteractiveProperty) properties.elementAt(row));
		return null;
	}
	
	/**
	 * Returns true if a cell is editable, false otherwise
	 * @see javax.swing.table.TableModel#isCellEditable(int, int)
	 */
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex == 0)
			return false;
		return true;
	}

	/**
	 * Sets a value to the given row and column, if that cell is editable.
	 * @see javax.swing.table.TableModel#setValueAt(java.lang.Object, int, int)
	 */
	public void setValueAt(Object value, int rowIndex, int columnIndex) {
		if ((rowIndex >= 0 && rowIndex < getRowCount()) &&
			(columnIndex >= 0 && columnIndex < getColumnCount())) {
			
			if (columnIndex == 1)
				values[rowIndex] = (String) value;
				
			fireTableCellUpdated(rowIndex,columnIndex);
		}
	}
}