
public class Main{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,10};
        int target = 5;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    } 

    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}    

