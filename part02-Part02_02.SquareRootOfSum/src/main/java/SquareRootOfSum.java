
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInp = Integer.valueOf(scanner.nextLine());
        int secondInp = Integer.valueOf(scanner.nextLine());
        System.out.println(Math.sqrt(firstInp + secondInp));

    }
}
