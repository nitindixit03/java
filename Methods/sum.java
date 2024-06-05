package Methods;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        sum();
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a: ");
        int a = in.nextInt();
        System.out.println("enter b: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("sum is: " + sum);
    }
}
