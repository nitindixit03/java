import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        reverse(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp;

        while (start < end) {
           
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}

