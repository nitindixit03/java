package Basics;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("enter the number: ");
        int num = in.nextInt();
        int RevNum;
        while(num>0){
            RevNum = num%10;
            System.out.print(RevNum);
            num = num/10;
        }
        // System.out.println(RevNum);
    }
}
 
