
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String inputFile = scanner.nextLine();
        
        try (Scanner scanner2 = new Scanner(Paths.get(inputFile));){
            while(scanner2.hasNext()){
                System.out.println(scanner2.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        

    }
}
