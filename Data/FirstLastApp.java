
/**
 * Gurinder Singh
 * 1152715
 * 9/26/18
 */
public class FirstLastApp
{
    public static void main(String[] args)
    {
        FirstLastList a = new FirstLastList();
        FirstLastList b = new FirstLastList();
        
        
        Link heada = a.insertFirst(1);
        heada = a.insertFirst(8);
        heada = a.insertFirst(5);
        
        Link headb = null;
        
        headb = b.insertFirst(9);
        headb = b.insertFirst(3);
        headb = b.insertFirst(4);
        System.out.println("This is List 1");
        a.displayList();
        System.out.println("This is List 2");
        b.displayList();
        
        
        System.out.println();
        System.out.println("This is the merged list");
        a.merge(heada,headb);
        a.displayList();
        
    }
}
