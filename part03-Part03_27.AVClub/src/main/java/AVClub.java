
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                return;
            }
            String[] partsArr = input.split(" ");
            for(String part : partsArr){
                if(part.contains("av")){
                    System.out.println(part);
                }
            }
        }


    }
}
