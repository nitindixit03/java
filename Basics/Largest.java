package Basics;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("enter three number to check which one is largest: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a>b && b>c){
            System.out.println("The lagrest number is " + a);
        }
        else if(b>c && b>a){
            System.out.println("The lagrest number is " + b);
        }
        else{
            System.out.println("The lagrest number is " + c);
        }
        in.close();
    }
}
