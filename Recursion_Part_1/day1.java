public class day1{

    public static void printf_Decreasing(int n)
    {
        if(n==1)
        {
            System.out.print(" "+n);
            return;
        }
        
        System.out.print(" "+n);
         printf_Decreasing(n-1);
       
    }

    public static void printf_Increasing(int n)
    {
        if(n==1)
        {
            System.out.print(" "+n);
            return;
        }
        
        
         printf_Increasing(n-1);
         System.out.print(" "+n);
       
    }


    


    public static void main(String arg[])
    {
        // printf_Decreasing(5);

        // System.out.println("\n");

        // printf_Increasing(10);

       
    }
} 