import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookDirectory {
    private List<Book> directory;

    public BookDirectory() {
        this.directory = new ArrayList<>();
    }

    public void add(Book book) {
        this.directory.add(book);
    }

    public void sort() {
        Comparator<Book> comparator = Comparator
              .comparing(Book::getAge)
              .thenComparing(Book::getName);

        Collections.sort(directory, comparator);
    }

    public void print() {
        this.sort();

        System.out.println(this.directory.size() + " books in total.");
        System.out.println("");
        System.out.println("Books: ");
        this.directory.stream()
                      .forEach(b -> System.out.println(b));
    }
    
}
