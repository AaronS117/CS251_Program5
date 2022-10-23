public class DynArray
{
    // Mandatory Instance Variables
    private double[] array;
    private int size;
    private int nextIndex;

    // Mandatory Instance Methods

    // constructor
    public DynArray()
    // set array to a new array of double, of size one
    // set size to one,
    // and set nextIndex to zero.
    {
        array = new double[size];
        size = 1;
        nextIndex = 0;
    }

    // accessor
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
        if (0 <= index < nextIndex)
        {
            return array[index];
        }
        else
        {
            return Double.NaN;
        }
    }

    private void grow()
    // make array a reference to an array that is twice as large
    // and contains the same values for indices 0 through
    // nextIndex - 1, and adjust size appropriately.
    {
    }

    private void shrink()
    // make array a reference to an array that is half as large
    // and contains the same values for indices 0 through
    // nextIndex - 1, and adjust size appropriately.
    {
    }

    // mutator
    public void insertAt(int index, double value)
    // if 0 <= index <= nextIndex
    // move the necessary values over one so that value can
    // be inserted at the location index in the array, inserts
    // value at the location index, and adjust nextIndex
    // appropriately.
    // Note a grow() may be necessary before or after.
    // else
    // do nothing.
    {
        if (0 <= index <= nextIndex)
        {

        }
    }

    // mutator
    public void insert(double value)
    // insert value at location nextIndex.
    {
        insertAt(nextIndex, value);
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
        if (0 <= index < nextIndex)
        {
        }
        else
        {
            shrink();
        }
        return Double.NaN;
    }

    // mutator
    public double remove()
    // return the removal of the value at location nextIndex-1.
    {
        return removeAt(nextIndex - 1);
    }

    //accessor
    public void printArray()
    // prints the values of all occupied locations of the array to
    // the screen
    {
        System.out.println();
    }
}