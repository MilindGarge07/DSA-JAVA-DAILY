public class sum_natural {

    public static int sumnatural_recur(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + sumnatural_recur(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Sum of first " + n + " natural numbers is: " + sumnatural_recur(n));
    }
    
}
