
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int secNum = Integer.valueOf(scan.nextLine());

        if (firstNum > secNum) {
            System.out.println("Greater number is: " + firstNum);
        } else if ( firstNum < secNum) {
            System.out.println("Greater number is: " + secNum);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
