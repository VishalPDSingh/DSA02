package ch1_Array.Class1EasyQuestion;

/*
 * Find Maximum and Minimum Element in an Array (Optimized)
 *
 * ---------------------------------------------------
 * Problem:
 * Find the largest and smallest element present
 * in an array using only one traversal.
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Initialize:
 * max = Integer.MIN_VALUE
 * min = Integer.MAX_VALUE
 *
 * Step 2:
 * Traverse the array only once.
 *
 * Step 3:
 * For every element:
 *   • If it is greater than max, update max.
 *   • If it is smaller than min, update min.
 *
 * Step 4:
 * Print the maximum and minimum values.
 *
 * ---------------------------------------------------
 * Why use Integer.MIN_VALUE and Integer.MAX_VALUE?
 *
 * max starts with the smallest possible integer,
 * so every array element can replace it.
 *
 * min starts with the largest possible integer,
 * so every array element can replace it.
 *
 * Example:
 *
 * max = -2147483648
 * min =  2147483647
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 * [10, 205, 0, 365, 7, -58, 96, 25, -12, 7]
 *
 * Initial:
 * max = MIN_VALUE
 * min = MAX_VALUE
 *
 * num = 10
 * max = 10
 * min = 10
 *
 * num = 205
 * max = 205
 *
 * num = 0
 * min = 0
 *
 * num = 365
 * max = 365
 *
 * num = 7
 * No change
 *
 * num = -58
 * min = -58
 *
 * num = 96
 * No change
 *
 * num = 25
 * No change
 *
 * num = -12
 * No change
 *
 * num = 7
 * No change
 *
 * Final Answer:
 * Maximum = 365
 * Minimum = -58
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Enhanced for-loop:
 *
 * for (int num : arr)
 *
 * - Iterates through every element of the array.
 * - 'num' stores the current element.
 * - No index variable is required.
 * - Best when you only need the values,
 *   not their indices.
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * One Traversal = O(n)
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * ---------------------------------------------------
 * Why is this Optimized?
 *
 * Previous Approach:
 * Two traversals
 * O(n) + O(n) = O(2n)
 *
 * Optimized Approach:
 * One traversal
 * O(n)
 *
 * Although both simplify to O(n),
 * the optimized approach performs fewer iterations,
 * making it more efficient in practice.
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Traverse the array only once and update both
 * maximum and minimum simultaneously.
 *
 * This is the preferred interview approach.
 */

public class Q4_MinAndMaxOpt {

    // ---------------------------------------------------
    // Find Maximum and Minimum in One Traversal
    // ---------------------------------------------------
    static void minAndmax(int arr[]) {

        // Initialize max with the smallest integer value.
        int max = Integer.MIN_VALUE;

        // Initialize min with the largest integer value.
        int min = Integer.MAX_VALUE;

        // ---------------------------------------------------
        // Traverse the array only once.
        // ---------------------------------------------------
        for (int num : arr) {

            // Update maximum if current element is larger.
            if (num > max)
                max = num;

            // Update minimum if current element is smaller.
            if (num < min)
                min = num;
        }

        // Print maximum element.
        System.out.println("Maximum Element = " + max);

        // Print minimum element.
        System.out.println("Minimum Element = " + min);
    }

    public static void main(String[] args) {

        int arr[] = { 10, 205, 0, 365, 7, -58, 96, 25, -12, 7 };

        minAndmax(arr);
    }
}