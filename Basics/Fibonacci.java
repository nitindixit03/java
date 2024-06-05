package Basics;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("enter the number: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int sum = 0;

        for(int i = 2; i<=n; i++){
            sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }
}
