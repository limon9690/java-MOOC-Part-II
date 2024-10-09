
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookDirectory directory = new BookDirectory();
        UI ui = new UI(scanner, directory);

        ui.start();
        

    }

}
