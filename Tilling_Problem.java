public class Tilling_Problem {


    public static int tile_fit(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }

        int vert = tile_fit(n - 1);

        int horz = tile_fit(n - 2);

        int total = vert + horz;
        return total;
    }

    public static void main(String[] args) {
        
        int n = 4;

        System.out.println("Number of ways to fill a 2x" + n + " rectangle with 1x2 tiles: " + tile_fit(n));


        String s="milind";
        System.out.println(s.length());
    }
    
}
