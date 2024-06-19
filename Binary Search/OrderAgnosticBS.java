import java.util.Scanner;

import java.util.Arrays;

public class OrderAgnosticBS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("enter the size of an array: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements in an array: ");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        
        System.out.print("enter the target elemrnt: ");
        int target = in.nextInt();

        int ans = orderAgnosticBS(arr,target);
        System.out.println("index of "+ target + " at " + ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target<arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return - 1;
    }
}
