
/**
 * Gurinder Singh
 * 1152715
 * 10/4/18
 * 
 */
public class Recursive
{
   public static int arr[] = {1,6,4};
   public static int array[] = {11,1,2,11,11,6};
   
   public static boolean array6(int[] nums, int i)
   {
       if(i >= nums.length)
        return false;
        
       if (nums[i] ==6)
            return true;
       else 
            return array6(nums,i+1); 
   }
   
   public static int array11(int [] array1, int j)
   {
       if(j > array1.length-1)
            return 0;
 
       if(array1[j] == 11)
            return 1 + array11(array1, j+1);
       else 
            return array11(array1,j+1); 
   }
   
   public static String allStar(String hello){
        if (hello.length() < 2){
            return hello;
        }
        else
            return hello.substring(0,1) + "*" + allStar(hello.substring(1));
    }
    
   public static void main()
   {
       System.out.println(array6(arr, 0));
       System.out.println(array11(array, 0));
       System.out.print(allStar("hello")); 
    }
}

