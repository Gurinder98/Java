
/**
 * Gurinder Singh
 * 1152715
 * 9/15/18
 */
// bubbleSort.java
// demonstrates bubble sort
// to run this program: C>java BubbleSortApp
////////////////////////////////////////////////////////////////
class ArrayBub
{
    private long[] a;                 // ref to array a
    private int nElems;               // number of data items
    //--------------------------------------------------------------
    public ArrayBub(int max)          // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }
    //--------------------------------------------------------------
    public void insert(long value)    // put element into array
    {
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }
    //--------------------------------------------------------------
    public void display()             // displays array contents
    {
        for(int j=0; j<nElems; j++)       // for each element,
            System.out.print(a[j] + " ");  // display it
        System.out.println("");
    }
    //-------------------------------------------------------------- 
    public void bubbleSort()
    {
        int out, in;

        for(out=nElems-1; out>1; out--)   // outer loop (backward)
            for(in=0; in<out; in++)        // inner loop (forward)
                if( a[in] > a[in+1] )       // out of order?
                    swap(in, in+1);          // swap them
        for(out=0; out < nElems; out++)
            for(in=nElems-2; in>=0; in--)
                if(a[in+1]<a[in])
                    swap(in+1, in);
    }  // end b
    //--------------------------------------------------------------
    private void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void bubbleSort2( ArrayBub items, int size)
    {
        for(int outIdx = size-1; outIdx >=1; outIdx --)
        {
            moveMaxToEnd(items, outIdx);
        }
    }  
    
    private void moveMaxToEnd(ArrayBub items, int end)
    {
         for(int j=0; j<end; j++)
            if(items.a[j] > items.a[j+1])
                swap(j, j+1);        
    }
}////////////////////////////////////////////////////////////////
