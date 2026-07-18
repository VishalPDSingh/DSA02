package ch1_Array.Class2PatternQuestion;

/*
 * Print All Subarrays (Brute Force)
 *
 * ---------------------------------------------------
 * Problem:
 *
 * Print every possible contiguous subarray
 * of a given array.
 *
 * Note:
 *
 * A Subarray consists of consecutive elements.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Array:
 *
 * [5, 3, -1]
 *
 * Subarrays:
 *
 * [5]
 * [5, 3]
 * [5, 3, -1]
 * [3]
 * [3, -1]
 * [-1]
 *
 * Total = 6
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 *
 * Choose the starting index.
 *
 * Step 2:
 *
 * Choose the ending index.
 *
 * Step 3:
 *
 * Print every element between
 * the starting and ending index.
 *
 * ---------------------------------------------------
 * Why Three Loops?
 *
 * Outer Loop
 *
 * Selects the starting index.
 *
 * -----------------------------
 *
 * Middle Loop
 *
 * Selects the ending index.
 *
 * -----------------------------
 *
 * Inner Loop
 *
 * Prints the current subarray.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 *
 * [5, 3, -1]
 *
 * -----------------------------------
 *
 * i = 0
 *
 * j = 0
 *
 * Print:
 *
 * 5
 *
 * -----------------------------------
 *
 * i = 0
 *
 * j = 1
 *
 * Print:
 *
 * 5 3
 *
 * -----------------------------------
 *
 * i = 0
 *
 * j = 2
 *
 * Print:
 *
 * 5 3 -1
 *
 * -----------------------------------
 *
 * i = 1
 *
 * j = 1
 *
 * Print:
 *
 * 3
 *
 * -----------------------------------
 *
 * i = 1
 *
 * j = 2
 *
 * Print:
 *
 * 3 -1
 *
 * -----------------------------------
 *
 * i = 2
 *
 * j = 2
 *
 * Print:
 *
 * -1
 *
 * ---------------------------------------------------
 * Pattern Used:
 *
 * Generate All Subarrays
 *
 * Start Index
 *      ↓
 * End Index
 *      ↓
 * Print Elements
 *
 * ---------------------------------------------------
 * Number of Subarrays:
 *
 * Formula:
 *
 * n × (n + 1)
 * ------------
 *      2
 *
 * Example:
 *
 * n = 3
 *
 * 3 × 4 / 2
 *
 * = 6
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * Outer Loop
 * = O(n)
 *
 * Middle Loop
 * = O(n)
 *
 * Inner Loop
 * = O(n)
 *
 * Overall:
 *
 * O(n³)
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * To generate every subarray:
 *
 * 1. Choose a starting index.
 * 2. Choose an ending index.
 * 3. Print all elements in between.
 *
 * This three-loop pattern is the foundation
 * for many subarray problems.
 */

public class Q8_PrintAll_SubArray {

    // ---------------------------------------------------
    // Print all possible subarrays.
    // ---------------------------------------------------
    static void subarray(int arr[]) {

        // -------------------------------------------
        // Step 1:
        // Select the starting index.
        // -------------------------------------------
        for (int i = 0; i < arr.length; i++) {

            // ---------------------------------------
            // Step 2:
            // Select the ending index.
            // ---------------------------------------
            for (int j = i; j < arr.length; j++) {

                // -----------------------------------
                // Step 3:
                // Print the current subarray.
                // -----------------------------------
                for (int k = i; k <= j; k++) {

                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }

            // Separate subarrays of different
            // starting indices for better readability.
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[] = {5, 3, -1};

        subarray(arr);
    }
}