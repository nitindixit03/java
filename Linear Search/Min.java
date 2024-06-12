

public class Min {
    public static void main(String[] args){
        int[] arr = {10,20,3,40,50,60,70,80,100};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
