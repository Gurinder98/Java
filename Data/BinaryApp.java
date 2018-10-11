import java.util.Scanner;
/**
 * Gurinder Singh
 * 1152715
 * 9/18/18
 */
public class BinaryApp
{
    public static void main(String[] args)
    {
        StackX stack = new StackX(20);
        long num;
        Scanner scan = new Scanner(System.in);
                
        System.out.print("Enter a decimal number: ");
        num = scan.nextLong();
        while(num<0)
        {
            System.out.print("Error, Enter a postive number: ");
            num = scan.nextLong();
        }
        
        while(num >0)
        {
            long num2;
            num2=num%2;
            stack.push(num2);
            num = num/2;
        }
        
        while( !stack.isEmpty() )     // until it's empty,
         {                             // delete item from stack
         long value = stack.pop();
         System.out.print(value);      // display it
         System.out.print(" ");
         }  // end while
        
    }
}
