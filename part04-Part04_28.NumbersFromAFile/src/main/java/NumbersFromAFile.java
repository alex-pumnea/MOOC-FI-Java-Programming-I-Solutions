
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNext()){
                int line = Integer.valueOf(fileReader.nextLine());
                if(!(line >= lowerBound && line <= upperBound)){
                    continue;
                }
                counter++;
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        System.out.println("Numbers: " + counter);

    }

}
