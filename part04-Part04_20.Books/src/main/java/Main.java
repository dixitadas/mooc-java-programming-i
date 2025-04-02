import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Books> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            books.add(new Books(title, pages, year));
        }
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        for(Books book: books) {
            if(info.equalsIgnoreCase("everything")) {
                System.out.println(book);
            } else {
                System.out.println(book.getTitle());
            }
        }
    }
}
