package ch1_Array.Class2PatternQuestion;

/*
 * Total Sum of All Subarrays
 * (Using Prefix Sum)
 *
 * ---------------------------------------------------
 * Problem:
 *
 * Find the sum of every possible subarray
 * and return their total sum.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Array:
 *
 * [6, 8, -1, 7]
 *
 * All Subarrays:
 *
 * [6]            = 6
 * [6,8]          = 14
 * [6,8,-1]       = 13
 * [6,8,-1,7]     = 20
 *
 * [8]            = 8
 * [8,-1]         = 7
 * [8,-1,7]       = 14
 *
 * [-1]           = -1
 * [-1,7]         = 6
 *
 * [7]            = 7
 *
 * -----------------------------------
 * Total Sum:
 *
 * 6 + 14 + 13 + 20 +
 * 8 + 7 + 14 +
 * (-1) + 6 +
 * 7
 *
 * = 94
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Construct the Prefix Sum array.
 *
 * Step 2:
 * Generate every possible subarray.
 *
 * Step 3:
 * Calculate the current subarray sum
 * using the Prefix Sum formula.
 *
 * Step 4:
 * Add the current subarray sum
 * to the final answer.
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
 * If start == 0
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
 * contains the sum from
 * index 0 to end.
 *
 * Removing
 *
 * Prefix[start - 1]
 *
 * removes all elements before
 * the starting index.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 *
 * [6, 8, -1, 7]
 *
 * Prefix Sum:
 *
 * [6, 14, 13, 20]
 *
 * -----------------------------------
 * Subarray:
 *
 * [8, -1]
 *
 * Start = 1
 *
 * End = 2
 *
 * Sum
 *
 * = Prefix[2] - Prefix[0]
 *
 * = 13 - 6
 *
 * = 7
 *
 * Add to Total:
 *
 * total += 7
 *
 * ---------------------------------------------------
 * Pattern Used:
 *
 * Prefix Sum
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * Build Prefix Sum
 * = O(n)
 *
 * Generate Every Subarray
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
 * Total Sum
 *
 * =
 *
 * Sum of every subarray
 *
 * Prefix Sum allows every
 * subarray sum to be calculated
 * in O(1) time.
 */

public class Q12_TotalSum_SubArrary {

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
    // Calculate the total sum of all subarrays.
    // ---------------------------------------------------
    static int totalSum(int arr[]) {

        // Build Prefix Sum array.
        int psum[] = prefixSum(arr);

        // Stores the final answer.
        int sum = 0;

        // Select the starting index.
        for (int i = 0; i < arr.length; i++) {

            // Select the ending index.
            for (int j = i; j < arr.length; j++) {

                // If subarray starts from index 0,
                // use Prefix[end].
                if (i == 0) {

                    sum += psum[j];

                } else {

                    // Formula:
                    // Prefix[end] - Prefix[start - 1]
                    sum += (psum[j] - psum[i - 1]);
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int arr[] = {6, 8, -1, 7};

        int res = totalSum(arr);

        System.out.println(res);
    }
}