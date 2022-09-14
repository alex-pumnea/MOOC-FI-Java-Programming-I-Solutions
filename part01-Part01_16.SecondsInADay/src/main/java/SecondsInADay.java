
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer secInDay = 24 * 3600;

        System.out.println("How many days would you like to convert to seconds?");
        int inpNumDays = Integer.valueOf(scanner.nextLine());
        System.out.println(secInDay * inpNumDays);

    }
}
