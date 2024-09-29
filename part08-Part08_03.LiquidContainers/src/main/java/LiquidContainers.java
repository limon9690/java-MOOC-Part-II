
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int capacity = 100;


        while (true) {
            System.out.println("First: " + first + "/" + capacity);
            System.out.println("Second: " + second + "/" + capacity);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String cmd = parts[0];
            int amount = Integer.valueOf(parts[1]);


            // Move Amount
            if (cmd.equals("move")) {
                if (amount < 0) continue;

                if (amount > first) {
                    if (second + first > capacity) {
                        second = capacity;
                    } else {
                        second += first;
                    }
                    first = 0;
                } else {
                    second += amount;
                    first -= amount;
                    if (second > capacity) second = capacity;
                }
            }

            
            // Remove Amount
            if (cmd.equals("remove")) {
                if (amount < 0) continue;

                if (amount > second) {
                    second = 0;
                } else {
                    second -= amount;
                }

            }


            // Add Amount
            if (cmd.equals("add")) {
                if (amount > 0) {
                    if (first + amount > capacity) {
                    first = capacity;
                    } else {
                    first += amount;
                    }
                }
            }

        }
    }

}
