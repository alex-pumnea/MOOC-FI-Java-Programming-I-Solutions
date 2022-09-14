
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? ");
        int finishNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Where from?");
        int startNum = Integer.valueOf(scanner.nextLine());

        for (int i = startNum; i <= finishNum; i++) {
            System.out.println(i);
        }
    }
}
