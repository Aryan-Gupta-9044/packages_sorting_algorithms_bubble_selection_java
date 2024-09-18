import bubblesort.BubbleSort;
import selectionsort.SelectionSort;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        int[] array1 = {6, 2, 1, 3, 4};
        int[] array2 = {6, 2, 1, 3, 4};

        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();

        System.out.println("Given Array: " + Arrays.toString(array1));

        // Sorting using Bubble Sort
        bubbleSort.sort(array1);
        System.out.println("Bubble Sort: " + Arrays.toString(array1));

        // Sorting using Selection Sort
        selectionSort.sort(array2);
        System.out.println("Selection Sort: " + Arrays.toString(array2));
    }
}
