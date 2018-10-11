////////////////////////////////////////////////////////////////
/**
 * Gurinder Singh
 * 1152715
 * 9/26/18
 */
class LinkListApp
{
    public static void main(String[] args)
    {
        LinkList theList = new LinkList();  // make new list        
        
        theList.insertFirst(22);      // insert four items
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);
        theList.insertFirst(44);
        theList.insertFirst(30);
        theList.insertFirst(16);
        theList.insertFirst(44);
        theList.insertFirst(30);
        //System.out.print("List (first-->last): ");
        
        System.out.println("Original List");
        theList.displayList();              // display list
        System.out.println();
        theList.remove(44);
        System.out.println("List without any 44");
        theList.displayList();
        
        
        /*while( !theList.isEmpty() )         // until t's empty,
        {
            Link lnk = theList.deleteFirst();   // delete link
            System.out.print("\nDeleted ");         // display it
            lnk.displayLink();
        }
        System.out.println();
        theList.displayList();  */            // display list
        
    }  // end main()
}  // end class LinkListApp
////////////////////////////////////////////////////////////////
