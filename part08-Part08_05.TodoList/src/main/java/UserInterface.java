import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface (TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }

            if (input.equals("add")) {
                System.out.print("To add: ");
                String toAdd = scanner.nextLine();

                todoList.add(toAdd);
            }

            if (input.equals("list")) {
                todoList.print();
            }

            if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                String toRemove = scanner.nextLine();

                todoList.remove(Integer.valueOf(toRemove));
            }
        }

    }
    
}
