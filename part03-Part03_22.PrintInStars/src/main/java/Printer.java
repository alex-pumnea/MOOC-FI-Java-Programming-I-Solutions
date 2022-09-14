
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int num : array){
            printStart(num);
            System.out.println();
        }
    }

    public static void printStart(int howMany) {
        for(int i = howMany; i > 0; i--){
            System.out.print("*");
            
        }
    }

}
