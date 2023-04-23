/*
Bubble Sort is a simple sorting algorithm that works by repeatedly stepping through the list, 
comparing each pair of adjacent elements and swapping them if they are in the wrong order.
*/

public class BubbleSort {

    /**
     * "Bubble Sort" function
     * 
     * @param array - array to be sorted - type: int
     */
    void bubbleSort(int array[]) {

        int size = array.length;
        int temp;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                // If two consecutive elements are not sorted
                if (array[j] > array[j + 1]) {
                    // then swap the two of them
                    // by using a temp variable
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
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

        BubbleSort testObjBubbleSort = new BubbleSort();

        int vector[] = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("Original array: ");
        testObjBubbleSort.printArray(vector);
        System.out.println("Sorting array...\n");
        testObjBubbleSort.bubbleSort(vector);
        System.out.println("Array sorted: ");
        testObjBubbleSort.printArray(vector);
    }
}
