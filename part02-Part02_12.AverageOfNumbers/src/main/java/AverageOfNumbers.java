
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int inpNum = Integer.valueOf(scanner.nextLine());
            if(inpNum == 0){
                break;
            }
            count += 1;
            sum += inpNum;
        }
        System.out.println("Average of the numbers: " + (double)sum / count);

    }
}
