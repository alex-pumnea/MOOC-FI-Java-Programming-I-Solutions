
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String inpStr = String.valueOf(scan.nextLine());

        System.out.println("Give an integer:");
        Integer inpInt = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        Double inpDouble = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        Boolean inpBool = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + inpStr);
        System.out.println("You gave the integer " + inpInt);
        System.out.println("You gave the double " + inpDouble);
        System.out.println("You gave the boolean " + inpBool);

    }
}