
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstInp = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondInt = Integer.valueOf(scanner.nextLine());

        System.out.println(firstInp + " + " + secondInt + " = " + (firstInp + secondInt));


    }
}
