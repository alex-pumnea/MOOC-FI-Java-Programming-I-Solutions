
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYears = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] parts = input.split(",");
            names.add(parts[0]);
            birthYears.add(Integer.valueOf(parts[1]));

        }
        String longest = names.get(0);
        for(String name : names){
            if(name.length() > longest.length()){
                longest = name;
            }
        }
        System.out.println("Longest name:" + longest);

        int sumOfBirthYears = 0;
        for(int year : birthYears){
            sumOfBirthYears += year;
        }
        System.out.println("Average of the birth years: " + (double) sumOfBirthYears / birthYears.size());

    }
}
