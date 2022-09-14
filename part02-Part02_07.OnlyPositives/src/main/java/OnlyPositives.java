
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int inpNum = Integer.valueOf(scanner.nextLine());

            if (inpNum == 0) {
                break;
            }

            if (inpNum < 0) {
                System.out.println("Unsuitable number");
                continue;
            }

            if (inpNum > 0) {
                inpNum = inpNum * inpNum;
                System.out.println(inpNum);
            }
        }
    }
}