
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int l = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int s = Integer.valueOf(scanner.nextLine());
        for (int i = s; i <= l; i++) {
            System.out.println(i);
        }
    }
}
