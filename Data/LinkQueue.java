/**
 * Gurinder Singh
 * 1152715
 * 10/1/18
 *
 */
class LinkQueue extends FirstLastList
{
    private FirstLastList theList;
    //--------------------------------------------------------------
    public LinkQueue()                // constructor
    { 
        theList = new FirstLastList(); }  // make a 2-ended list
    //--------------------------------------------------------------
    public boolean isEmpty()          // true if queue is empty
    { 
        return theList.isEmpty(); }
    //--------------------------------------------------------------
    public void insert(long j)        // insert, rear of queue
    { theList.insertLast(j); }
    //--------------------------------------------------------------
    public Link remove()              // remove, front of queue
    {  return theList.deleteFirst();  }
    //--------------------------------------------------------------
    public void displayQueue()
    {
        System.out.print("Queue (front-->rear): ");
        theList.displayList();
    }
    
    public Object last()
    {
        if(isEmpty())
            return null;
        return theList.getLast();
        
    }
        
    public void append(LinkQueue queue)
    {
      if(theList.isEmpty())
        return;
      theList.getlast().next=queue.theList.first();
      theList.setLast(queue.getlast());
    }
    //--------------------------------------------------------------
}  // end class LinkQueue
////////////////////////////////////////////////////////////////
