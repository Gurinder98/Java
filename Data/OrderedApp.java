
/**
 * Gurinder Singh
 * 1152715
 * 9/10/18
 *
 */
class OrderedApp
{
    public static void main(String[] args)
    {
        int maxSize = 100;             // array size
        OrdArray arr;                  // reference to array
        arr = new OrdArray(maxSize);   // create the array

        OrdArray arr2;
        arr2 = new OrdArray(maxSize);

        OrdArray arr3;
        arr3 = new OrdArray(maxSize);

        arr2.insert(100);               // 7 ITEMS
        arr2.insert(02);
        arr2.insert(50);
        arr2.insert(65);
        arr2.insert(10);
        arr2.insert(45);
        arr2.insert(01);

        arr.insert(77);                // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        int searchKey = 55;            // search for item
        if( arr.find(searchKey) != arr.size() )
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.display();                 // display items

        arr.delete(00);                // delete 3 items
        arr.delete(55);
        arr.delete(99);

        System.out.println("Array 1");
        arr.display();                 // display items again
        System.out.println();
        System.out.println("Array 2");
        arr2.display();
        System.out.println();

        arr3 = arr.merge(arr2);        // Merge both arrays
        System.out.println("Merged Array");
        arr3.display();                // Display merged array 

    }  // end main()
}  // end class OrderedApp
