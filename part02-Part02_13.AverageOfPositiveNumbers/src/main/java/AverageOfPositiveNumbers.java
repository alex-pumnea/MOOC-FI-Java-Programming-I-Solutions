
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(true){
            int inpNum = Integer.valueOf(scanner.nextLine());
            if(inpNum == 0){
                System.out.println("Cannot calculate the average");
                break;
            }
            if(inpNum > 0){
                count += 1;
                sum += inpNum;
            }
        }
        System.out.println((double) sum / count);

    }
}
