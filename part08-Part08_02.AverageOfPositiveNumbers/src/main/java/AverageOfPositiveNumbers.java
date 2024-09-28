import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveNumCounter = 0;
        int sum = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            if (input > 0) {
                sum += input;
                positiveNumCounter++;
            }
        }

        if (positiveNumCounter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / (double) positiveNumCounter);
        }

    }
}
