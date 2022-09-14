
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]: ");
        int examGrades = Integer.valueOf(scan.nextLine());
        if (examGrades < 0) {
            System.out.println("Grade: impossible!");
        } else if (examGrades < 50) {
            System.out.println("Grade: failed");
        } else if (examGrades < 60) {
            System.out.println("Grade: 1");
        } else if (examGrades < 70) {
            System.out.println("Grade: 2");
        } else if (examGrades < 80) {
            System.out.println("Grade: 3");
        } else if (examGrades < 90) {
            System.out.println("Grade: 4");
        } else if (examGrades < 101) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }

    }
}
