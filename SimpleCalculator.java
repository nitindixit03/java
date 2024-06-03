import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = in.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = in.next().charAt(0);

        System.out.println("Enter the second number: ");
        double num2 = in.nextDouble();

        double result = 0;
        boolean validOperator = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                validOperator = false;
        }

        if (validOperator) {
            System.out.println("The result is: " + result);
        }
    }
}
