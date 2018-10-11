/**
 * Gurinder Singh
 * 1152715
 * 10/1/18
 *
 */
class LinkStackApp
   {
   public static void main(String[] args)
      {
      LinkStack theStack = new LinkStack(); // make stack

      theStack.push(20);                    // push items
      theStack.push(40);
      theStack.push(60);                    // push items
      theStack.push(80);
      //theStack.pop();                       // pop items
      //theStack.pop();
      System.out.println("Original List");
      theStack.displayStack();              // display stack
      System.out.println();
      System.out.println("List with repeated first link");
      theStack.dup();
      theStack.displayStack();
      System.out.println();
      System.out.println("List with 2nd and 3rd links swaped");
      theStack.swap2and3();
      theStack.displayStack();
      }  // end main()
   }  // end class LinkStackApp
////////////////////////////////////////////////////////////////
