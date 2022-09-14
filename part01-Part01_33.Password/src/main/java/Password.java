
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Password?");
        String inpPass = scan.nextLine();
        String contPassPhrs = "Caput Draconis";
        if (inpPass.equals(contPassPhrs)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
