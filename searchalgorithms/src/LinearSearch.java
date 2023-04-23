import java.util.Scanner;

/*
 A Linear Search is defined as searching algorithm for finding an element within a list; 
 it works by sequentially checking each element of the list until a match is found 
 or the whole list has been searched, with a time complexity of O(N).
*/

public class LinearSearch {

    /**
     * "Linear Search" - Recursive variant
     * 
     * @param array - list to be searched within - type: int
     * @param size  - array lenght - type: int
     * @param item  - item to be found - type: int
     * @return item index, if found, else (-1) - type: int
     */
    int recursiveLinearSearch(int array[], int size, int item) {
        // If the element was not found in the whole array
        // then return -1
        if (size == 0) {
            return -1;
        } else if (array[size - 1] == item) {
            // else return the index of the found item
            return size - 1;
        } else {
            // Recursion
            return recursiveLinearSearch(array, size - 1, item);
        }
    }

    /**
     * "Linear Search" - Iterative variant
     * 
     * @param array - list to be searched within - type: int
     * @param item  - item to be found - type: int
     * @return item index, if found, else (-1) - type: int
     */
    int iterativeLinearSearch(int array[], int item) {

        int size = array.length;
        // Loop on the array
        for (int i = 0; i < size; i++) {
            // If the item was found, then return its index
            if (array[i] == item)
                return i;
        }
        // else return -1
        return -1;
    }

    // Driver for testing
    /**
     * @param args
     */
    public static void main(String[] args) {
        LinearSearch testObjLinearSearch = new LinearSearch();
        // Sorted array example
        int vector[] = { 15, 5, 19, 27, 3 };
        int size = vector.length;

        try (Scanner scanObj = new Scanner(System.in)) {
            // Read user input
            System.out.println("Insert an int value to search: ");
            int key = scanObj.nextInt();

            int result = testObjLinearSearch.recursiveLinearSearch(vector, size, key);
            // int result = testObjLinearSearch.iterativeLinearSearch(vector, key);

            if (result == -1)
                System.out.println("Element not found in array!");
            else
                System.out.println("Element found at index: " + result);
        }
    }

}
