import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scan.nextLine();
            if (command.equals("stop")) {
                break;
            }
            processInput(command);
        }
    }

    private void processInput(String input) {
        if (input.equals("add")) {
            add();
        } else if (input.equals("list")) {
            list();
        } else if (input.equals("remove")) {
            remove();
        }
    }

    private void add() {
        System.out.print("To add: ");
        String task = this.scan.nextLine();
        this.list.add(task);
    }

    private void list() {
        this.list.print();
    }

    private void remove() {
        System.out.print("Which one is removed? ");
        int indxRemove = Integer.valueOf(this.scan.nextLine());
        this.list.remove(indxRemove);
    }

}
