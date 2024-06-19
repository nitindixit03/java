public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {-10,-4,4,6,8,9,10,14,15,17,19};
        int target = 15;
        int ans = binarysearch(arr,target);
        System.out.println("index of "+ target + " at " + ans);
    }
    static int binarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;  
    }
}