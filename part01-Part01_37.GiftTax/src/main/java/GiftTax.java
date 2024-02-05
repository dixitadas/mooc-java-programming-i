
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int amt = Integer.valueOf(scan.nextLine());

        if (amt < 5000) {
            System.out.println("No tax!");
        } else if (amt >= 5000 & amt < 25000) {
            System.out.println("Tax: " + (100 + (amt - 5000) * 0.08));
        } else if (amt >= 25000 & amt < 55000) {
            System.out.println("Tax: " + (1700 + (amt - 25000) * 0.10));
        } else if (amt >= 55000 & amt < 200000) {
            System.out.println("Tax: " + (4700 + (amt - 55000) * 0.12));
        } else if (amt >= 200000 & amt < 1000000) {
            System.out.println("Tax: " + (22100 + (amt - 200000) * 0.15));
        } else if (amt >= 1000000) {
            System.out.println("Tax: " + (142100 + (amt - 1000000) * 0.17));
        }

    }
}
