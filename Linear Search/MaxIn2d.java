import java.util.Arrays;

public class MaxIn2d {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6, 10},
            {7, 8, 9}
        };
        int ans = search(arr);
        System.out.println("Max element in the 2D array: " + ans);
    }

    static int search(int[][] arr) {
        int max = Integer.MIN_VALUE;
        
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        
        return max;
    }
}


