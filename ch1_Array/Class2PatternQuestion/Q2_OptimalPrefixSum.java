package ch1_Array.Class2PatternQuestion;

/*
 * Prefix Sum (Optimal Approach)
 *
 * ---------------------------------------------------
 * Problem:
 * Construct a Prefix Sum array in linear time.
 *
 * Prefix Sum at index i stores the sum of all
 * elements from index 0 to index i.
 *
 * Formula:
 *
 * Prefix[i] = arr[0] + arr[1] + ... + arr[i]
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Create a new array to store the prefix sums.
 *
 * Step 2:
 * The first prefix sum is always the first element.
 *
 * pf[0] = arr[0]
 *
 * Step 3:
 * For every remaining index,
 * use the previous prefix sum instead of
 * recalculating the entire sum.
 *
 * Formula:
 *
 * pf[i] = pf[i - 1] + arr[i]
 *
 * Step 4:
 * Return the completed prefix sum array.
 *
 * ---------------------------------------------------
 * Why it Works?
 *
 * Suppose we already know:
 *
 * pf[2] = arr[0] + arr[1] + arr[2]
 *
 * Then,
 *
 * pf[3]
 * = arr[0] + arr[1] + arr[2] + arr[3]
 *
 * Instead of adding everything again,
 * simply use:
 *
 * pf[3] = pf[2] + arr[3]
 *
 * This avoids repeated calculations.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 * [4, 6, 1, -2, 7]
 *
 * Initial:
 *
 * pf[0] = 4
 *
 * i = 1
 *
 * pf[1] = 4 + 6
 *       = 10
 *
 * i = 2
 *
 * pf[2] = 10 + 1
 *       = 11
 *
 * i = 3
 *
 * pf[3] = 11 + (-2)
 *       = 9
 *
 * i = 4
 *
 * pf[4] = 9 + 7
 *       = 16
 *
 * Final Prefix Sum Array:
 *
 * [4, 10, 11, 9, 16]
 *
 * ---------------------------------------------------
 * Pattern Used:
 *
 * Prefix Sum
 *
 * Formula:
 *
 * pf[0] = arr[0]
 *
 * pf[i] = pf[i - 1] + arr[i]
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Every prefix sum depends only on:
 *
 * • Previous Prefix Sum
 * • Current Element
 *
 * Therefore,
 * each element is processed only once.
 *
 * No repeated calculations are performed.
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * One Traversal = O(n)
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(n)
 *
 * A separate prefix sum array is created.
 *
 * ---------------------------------------------------
 * Comparison:
 *
 * Brute Force:
 *
 * Time = O(n²)
 *
 * Recalculates the sum for every index.
 *
 * Optimal:
 *
 * Time = O(n)
 *
 * Reuses the previous prefix sum.
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Prefix Sum is built incrementally.
 *
 * Current Prefix
 * =
 * Previous Prefix + Current Element
 *
 * Formula:
 *
 * pf[i] = pf[i - 1] + arr[i]
 */

public class Q2_OptimalPrefixSum {

    // ---------------------------------------------------
    // Construct Prefix Sum Array (Optimal)
    // ---------------------------------------------------
    static int[] prefixSum(int arr[]) {

        // Create a new array to store prefix sums.
        int pf[] = new int[arr.length];

        // ---------------------------------------------------
        // First prefix sum is always the first element.
        // ---------------------------------------------------
        pf[0] = arr[0];

        // ---------------------------------------------------
        // Calculate remaining prefix sums.
        // ---------------------------------------------------
        for (int i = 1; i < arr.length; i++) {

            // Current Prefix =
            // Previous Prefix + Current Element
            pf[i] = pf[i - 1] + arr[i];
        }

        // Return the prefix sum array.
        return pf;
    }

    public static void main(String[] args) {

        int arr[] = {4, 6, 1, -2, 7};

        // Generate prefix sum array.
        int res[] = prefixSum(arr);

        // Print prefix sums.
        for (int ans : res) {

            System.out.println(ans);
        }
    }
}