
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.valueOf(scanner.nextLine());
        int end = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(start, end);
    }

    public static void divisibleByThreeInRange(int s, int e) {
        for (int i = s; i <= e; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
