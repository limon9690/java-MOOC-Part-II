
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        while (true) {
            int value = Integer.valueOf(scanner.nextLine());

            if (value < 0) {
                break;
            }

            list.add(value);
        }

        list.stream()
            .filter(val -> (val >= 1 && val <= 5))
            .forEach(val -> System.out.println(val));

    }
}
