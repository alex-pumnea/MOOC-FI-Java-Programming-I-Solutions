
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String inpVal = scanner.nextLine();
            if (inpVal.isEmpty()) {
                break;
            }
            String[] splittedStr = inpVal.split(" ");
            for (String word : splittedStr) {
                System.out.println(word);
            }

        }
    }
}
