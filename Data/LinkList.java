/**
 * Gurinder Singh
 * 1152715
 * 9/26/18
 */
class LinkList
{
    public Link first;            // ref to first item on list
    int size;
    public Link curr;
    // -------------------------------------------------------------
    public LinkList()              // constructor
    { 
        first = null;
        curr = null;
    }           // no items on list yet
    // -------------------------------------------------------------
    
    public boolean isEmpty()       // true if list is empty
    { 
        return (first==null); }
    // -------------------------------------------------------------
    public void insertFirst(long dd) // insert at start of list
    {                           // make new link
        Link newLink = new Link(dd);
        newLink.next = first;       // newLink --> old first
        first = newLink;            // first --> newLink
    }
    // -------------------------------------------------------------
    //public long deleteFirst()      // delete first item
    public Link deleteFirst()      // delete first item
    {                           // (assumes list not empty)
        Link temp = first;          // save reference to link
        first = first.next;         // delete it: first-->old next
        return temp;          // return deleted link
    }
    // -------------------------------------------------------------
    public void displayList()
    {
        System.out.print("List (first-->last): ");
        Link current = first;       // start at beginning of list
        while(current != null)      // until end of list,
        {
            current.displayLink();   // print data
            current = current.next;  // move to next link
        }
        System.out.println("");
    }

    public int getSize()
    {
        return size;
    }
    public int search(int num)
    {
        Link current = first;
        while(current !=null)
        {
            if(current.iData == num)
                return num;
            current = current.next;

        }
        return num;
    }

    public void remove(long key)
    {
        Link cur = first;
        if(first == null)
            return;
            
        while (first.iData == key)
        {
            first = first.next;
        }
        
        while(cur !=null)
        {
            if(cur.next == null)
                return;
            if(cur.next.iData == key)
            {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        
    }
    
    
    public long getFirst()
    {
        return this.first.iData;
        
    }
    
    public Link First()
    {
        return this.first;
        
    }
    // -------------------------------------------------------------
}  // end class LinkList
