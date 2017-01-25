package tccrouter.diamante.core.util;

import java.util.Collection;
import java.util.Iterator;

public class Matrix
    implements Collection
{

    Object data[][];
    int rowCount;
    int columnCount;
    int length;
    static byte MIN_SIZE = 16;

    public Matrix()
    {
        length = MIN_SIZE;
        data = new Object[length][length];
        rowCount = columnCount = 0;
        for(int i = 0; i < length; i++)
        {
            for(int j = 0; j < length; j++)
            {
                data[i][j] = null;
            }

        }

    }

    public int size()
        throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException("Use getRowCount() and getColumnCount() instead.");
    }

    public int getRowCount()
    {
        return rowCount;
    }

    public int getColumnCount()
    {
        return columnCount;
    }

    public void clear()
    {
        data = null;
        System.gc();
        columnCount = 0;
        rowCount = 0;
        length = MIN_SIZE;
        data = new Object[MIN_SIZE][MIN_SIZE];
        for(int i = 0; i < length; i++)
        {
            for(int j = 0; j < length; j++)
            {
                data[i][j] = null;
            }

        }

    }

    public boolean isEmpty()
    {
        return rowCount == 0 || columnCount == 0;
    }

    public Object[] toArray()
        throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException("Use toBidimensionalArray() instead.");
    }

    public Object[][] toBidimensionalArray()
    {
        return (Object[][])data.clone();
    }

    public boolean add(Object arg0)
        throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException("Use add(int,int,java.lang.Object) instead.");
    }

    public void add(int row, int column, Object obj)
    {
        if(row > rowCount)
        {
            rowCount = row + 1;
        }
        if(column > columnCount)
        {
            columnCount = column + 1;
        }
        data[row][column] = obj;
    }

    public boolean contains(Object obj)
    {
        for(int i = 0; i < rowCount; i++)
        {
            for(int j = 0; j < columnCount; j++)
            {
                if(obj == data[i][j])
                {
                    return true;
                }
            }

        }

        return false;
    }

    public boolean remove(Object obj)
    {
        for(int i = 0; i < rowCount; i++)
        {
            for(int j = 0; j < columnCount; j++)
            {
                if(obj == data[i][j])
                {
                    data[i][j] = null;
                    return true;
                }
            }

        }

        return false;
    }

    public void removeElementAt(int i, int j)
    {
        data[i][j] = null;
    }

    public boolean addAll(Collection arg0)
    {
        return false;
    }

    public boolean containsAll(Collection arg0)
    {
        return false;
    }

    public boolean removeAll(Collection arg0)
    {
        return false;
    }

    public boolean retainAll(Collection arg0)
    {
        return false;
    }

    public Iterator iterator()
    {
        return null;
    }

    public Object[] toArray(Object arg0[])
        throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException("Use toBidimensionalArray() instead.");
    }

    public Object elementAt(int i, int j)
    {
        return data[i][j];
    }

    public void setElementAt(Object elem, int i, int j)
    {
        data[i][j] = elem;
    }

}
