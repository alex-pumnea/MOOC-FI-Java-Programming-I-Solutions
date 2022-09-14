
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int inpYear = Integer.valueOf(scan.nextLine());

        if (inpYear % 4 == 0 && (inpYear % 100 != 0 || inpYear % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
