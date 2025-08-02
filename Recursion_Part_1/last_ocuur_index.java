public class last_ocuur_index {


    public static int Last_occur(int[] arr, int key, int i)
    {
        if(i == arr.length)
        {
            return -1; // Key not found
        }

        int found_key = Last_occur(arr, key, i + 1);

        if(found_key == -1 && arr[i] == key)
        {
            return i;
        }

        return found_key;
    }

    public static void main(String[] args) {
        
         int[] arr= {1, 2, 3, 9, 4, 5, 6, 7, 8, 9};

         System.out.println(Last_occur(arr, 9, 0) != -1 ? "Last occurrence is at index: " + Last_occur(arr, 9, 0) : "Key not found");


    }
    
}
