public class print_power {

    public static int check_power(int value, int power)
    {
        if(power == 0)
        {
            return 1;
        }

        return value * check_power(value, power - 1);
    }

    public static void main(String[] args) {
        
        System.out.println(check_power(2,11 ));

    }
    
}
