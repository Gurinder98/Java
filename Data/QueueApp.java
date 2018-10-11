/**
 * Gurinder Singh
 * 1152715
 * 9/22/18
 * @version (a version number or a date)
 */
class QueueApp
{
    public static void main(String[] args)
    {
        Queue theQueue = new Queue(5);  // queue holds 5 items
        Queue Queue2 = new Queue(5);

        Queue2.insert(40);
        Queue2.insert(50);
        Queue2.insert(60);
        Queue2.insert(70);
        Queue2.insert(80);

        theQueue.insert(10);            // insert 4 items
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);

        theQueue.remove();              // remove 3 items
        theQueue.remove();              //    (10, 20, 30)
        theQueue.remove();

        theQueue.insert(50);            // insert 4 more items
        theQueue.insert(60);            //    (wraps around)
        theQueue.insert(70);
        theQueue.insert(80);

        System.out.println("This method removes and prints the element behind front");
        theQueue.removeSecond(Queue2);
        System.out.println();
        System.out.println("This prints the reversed Queue");
        theQueue.reverse(theQueue);

        
        
    }  // end main()
}  // end class QueueApp
////////////////////////////////////////////////////////////////
