import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int maxValue = findMax(arr);

        System.out.println("The maximum value in the array is: " + maxValue);

        in.close();
    }

    // Method to find the maximum value in an array
    static int findMax(int[] arr) {
        int max = arr[0]; // Assume the first element is the max initially

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }

        return max;
    }
}

