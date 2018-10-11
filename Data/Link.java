// linkList.java
// demonstrates linked list
// to run this program: C>java LinkListApp
////////////////////////////////////////////////////////////////
/**
 * Gurinder Singh
 * 1152715
 * 9/26/18
 */
class Link
{
    public long iData;              // data item
    public Link next;              // next link in list
    

    // -------------------------------------------------------------
    public Link(long id) // constructor
    {
        iData = id;                 // initialize data
        // ('next' is automatically
    }                           //  set to null)
    // -------------------------------------------------------------
    public void displayLink()      // display ourself
    {
        System.out.print("{" + iData  + "} ");
    }
    
    public void setNext(Link set)
    {
        this.next = set;
    }
    
    public Link getNext()
    {
        return next;
        
    }
}  // end class Link
