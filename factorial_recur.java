public class factorial_recur {
 
    public static int Factorial_recur(int n){
        if(n == 0)
        {
            return 1;
        }
        
        int fn = n * Factorial_recur(n-1);
        return fn;
    }
    public static void main(String[] args) { 
        int n=5;
        System.out.println(Factorial_recur(n));
    }
}
