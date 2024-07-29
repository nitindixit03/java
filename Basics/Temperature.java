package Basics;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("please enter temperatue in Celsius: ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("the fahrenheit temperature of " + tempC + " celsius is " + tempF +"F");
        in.close();
    }
}
