
/**
 * Gurinder Singh
 * 1152715
 * 9/11/18
 */
class HighArrayApp
{
    public static void main(String[] args)
    {
        int maxSize = 100;            // array size
        HighArray arr;                // reference to array
        arr = new HighArray(maxSize); // create the array
        HighArray sortedArr;          
        sortedArr = new HighArray(maxSize);   // creating a sorted Array 

        arr.insert(77);               // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();                // display items
        int searchKey = 35;           // search for item
        if( arr.find(searchKey) )
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.delete(00);               // delete 3 items
        arr.delete(55);
        arr.delete(99);

        arr.display();                // display items again
        System.out.println();
        arr.getMax();                 // Display's the MAX value in array

        arr.removeMax();              // Remove's Max Value in Array    
        System.out.println();
        System.out.println("Array without Max Value");
        arr.display();
        System.out.println();

        int lengthArr = arr.elements(); // length of Array

        for (int i = 0; i < lengthArr; i++)
        {
            long maxEle = arr.removeMax();
            sortedArr.insert(maxEle);
        }
        System.out.println("Inversely sorted Array");
        sortedArr.display();
    }  // end main()
}  // end class HighArrayApp