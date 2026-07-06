package ch1_Array.PatternQuestion;

/*
 * Prefix Sum (Brute Force Approach)
 *
 * ---------------------------------------------------
 * Problem:
 * Construct a Prefix Sum array.
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
 * For every index i,
 * calculate the sum from index 0 to i.
 *
 * Step 3:
 * Store the calculated sum in the prefix array.
 *
 * Step 4:
 * Return the completed prefix sum array.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 * [4, 6, 1, -2, 7]
 *
 * Prefix[0]
 * = 4
 *
 * Prefix[1]
 * = 4 + 6
 * = 10
 *
 * Prefix[2]
 * = 4 + 6 + 1
 * = 11
 *
 * Prefix[3]
 * = 4 + 6 + 1 + (-2)
 * = 9
 *
 * Prefix[4]
 * = 4 + 6 + 1 + (-2) + 7
 * = 16
 *
 * Final Prefix Sum Array:
 *
 * [4, 10, 11, 9, 16]
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Prefix Sum stores the cumulative sum
 * from the beginning of the array.
 *
 * This brute-force approach recalculates the sum
 * from index 0 every time.
 *
 * Example:
 *
 * To calculate Prefix[4],
 * the elements 4 and 6 are added again,
 * even though they were already used to compute
 * Prefix[3].
 *
 * This repeated work makes the algorithm inefficient.
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * Outer Loop -> O(n)
 * Inner Loop -> O(n)
 *
 * Overall = O(n²)
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(n)
 *
 * A separate prefix array is created.
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * This approach works correctly,
 * but it repeatedly calculates the same sums.
 *
 * The optimized Prefix Sum algorithm
 * computes each prefix in constant time,
 * reducing the complexity to O(n).
 */

public class Q1_PrefixSumBrute {

    // ---------------------------------------------------
    // Construct Prefix Sum Array (Brute Force)
    // ---------------------------------------------------
    static int[] prefixSum(int arr[]) {

        // Create a new array to store prefix sums.
        int pf[] = new int[arr.length];

        // ---------------------------------------------------
        // Calculate the prefix sum for every index.
        // ---------------------------------------------------
        for (int i = 0; i < arr.length; i++) {

            // Stores the sum from index 0 to i.
            int sum = 0;

            // Calculate cumulative sum.
            for (int j = 0; j <= i; j++) {

                sum = sum + arr[j];
            }

            // Store the prefix sum.
            pf[i] = sum;
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