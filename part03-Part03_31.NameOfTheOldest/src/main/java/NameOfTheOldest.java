
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, largest = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] word = input.split(",");
            age = Integer.valueOf(word[1]);

            if (age >= largest) {
                largest = age;
                name = word[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
