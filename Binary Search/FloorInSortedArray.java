//largest element in the array that is less than or equal to the target value.

public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 10, 10, 15, 19};
        int target = 7;
        int floorValue = floor(arr, target);
        System.out.println("Floor value of " + target + " is " + (floorValue != -1 ? floorValue : "Not Found"));
    }

    public static int floor(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right >= 0 ? arr[right] : -1;
    }
}

