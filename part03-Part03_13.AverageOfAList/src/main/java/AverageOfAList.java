
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while(true){
            int inpNum = Integer.valueOf(scanner.nextLine());
            if(inpNum == -1){
                break;
            }
            nums.add(inpNum);
        }
        int sum = 0;
        for (Integer integer : nums) {
            sum += integer;
        }
        System.out.println("Average: " + (double) sum / nums.size());
    }
}
