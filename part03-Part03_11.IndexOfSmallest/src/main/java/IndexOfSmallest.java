
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        int smallest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int num = list.get(i);
            if (smallest > num) {
                smallest = num;
            }
        }
        System.out.println("Smallest number: " + smallest);
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }

    }
}
