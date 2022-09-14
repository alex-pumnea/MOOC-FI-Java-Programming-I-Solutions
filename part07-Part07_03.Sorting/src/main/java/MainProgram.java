
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = { 3, 1, 5, 99, 3, 12 };
        System.out.println("Smallest: " + smallest(array));
        System.out.println("Index of the smallest number: " + indexOfSmallest(array));

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int sm : array) {
            if (sm < smallest) {
                smallest = sm;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;

    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallest = startIndex;
        int smallest = array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexOfSmallest = indexOfSmallestFrom(array, i);

            swap(array, i, indexOfSmallest);

        }

    }

}
