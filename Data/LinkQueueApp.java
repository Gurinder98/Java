/**
 * Gurinder Singh
 * 1152715
 * 10/1/18
 *
 */
class LinkQueueApp
   {
   public static void main(String[] args)
      {
      LinkQueue theQueue = new LinkQueue();
      LinkQueue queue = new LinkQueue();
      System.out.println("Original List");
      theQueue.insert(20);                 // insert items
      theQueue.insert(40);
      theQueue.insert(60);                 // insert items
      theQueue.insert(80);

      theQueue.displayQueue();             // display queue
      
      System.out.println("Second List");
      queue.insert(1);
      queue.insert(2);
      queue.insert(3);
      
      queue.displayQueue();
      
      System.out.println();
      Object ele = theQueue.last();
      System.out.println("The last element in List 1: " + ele);
      System.out.println();
      System.out.println("Appending List 1 and 2");
      theQueue.append(queue);
      theQueue.displayQueue();
      
      
      //theQueue.remove();                   // remove items
      //theQueue.remove();

      //theQueue.displayQueue();             // display queue
      //System.out.println(theQueue.last());
      //theQueue.last();
      //theQueue.displayQueue();
      //theQueue.displayQueue();
      }  // end main()
   }  // end class LinkQueueApp
////////////////////////////////////////////////////////////////
