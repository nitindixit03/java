package Basics;
import java.util.Scanner; 

public class Input{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Roll No: ");
        int rollno = input.nextInt();
        System.out.println("your roll is " + rollno);

    }
}
