
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while (true) {
            System.out.println("Give a number:");
            int inpNum = Integer.valueOf(scanner.nextLine());
            if (inpNum == 0) {
                break;
            }
            if (inpNum < 0) {
                counter += 1;
            }
        }
        System.out.println("Number of negative numbers: " + counter);

    }
}
