

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int start = 3;
        int end = 6;
        int ans = searchInRange(arr, target, start, end);
        System.out.println(ans);
    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0 || start > end || start < 0 || end >= arr.length) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;  // Return -1 if the target is not found within the range
    }
}

