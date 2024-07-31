// bubble sorting-compare adjacent element and swap adjacent element.

import java.util.Arrays;

public class Sorting{
    public static void main(String[] args){
        int[] arr = {3, 1, 5, 4, 2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void bubble(int[] arr){
        for(int i = 0; i <arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}