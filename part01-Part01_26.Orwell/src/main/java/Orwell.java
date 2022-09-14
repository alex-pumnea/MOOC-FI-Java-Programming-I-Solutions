
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int inpNum = Integer.valueOf(scan.nextLine());
        if (inpNum == 1984) {
            System.out.println("Orwell");
        }
    }
}
