
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        float sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            if (input < 0) {
                System.out.println("Cannot calculate the average");
                continue;
            }
            num = num + 1;
            sum = sum + input;

        }
        System.out.println("Average of the numbers: " + (sum / num));

    }
}
