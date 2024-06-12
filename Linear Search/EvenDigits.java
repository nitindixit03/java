

public class EvenDigits {
    public static void main(String[] args){
        int[] nums = {10,200,30,400,50};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count ++;
            }
        }
        return count;
    }    
    static boolean even(int num){
        int numberOfDigits = digits(num);

        return numberOfDigits %2 == 0;
    }
    static int digits(int num){
        if(num<0){
            num = num *-1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
}

