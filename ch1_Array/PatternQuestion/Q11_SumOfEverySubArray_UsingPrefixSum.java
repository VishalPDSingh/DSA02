package ch1_Array.PatternQuestion;

/*
 * Sum of Every Subarray
 * (Using Prefix Sum)
 *
 * ---------------------------------------------------
 * Problem:
 *
 * Print the sum of every possible subarray
 * using the Prefix Sum technique.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Array:
 *
 * [5, 3, -1, 8]
 *
 * Prefix Sum:
 *
 * [5, 8, 7, 15]
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 *
 * Construct the Prefix Sum array.
 *
 * Step 2:
 *
 * Choose the starting index.
 *
 * Step 3:
 *
 * Choose the ending index.
 *
 * Step 4:
 *
 * Calculate the subarray sum
 * using the Prefix Sum formula.
 *
 * ---------------------------------------------------
 * Prefix Sum Formula:
 *
 * pf[0] = arr[0]
 *
 * pf[i]
 * =
 * pf[i - 1] + arr[i]
 *
 * ---------------------------------------------------
 * Subarray Sum Formula:
 *
 * If
 *
 * start == 0
 *
 * Sum
 * =
 * Prefix[end]
 *
 * Otherwise
 *
 * Sum
 * =
 * Prefix[end]
 * -
 * Prefix[start - 1]
 *
 * ---------------------------------------------------
 * Why it Works?
 *
 * Prefix Sum stores the cumulative sum
 * from index 0.
 *
 * Therefore,
 *
 * Prefix[end]
 *
 * contains
 *
 * arr[0] + arr[1] + ... + arr[end]
 *
 * Removing
 *
 * Prefix[start - 1]
 *
 * removes all elements before
 * the starting index.
 *
 * The remaining sum belongs only
 * to the required subarray.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 *
 * [5, 3, -1, 8]
 *
 * Prefix Sum:
 *
 * [5, 8, 7, 15]
 *
 * -----------------------------------
 * Subarray:
 *
 * [3, -1]
 *
 * Start = 1
 *
 * End = 2
 *
 * Sum
 *
 * = Prefix[2]
 * - Prefix[0]
 *
 * = 7 - 5
 *
 * = 2
 *
 * -----------------------------------
 *
 * Subarray:
 *
 * [5, 3, -1]
 *
 * Start = 0
 *
 * End = 2
 *
 * Sum
 *
 * = Prefix[2]
 *
 * = 7
 *
 * ---------------------------------------------------
 * Pattern Used:
 *
 * Prefix Sum
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Prefix Sum is calculated only once.
 *
 * Every subarray sum is then obtained
 * in constant time.
 *
 * No repeated addition is required.
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * Build Prefix Sum
 * = O(n)
 *
 * Generate All Subarrays
 * = O(n²)
 *
 * Total
 *
 * O(n²)
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(n)
 *
 * Prefix Sum Array
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
 * Prefix Sum
 *
 * O(n²)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Subarray Sum
 *
 * =
 *
 * Prefix[end]
 * -
 * Prefix[start - 1]
 *
 * (If start > 0)
 *
 * Otherwise
 *
 * Sum
 * =
 * Prefix[end]
 *
 * Prefix Sum eliminates the need
 * to traverse each subarray again.
 */

public class Q11_SumOfEverySubArray_UsingPrefixSum {

    // ---------------------------------------------------
    // Construct Prefix Sum Array.
    // ---------------------------------------------------
    static int[] prefixSum(int arr[]) {

        int pf[] = new int[arr.length];

        // First prefix sum.
        pf[0] = arr[0];

        // Calculate remaining prefix sums.
        for (int i = 1; i < arr.length; i++) {

            pf[i] = pf[i - 1] + arr[i];
        }

        return pf;
    }

    // ---------------------------------------------------
    // Print the sum of every subarray
    // using Prefix Sum.
    // ---------------------------------------------------
    static void subArraySum(int arr[]) {

        // Build Prefix Sum array once.
        int psum[] = prefixSum(arr);

        // Select the starting index.
        for (int i = 0; i < arr.length; i++) {

            // Select the ending index.
            for (int j = i; j < arr.length; j++) {

                // If subarray starts from index 0,
                // the answer is simply Prefix[j].
                if (i == 0) {

                    System.out.println(psum[j]);

                } else {

                    // Formula:
                    // Prefix[end] - Prefix[start - 1]
                    System.out.println(psum[j] - psum[i - 1]);
                }
            }

            // Blank line for readability.
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[] = {5, 3, -1, 8};

        subArraySum(arr);
    }
}