
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();

            if (row.equals("end")) {
                break;
            }

            list.add(row);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String cmd = scanner.nextLine();

        if (cmd.equals("p")) {
            double averageP = list.stream()
                              .mapToInt(num -> Integer.valueOf(num))
                              .filter((num) -> num > 0)
                              .average()
                              .getAsDouble();
            System.out.println("Average of the positive numbers: " + averageP);
        } else {
            double averageN = list.stream()
                              .mapToInt(num -> Integer.valueOf(num))
                              .filter(num -> num < 0)
                              .average()
                              .getAsDouble();
            System.out.println("Average of the positive numbers: " + averageN);
        }

    }
}
