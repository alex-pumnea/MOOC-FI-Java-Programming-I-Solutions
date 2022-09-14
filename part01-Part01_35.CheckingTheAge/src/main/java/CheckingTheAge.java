
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inpAge = Integer.valueOf(scan.nextLine());
        if (inpAge >= 0 && inpAge <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }


    }
}
