
/**
 * Gurinder Singh
 * 1152715
 * 9/22/18
 * @version (a version number or a date)
 */
class StackApp
{
    public static void main(String[] args)
    {
        StackX theStack = new StackX(5);  // make new stack
        StackX stack2 = new StackX(3);
        StackX merStack = new StackX(8);
        StackX removeStack = new StackX(10);

        removeStack.push(1);
        removeStack.push(2);
        removeStack.push(3);
        removeStack.push(4);
        removeStack.push(5);

        theStack.push(1);               // push items onto stack
        theStack.push(2);
        theStack.push(3);
        theStack.push(4);
        theStack.push(5);

        stack2.push(6);
        stack2.push(7);
        stack2.push(8);

        System.out.println("This prints the removeDownTO method");
        theStack.removeDownTo(removeStack, 3);
        System.out.println();
        System.out.println("This prints the transfer method");
        theStack.transfer(theStack, stack2);

    }  // end main()
}  // end class StackApp
////////////////////////////////////////////////////////////////