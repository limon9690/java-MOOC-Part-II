import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private BookDirectory bookDirectory;


    public UI(Scanner scanner, BookDirectory bookDirectory) {
        this.scanner = scanner;
        this.bookDirectory = bookDirectory;
    }

    public void start () {
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int recAge = Integer.valueOf(scanner.nextLine());

            bookDirectory.add(new Book(title, recAge));
        }

        bookDirectory.print();
    }
    
}
