
import java.util.Scanner;

import javax.swing.SpringLayout;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inpNum = Integer.valueOf(scanner.nextLine());
        for(int i = inpNum; i <=100; i++){
            System.out.println(i);
        }

    }
}
