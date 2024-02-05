
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fir = Integer.valueOf(scanner.nextLine());
        int sec = Integer.valueOf(scanner.nextLine());

        if (fir > sec) {
            System.out.println(fir + " is greater than " + sec);
        } else if (sec > fir) {
            System.out.println(fir + " is smaller than " + sec);
        } else {
            System.out.println(fir + " is equal to " + sec);
        }

    }
}
