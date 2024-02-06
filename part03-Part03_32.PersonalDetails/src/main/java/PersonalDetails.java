
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length, longest = 0;
        int year = 0;
        int count = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] word = input.split(",");
            length = word[0].length();
            if (length > longest) {
                longest = length;
                name = word[0];
            }
            year += Integer.valueOf(word[1]);
            count++;
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * year / count);
    }
}
