
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int inpNum = Integer.valueOf(scanner.nextLine());

            if (inpNum == 0) {
                break;
            }

            count += 1;

        }

        System.out.println("Number of numbers: " + count);

    }
}
