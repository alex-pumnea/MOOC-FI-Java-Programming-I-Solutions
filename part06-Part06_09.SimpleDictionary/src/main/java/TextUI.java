import java.util.Scanner;

public class TextUI {
    private Scanner scan;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scan, SimpleDictionary dictionary) {
        this.scan = scan;
        this.dictionary = dictionary;
    }

    public void processInput(String input) {
        if (input.equals("add")) {
            add();
        } else if (input.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    private void search() {
        System.out.print("To be translated: ");
        String searchedWord = this.scan.nextLine();
        if (this.dictionary.translate(searchedWord) == null) {
            System.out.println("Word " + searchedWord + " was not found");
        } else {
            System.out.print("Translation: " + this.dictionary.translate(searchedWord) + "\n");
        }
    }

    private void add() {
        System.out.print("Word: ");
        String word = this.scan.nextLine();
        System.out.print("Translation: ");
        String translation = this.scan.nextLine();
        dictionary.add(word, translation);
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = this.scan.nextLine();
            if (input.equals("end")) {
                break;
            }

            processInput(input);
        }
        System.out.println("Bye bye!");
    }
}
