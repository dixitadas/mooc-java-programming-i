
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try {
            Scanner scan = new Scanner(Paths.get(fileName));
            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}
