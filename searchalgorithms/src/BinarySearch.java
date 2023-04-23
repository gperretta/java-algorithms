import java.util.Scanner;

/*
Binary Search is defined as a searching algorithm used in a sorted array; 
it works by repeatedly dividing the search interval in half. 
The idea of binary search is to use the information that the array is sorted 
and reduce the time complexity to O(logN). 
*/

public class BinarySearch {

    /**
     * "Binary Search" function - Recursive variant
     *
     * @param sortedArray - array of int values, sorted - type: int
     * @param firstIndex  - first index of the array - type: int
     * @param lastIndex   - last index of the array - type: int
     * @param item        - item to be found - type: int
     * @return item index, if found, else (-1) - type: int
     **/
    public int recursiveBinarySearch(int[] sortedArray, int firstIndex, int lastIndex, int item) {

        // If the item is not found in the array, throws an exception
        if (firstIndex >= lastIndex)
            return -1;
        else {

            // Finding the middle element index in the array
            // to eventually split the sorted array in n sub-arrays
            int middle = (firstIndex + lastIndex) / 2;

            // Check if the searched item is in the middle of the array
            if (sortedArray[middle] == item)
                return middle;
            // If the middle element of the array is smaller than the searched item
            // then search again in the sub-array starting from middle+1 index
            else if (sortedArray[middle] < item)
                return recursiveBinarySearch(sortedArray, middle + 1, lastIndex, item);
            // If the middle element of the array is bigger than the searched item
            // then search again in the sub-array ending to middle index
            return recursiveBinarySearch(sortedArray, firstIndex, middle - 1, item);
        }
    }

    /**
     * "Binary Search" function - Iterative variant
     *
     * @param sortedArray - array of int values, sorted - type: int
     * @param item        - item to be found - type: int
     * @return item index, if found, else (-1) - type: int
     **/
    public int iterativeBinarySearch(int[] sortedArray, int item) {

        // Define the first and last index of the sorted array
        int firstIndex = 0;
        int lastIndex = sortedArray.length - 1;
        // Define the middle index of the sorted array
        int middle = (firstIndex + lastIndex) / 2;

        while (firstIndex < lastIndex) {

            // Check if the searched item is in the middle of the array
            if (sortedArray[middle] == item)
                return middle;
            // If the middle element of the array is smaller than the searched item
            // then ignore the first half of the array
            if (sortedArray[middle] < item)
                firstIndex = middle + 1;
            // If the middle element of the array is bigger than the searched item
            // then ignore the first half of the array
            if (sortedArray[middle] > item)
                lastIndex = middle - 1;
        }

        return -1;
    }

    // Driver for testing
    /**
     * @param args
     */
    public static void main(String args[]) {
        BinarySearch testObjBinarySearch = new BinarySearch();
        // Sorted array example
        int vector[] = { 1, 4, 11, 18, 23, 44 };
        int size = vector.length;

        try (Scanner scanObj = new Scanner(System.in)) {
            // Read user input
            System.out.println("Insert an int value to search: ");
            int key = scanObj.nextInt();

            int result = testObjBinarySearch.recursiveBinarySearch(vector, 0, size, key);

            if (result == -1)
                System.out.println("Element not found in array!");
            else
                System.out.println("Element found at index: " + result);
        }
    }

}
