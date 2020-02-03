package ClassExercise;

public class SelectionSortTest {

    public static void main(String[] args) {

        int[] numbers1 = {63, 9, 45, 72, 27, 18, 54, 36};
        selectionSort(numbers1);

        int[] numbers2 = {37, 29, 19, 48, 23, 55, 74, 12};
        selectionSort(numbers2);


    }

    // Rearranges the elements of a into sorted order using
// the selection sort algorithm.
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            // find index of smallest remaining value
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            // swap smallest value its proper place, a[i]
            swap(a, i, min);
        }
    }


    public static void swap(int[] a, int i, int j) {
        if (i != j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

}
