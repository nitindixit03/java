
// smallest element in the array that is greater than or equal to the target value.
public class CeilingInSortedArray {
    public static void main(String[] args){
        int[] arr = {1,2,5,8,10,10,15,19};
        int target = 7;
        int ceilingValue = ceiling( arr, target);
        System.out.println("Ceiling value of " + target + " is " + (ceilingValue!=-1 ? ceilingValue : "NotFound")); 
    }
    public static int ceiling(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
      

        while(left<=right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid]<target){
                left = mid +1;
            }
            else{
                right = mid-1;
            }
        }
        return left < arr.length ? arr[left] : -1;
    }
}
