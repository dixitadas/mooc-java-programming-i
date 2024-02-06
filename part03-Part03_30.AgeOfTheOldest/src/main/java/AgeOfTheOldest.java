
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, largest = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] word = input.split(",");
            age = Integer.valueOf(word[1]);
            if (age >= largest) {
                largest = age;
            }
        }
        System.out.println("Age of the oldest: " + largest);
    }
}
