package ch1_Array.EasyQuestion;

/*
 * Linear Search
 *
 * ---------------------------------------------------
 * Problem:
 * Search an element in an array and return its index.
 *
 * If the element is not present, return -1.
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Traverse the array from index 0 to the last index.
 *
 * Step 2:
 * Compare every element with the target element (x).
 *
 * Step 3:
 * If both are equal, return the current index.
 *
 * Step 4:
 * If the entire array is traversed and the element is
 * still not found, return -1.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 * [10, 205, 0, 365, 7, -58, 96, 25, -12, 74]
 *
 * Target = -12
 *
 * Index 0 → 10    ≠ -12
 * Index 1 → 205   ≠ -12
 * Index 2 → 0     ≠ -12
 * Index 3 → 365   ≠ -12
 * Index 4 → 7     ≠ -12
 * Index 5 → -58   ≠ -12
 * Index 6 → 96    ≠ -12
 * Index 7 → 25    ≠ -12
 * Index 8 → -12   == Target ✔
 *
 * Return 8.
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Linear Search checks every element one by one.
 *
 * It works on both:
 * ✓ Sorted Arrays
 * ✓ Unsorted Arrays
 *
 * It does NOT require the array to be sorted.
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * Best Case  : O(1)
 *              (Element found at first index)
 *
 * Average Case: O(n)
 *
 * Worst Case : O(n)
 *              (Element is at the last index or absent)
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Linear Search is the simplest searching algorithm.
 *
 * Traverse → Compare → Return Index
 *
 * If no match is found, return -1.
 */

public class Q2_SearchEle {

    // ---------------------------------------------------
    // Linear Search
    // ---------------------------------------------------
    static int searchEle(int arr[], int x) {

        // Traverse the complete array
        for (int i = 0; i < arr.length; i++) {

            // Check whether current element
            // matches the target element.
            if (arr[i] == x) {

                // Element found
                // Return its index immediately.
                return i;
            }
        }

        // Element not found after checking
        // every element in the array.
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {10, 205, 0, 365, 7, -58, 96, 25, -12, 74};

        // Element to search
        int x = -12;

        // Store the returned index
        int index = searchEle(arr, x);

        // Check whether element exists
        if (index == -1) {

            System.out.println("Element is not found in the array");

        } else {

            System.out.println("Element is at index " + index);
        }
    }
}