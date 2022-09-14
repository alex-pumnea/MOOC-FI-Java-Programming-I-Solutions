
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftVal = Integer.valueOf(scan.nextLine());
        if (giftVal < 5000) {
            System.out.println("No tax!");
        } else if (giftVal >= 5000 && giftVal <= 25000) {
            double giftTax = (100 + (giftVal - 5000) * 0.08);
            System.out.println("Tax: " + giftTax);
        } else if (giftVal >= 25000 && giftVal <= 55000) {
            double giftTax = (1700 + (giftVal - 25000) * 0.1);
            System.out.println("Tax: " + giftTax);
        } else if (giftVal >= 55000 && giftVal <= 200000) {
            double giftTax = (4700 + (giftVal - 55000) * 0.12);
            System.out.println("Tax: " + giftTax);
        } else if (giftVal >= 200000 && giftVal <= 1000000) {
            double giftTax = (22100 + (giftVal - 200000) * 0.15);
            System.out.println("Tax: " + giftTax);
        } else {
            double giftTax = (142100 + (giftVal - 1000000) * 0.17);
            System.out.println("Tax: " + giftTax);
        }

    }
}
