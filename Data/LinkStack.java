////////////////////////////////////////////////////////////////
/**
 * Gurinder Singh
 * 1152715
 * 10/1/18
 *
 */
class LinkStack extends LinkList
{
    private LinkList theList;
    
    //--------------------------------------------------------------
    public LinkStack()             // constructor
    {
        theList = new LinkList();
        
    }
    //--------------------------------------------------------------
    public void push(long j)     // put item on top of stack
    {
        theList.insertFirst(j);
    }
    //--------------------------------------------------------------
    public Link pop()            // take item from top of stack
    {
        return theList.deleteFirst();
    }
    //--------------------------------------------------------------
    public boolean isEmpty()       // true if stack is empty
    {
        return ( theList.isEmpty() );
    }
    //--------------------------------------------------------------
    public void displayStack()
    {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }
    
    public void dup()
    {
        long num = theList.getFirst();
        theList.insertFirst(num);
    }
    
    public void swap2and3()
    {
        Link pre1 = theList.first;
        Link pre2 = theList.first.getNext();
        
        Link one = pre1.getNext();
        Link two = pre2.getNext();
        
        if(pre1 != null)
            pre1.next = two;
            
        if(pre2 !=null)
            pre2.next = one;
            
        Link temp = one.getNext();
        one.next = two.next;
        two.next = temp;
    }
    //--------------------------------------------------------------
}  // end class LinkStack
