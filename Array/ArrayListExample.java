import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.set(0,99);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        // taking

        System.out.println("enter the 5 elements: ");
        for(int i = 0; i<5; i++){
            list.add(in.nextInt());
        }
        for(int i = 0; i<5; i++){
            System.out.print(list.get(i));
        }
        System.out.println(list);
    }
}