package ch1_Array.PatternQuestion;

/*
 * Sum of Every Subarray (Brute Force)
 *
 * ---------------------------------------------------
 * Problem:
 *
 * Print the sum of every possible subarray
 * of a given array.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Array:
 *
 * [1, 2, 3]
 *
 * Subarrays:
 *
 * [1]
 * Sum = 1
 *
 * [1, 2]
 * Sum = 3
 *
 * [1, 2, 3]
 * Sum = 6
 *
 * [2]
 * Sum = 2
 *
 * [2, 3]
 * Sum = 5
 *
 * [3]
 * Sum = 3
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Choose the starting index.
 *
 * Step 2:
 * Choose the ending index.
 *
 * Step 3:
 * Traverse the current subarray
 * and calculate its sum.
 *
 * Step 4:
 * Print the calculated sum.
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
 * Calculates the sum of the
 * current subarray.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 *
 * [1, 2, 3]
 *
 * -----------------------------------
 * i = 0
 *
 * j = 0
 *
 * Sum
 *
 * = 1
 *
 * -----------------------------------
 * i = 0
 *
 * j = 1
 *
 * Sum
 *
 * = 1 + 2
 *
 * = 3
 *
 * -----------------------------------
 * i = 0
 *
 * j = 2
 *
 * Sum
 *
 * = 1 + 2 + 3
 *
 * = 6
 *
 * -----------------------------------
 * i = 1
 *
 * j = 1
 *
 * Sum
 *
 * = 2
 *
 * -----------------------------------
 * i = 1
 *
 * j = 2
 *
 * Sum
 *
 * = 2 + 3
 *
 * = 5
 *
 * -----------------------------------
 * i = 2
 *
 * j = 2
 *
 * Sum
 *
 * = 3
 *
 * ---------------------------------------------------
 * Pattern Used:
 *
 * Generate All Subarrays
 * +
 * Process Every Element
 *
 * Start Index
 *      ↓
 * End Index
 *      ↓
 * Calculate Sum
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Every subarray is processed independently.
 *
 * The same elements are added repeatedly
 * for different subarrays.
 *
 * This repeated work makes the algorithm slow.
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
 * ---------------------------------------------------
 * Time Complexity:
 *
 * Outer Loop = O(n)
 *
 * Middle Loop = O(n)
 *
 * Inner Loop = O(n)
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
 * Comparison:
 *
 * Brute Force
 *
 * O(n³)
 *
 * -----------------------------------
 *
 * Running Sum
 *
 * O(n²)
 *
 * -----------------------------------
 *
 * Prefix Sum
 *
 * O(n²)
 *
 * -----------------------------------
 *
 * Kadane's Algorithm
 *
 * O(n)
 *
 * (For Maximum Subarray Sum)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Every subarray is generated first,
 * then its sum is calculated.
 *
 * This is the basic approach before
 * learning optimized subarray algorithms.
 */

public class Q10_SumOfEverySubArray {

    // ---------------------------------------------------
    // Calculate and print the sum of every subarray.
    // ---------------------------------------------------
    static void sumOfEachSubArray(int arr[]) {

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

                // Stores the sum of the current subarray.
                int sum = 0;

                // -----------------------------------
                // Step 3:
                // Calculate the current subarray sum.
                // -----------------------------------
                for (int k = i; k <= j; k++) {

                    sum += arr[k];
                }

                // Print the sum of the current subarray.
                System.out.println(sum);
            }

            // Blank line for better readability.
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3};

        sumOfEachSubArray(arr);
    }
}