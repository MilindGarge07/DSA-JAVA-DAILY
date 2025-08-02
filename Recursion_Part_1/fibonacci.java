public class fibonacci {

    public static int fibonacci_recur(int n) {
         if(n == 0)
        {
            return 0;
        }
        int fn1 = n + fibonacci_recur(n + 1);
        return fn1;
    }

    public static void main(String[] args) {
        
       System.out.println(fibonacci_recur(4));
    
 
} 
}