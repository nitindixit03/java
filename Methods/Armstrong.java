import java.util.Scanner;

public class Armstrong {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number to check Armstrong: ");
        int num = in.nextInt();
        boolean ans = isArmstrong(num);
        System.out.println(ans);
        in.close();
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int LastDigit = n%10;
            int answer= LastDigit*LastDigit*LastDigit;
            sum = sum + answer;
            n = n/10;
        }
        if(sum == original){
            return true;
        }
        return false;
    }
}




// public class Armstrong {
//     public static void main(String[] arg) {
        
//         for(int i = 100 ; i<=1000 ; i++){
//             if(isArmstrong(i)){
                
//                 System.out.println(i + " ");
                
//             }
//         }
//     }    
    

//     static boolean isArmstrong(int n) {
//         int original = n;  // num stores the original value of n
//         int sum = 0;
//         while (n > 0) {
//             int lastDigit = n % 10;  // Get the last digit
//             sum += lastDigit * lastDigit * lastDigit;  // Add the cube of the last digit to the sum
//             n /= 10;  // Remove the last digit
//         }
//         // Compare the sum of the cubes of the digits to the original number
//        if(sum == original){
//            return true;
//        }
//        return false;
//     }  
// } 