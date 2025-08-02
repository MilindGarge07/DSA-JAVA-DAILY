public class first_occurence {

    public static int F_Occurrence(int[] arr, int key, int i)
    {
        if(i == arr.length-1)
        {
            return -1; // Key not found
        }

        if(arr[i] == key)
        {
            return i;
        }

        return F_Occurrence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 9, 4, 5, 6, 7, 8, 9};

        System.out.println(F_Occurrence(arr,10 , 0) != -1 ? "First occurrence is at index: " + F_Occurrence(arr, 9, 0) : "Key not found");
    }
    
}
