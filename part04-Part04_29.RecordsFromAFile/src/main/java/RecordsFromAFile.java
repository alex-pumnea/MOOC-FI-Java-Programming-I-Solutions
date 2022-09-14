
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNext()){
                String[] parts = fileReader.nextLine().split(",");
                if(Integer.valueOf(parts[1]) != 1){
                    System.out.println(parts[0] + ", " + "age: " + parts[1] + " years");
                } else {
                    System.out.println(parts[0] + ", " + "age: " + parts[1] + " year");
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
