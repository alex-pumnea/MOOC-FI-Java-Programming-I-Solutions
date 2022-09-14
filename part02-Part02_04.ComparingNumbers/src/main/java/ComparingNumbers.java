
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInp = Integer.valueOf(scanner.nextLine());
        int secInp = Integer.valueOf(scanner.nextLine());

        if (firstInp > secInp) {
            System.out.println(firstInp + " is greater than " + secInp + " .");
        } else if (firstInp < secInp) {
            System.out.println(firstInp + " is smaller than " + secInp + " .");
        } else {
            System.out.println(firstInp + " is equal to " + secInp + " .");
        }

    }
}
