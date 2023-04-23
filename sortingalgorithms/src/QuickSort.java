/*
QuickSort is a sorting algorithm based on the Divide and Conquer (DAC) algorithm;
it works by  by selecting a 'pivot' from the array and partitioning the other elements 
into two sub-arrays, according to whether they are smaller or greater than the pivot.
The partition is done recursively. 
*/
public class QuickSort {

    /**
     * "Quick Sort" mainfunction
     * 
     * @param array - array to be sorted - type: int
     * @param start - starting index of the array - type: int
     * @param end   - ending index of the array - type: int
     */
    void quickSort(int array[], int start, int end) {

        if (start < end) {
            int partitioningIndex = partition(array, start, end);
            // Sort the elements before the partitioning index
            quickSort(array, start, partitioningIndex - 1);
            // Sort the elements after the partitioning index
            quickSort(array, partitioningIndex + 1, end);
        }
    }

    /**
     * @param array - array to split into 2 parts
     * @param start - smallest element of the array
     * @param end   - biggest element of the array
     * @return a partitioning index - type: int
     */
    int partition(int array[], int start, int end) {

        int pivot = array[end];
        int i = (start - 1);

        for (int j = start; j < end; j++) {
            // If current element is smaller than the pivot
            // then increment the starting index and swap
            if (array[j] <= pivot) {

                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, end);

        return i + 1;
    }

    // Utility function to swap two elements
    void swap(int array[], int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    // Utility function to print the array
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

        QuickSort testObjQuickSort = new QuickSort();

        int vector[] = { 64, 34, 25, 12, 22, 11, 90 };
        int size = vector.length;

        System.out.println("Original array: ");
        testObjQuickSort.printArray(vector);
        System.out.println("Sorting array...\n");
        testObjQuickSort.quickSort(vector, 0, size);
        System.out.println("Array sorted: ");
        testObjQuickSort.printArray(vector);
    }
}
