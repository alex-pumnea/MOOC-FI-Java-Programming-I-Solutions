
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number: ");
        int inpNum = Integer.valueOf(scan.nextLine());
        if (inpNum % 2 == 0) {
            System.out.println("Number " + inpNum + " is even.");
        } else {
            System.out.println("Number " + inpNum + " is odd.");
        }
    }
}
