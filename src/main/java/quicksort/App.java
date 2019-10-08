package quicksort;

public class App {
    public static void main(String[] args) {
        int[] array = new int[] { 420, 69, 1337, 4, 6, 2, 5, 7, 8, 1, 19, 42, 12, 0, -6, -9 };

        Quicksort.quicksort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }   
}
