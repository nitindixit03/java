
import java.util.Scanner;

public class Array{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = in.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = in.nextInt();

        int[][] matrix= new int[rows][columns];

        System.out.println("Enter the elements in an array: ");

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("Matrix: ");

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        in.close();

    }
}