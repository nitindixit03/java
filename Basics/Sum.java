package Basics;
import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter any two nummber: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.print("sum of your two number is: " + sum);
        input.close();
    }
}
