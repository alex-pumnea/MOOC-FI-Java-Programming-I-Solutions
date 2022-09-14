
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inpNum = Integer.valueOf(scanner.nextLine());

        if (inpNum < 0) {
            inpNum = inpNum * -1;
        }

        System.out.println(inpNum);

    }
}
