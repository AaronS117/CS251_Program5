import java.util.Arrays;

public class DynArray
{
    // Mandatory Instance variables
    private double[] array;
    private int size;
    private int nextIndex;

    // Constructor
    public DynArray()
    // set array to a new array of double, of size one
    // set size to one,
    // and set nextIndex to zero.
    {
        array = new double[1];
        size = 1;
        nextIndex = 0;
    }

    // Accessor
    public int arraySize()
    // return the value of size.
    {
        return size;
    }

    // accessor
    public int elements()
    // return the value of nextIndex.
    {
        return nextIndex;
    }

    // accessor
    public double at(int index)
    // if 0 <= index < nextIndex
    // return the value of array[index].
    // else
    // return Double.NaN.
    {
        if(0 <= index && index < nextIndex)
            return array[index];
        else
            return Double.NaN;
    }

    private void grow()
    // make array a reference to an array that is twice as large
    // and contains the same values for indices 0 through
    // nextIndex - 1, and adjust size appropriately.
    {
        if(nextIndex == size)
        {
            array = Arrays.copyOf(array, size * 2);
            size = size *2;
        }
    }

    private void shrink()
    // make array a reference to an array that is half as large
    // and contains the same values for indices 0 through
    // nextIndex - 1, and adjust size appropriately.
    {
        int halfSize = size / 2;
        if(nextIndex != 0)
            if(nextIndex <= (halfSize))
            {
                array = Arrays.copyOf(array, halfSize);
                size = halfSize;
            }
    }

    // mutator
    public void insertAt(int index, double value)
    // if 0 <= index <= nextIndex
    // move the necessary values over one so that value can
    // be inserted at the location index in the array, inserts
    //  value at the location index, and adjust nextIndex
    // appropriately.
    // Note a grow() may be necessary before or after.
    // else
    // do nothing.
    {
        if(0 <= index && index <= nextIndex)
        {
            grow();
            if (nextIndex - index >= 0) System.arraycopy(array, index, array, index + 1, nextIndex - index);
        }
        array[index] = value;
        nextIndex++;
    }

    // mutator
    public void insert(double value)
    // insert value at location nextIndex.
    {
        grow();
        array[nextIndex] = value;
        nextIndex++;
    }

    // mutator
    public double removeAt(int index)
    // if 0 <= index < nextIndex
    // move the necessary values over one as to eliminate
    // the value at the location index in the array, adjust
    // nextIndex appropriately, and return the value that was
    // at the location index .
    // Note: a shrink() may be necessary before or after.
    // else
    // return Double.NaN.
    {
        if(index >=0 && index < nextIndex)
        {
            double value = at(index);
            shrink();
            if (nextIndex - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, nextIndex - 1 - index);
            nextIndex--;
            return value;
        }
        else
            return Double.NaN;
    }

    // mutator
    public double remove()
    // return the removal of the value at location nextIndex-1.
    {
        shrink();
        double value = at(nextIndex - 1);
        --nextIndex;
        if(nextIndex == -1)
            nextIndex = 0;
        return value;
    }

    // accessor
    public void printArray()
    // prints the values of all occupied locations of the array to
    // the screen
    {
        for(int i = 0; i < nextIndex; i++)
            System.out.printf("\narray.at(%d) = %.2f", i, array[i]);
    }
}