import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(Paths.get("data.txt"))) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}