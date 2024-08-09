import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i = 0;
        while(i< arr.length){
            int CorrectIdx = arr[i] -1;
            if(arr[i] != arr[CorrectIdx]){
                swap(arr,i,CorrectIdx);
            }
            else{
                i++;
            }
        }
    }
        static void swap(int[] nums, int i, int CorrectIdx){
            int temp = nums[i];
            nums[i] = nums[CorrectIdx];
            nums[CorrectIdx] = temp;
        
    }
}
