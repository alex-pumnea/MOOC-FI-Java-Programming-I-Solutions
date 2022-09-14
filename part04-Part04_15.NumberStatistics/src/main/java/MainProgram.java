
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Statistics sum = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            sum.addNumber(input);

            if (input % 2 == 0) {
                evenSum.addNumber(input);
            } else {
                oddSum.addNumber(input);
            }

        }

        System.out.println("Sum: " + sum.sum());
        System.out.println("Sum of even numbers: " + evenSum.sum());
        System.out.println("Sum of odd numbers: " + oddSum.sum());
    }
}
