package quicksort;

public class Quicksort {
    static void quicksort(int[] array, int l, int r) {
        if (l < r) {
            int i = partition(array, l, r);
            quicksort(array, l, i - 1);
            quicksort(array, i + 1, r);
        }
    }

    static int partition(int[] array, int l, int r) {
        int pi = l + (r - l) / 2;
        int pv = array[pi];
        exchange(array, pi, r);
        int cp = l;
        for (int i = l; i <= r - 1; i++) {
            if (array[i] < pv) {
                exchange(array, i, cp);
                cp++;
            }
        }
        exchange(array, cp, r);
        return cp;
    }

    static void exchange(int[] array, int i1, int i2) {
        int tmp = array[i1];
        array[i1] = array[i2];
        array[i2] = tmp;
    }
}