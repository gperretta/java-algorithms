/*
Selection Sort is a sorting algorithm with an O(n^2) time complexity;
it works by repeatedly selecting the smallest/largest element from 
the unsorted part of the list and moving it to the sorted part. 
*/

public class SelectionSort {

    /**
     * "Selection Sort" function
     * 
     * @param array - array to be sorted - type: int
     */
    void selectionSort(int array[]) {

        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                // If the i element is smaller than the minimum
                // then it's the new minimum
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            // Swap the found minimum element with the first one
            // by using a temp variable
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Utility function
    void printArray(int array[]) {

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("\n");
    }

    // Driver for testing
    /**
     * @param args
     */
    public static void main(String args[]) {

        SelectionSort testObjSelectionSort = new SelectionSort();

        int vector[] = { 64, 25, 12, 33, 1, 78 };

        System.out.println("Original array: ");
        testObjSelectionSort.printArray(vector);
        System.out.println("Sorting array...\n");
        testObjSelectionSort.selectionSort(vector);
        System.out.println("Array sorted: ");
        testObjSelectionSort.printArray(vector);
    }
}
