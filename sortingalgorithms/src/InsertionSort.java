/*
Insertion Sort is a simple sorting algorithm that works by repeatedly comparing pair
of elements and virtually splitting the array in a sorted sub-array and ad unsorted one.
It is appropriate for data sets which are already partially sorted.
*/

public class InsertionSort {

    /**
     * "Insertion Sort" function
     * 
     * @param array - array to be sorted - type: int
     */
    public void insertionSort(int array[]) {

        int size = array.length;

        for (int i = 0; i < size; i++) {
            // Define a temp variable
            int temp = array[i];
            int j = i - 1;
            // Move elements that are bigger than temp
            // one position ahead of their current one
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
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

        InsertionSort testObjInsertionSort = new InsertionSort();

        int vector[] = { 10, 7, 8, 9, 1, 23, 11 };

        System.out.println("Original array: ");
        testObjInsertionSort.printArray(vector);
        System.out.println("Sorting array...\n");
        testObjInsertionSort.insertionSort(vector);
        System.out.println("Array sorted: ");
        testObjInsertionSort.printArray(vector);
    }
}
