
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics stats = new Statistics();
        Statistics statseven = new Statistics();
        Statistics statsodd = new Statistics();

        System.out.println("Enter numbers:");
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1) {
                break;
            }
            if(number % 2 == 0) {
                statseven.addNumber(number);
            } else {
                statsodd.addNumber(number);
            }
            stats.addNumber(number);
        }
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + statseven.sum());
        System.out.println("Sum of odd numbers: " + statsodd.sum());
    }
}