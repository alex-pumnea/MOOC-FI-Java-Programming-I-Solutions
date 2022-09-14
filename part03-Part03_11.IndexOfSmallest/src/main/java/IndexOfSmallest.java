
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int inpNum = Integer.valueOf(scanner.nextLine());
            if (inpNum == 9999) {
                break;
            }
            nums.add(inpNum);
        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = nums.get(0);
        int index = 0;
        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
                index = i;

            }

        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + index);

    }
}
