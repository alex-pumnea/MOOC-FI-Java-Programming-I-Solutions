import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = sc.nextLine();

            if (title.isEmpty()) {
                System.out.println();
                break;
            }

            System.out.print("Pages: ");
            int numOfPages = Integer.valueOf(sc.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(sc.nextLine());

            books.add(new Book(title, numOfPages, publicationYear));

        }

        System.out.print("What information will be printed? ");
        String infoOut = sc.nextLine();

        for (Book book : books) {
            if (infoOut.equals("everything")) {
                System.out.println(book);
            } else if (infoOut.equals("name")) {
                System.out.println(book.getTitle());
            }

        }

    }
}
