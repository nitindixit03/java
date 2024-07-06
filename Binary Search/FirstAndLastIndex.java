public class FirstAndLastIndex {
    public static void main(String[] args){
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int[] result = findRange(arr,target);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
    public static int[] findRange(int[] arr, int target){
        int[] result = {-1,-1};
        result[0] = findFirst(arr,target);
        result[1] = findSecond(arr,target);
        return result;
    }
    public static int findFirst(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int firstOccurrence = -1;

        while(left<=right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                firstOccurrence = mid;
                right = mid-1;
            }
            else if(arr[mid]<target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return firstOccurrence;
    }

    public static int findSecond(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int lastOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                lastOccurrence = mid;
                left = mid + 1; // Continue searching to the right
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lastOccurrence;
    }
}
