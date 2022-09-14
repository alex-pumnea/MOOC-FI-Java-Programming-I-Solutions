
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstInp = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondInt = Integer.valueOf(scanner.nextLine());

        System.out.println("The average is " + (double) (firstInp + secondInt) / 2);

    }
}
