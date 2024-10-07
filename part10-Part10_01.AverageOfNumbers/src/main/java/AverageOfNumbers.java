
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

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

        double average = list.stream()
                        .mapToInt(num -> Integer.valueOf(num))
                        .average()
                        .getAsDouble();

        System.out.println("average of the numbers: " + average);

    }
}
