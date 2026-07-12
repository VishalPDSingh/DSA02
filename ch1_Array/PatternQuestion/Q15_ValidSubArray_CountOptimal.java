package ch1_Array.PatternQuestion;
/*
 * Count Subarrays with Bounded Maximum
 * (Optimal Sliding Window Approach)
 *
 * ===================================================
 * Problem:
 *
 * Given an array and two integers
 * left and right,
 *
 * count the number of subarrays whose
 * maximum element lies in the range:
 *
 * left <= Maximum <= right
 *
 * ===================================================
 * Example:
 *
 * arr = {2, 1, 4, 3}
 *
 * left = 2
 * right = 3
 *
 * Valid Subarrays:
 *
 * {2}
 * {2,1}
 * {3}
 *
 * Answer = 3
 *
 * ===================================================
 * Brute Force Idea
 *
 * Generate every subarray.
 *
 * Find maximum.
 *
 * Check whether
 *
 * left <= maximum <= right
 *
 * Time Complexity:
 *
 * O(n³)
 *
 * ---------------------------------------------------
 * Optimal Idea
 *
 * Instead of checking every subarray,
 * process the array only once.
 *
 * While traversing,
 * determine how many VALID subarrays
 * end at the current index.
 *
 * ===================================================
 * Important Variables
 *
 * count
 *
 * Stores the final answer.
 *
 * -----------------------------------
 *
 * lgei
 *
 * Last Greater Element Index + 1
 *
 * Meaning:
 *
 * The first possible starting position
 * after the last element greater than right.
 *
 * Any subarray starting before lgei
 * definitely contains an invalid element.
 *
 * Therefore,
 * such subarrays are ignored.
 *
 * -----------------------------------
 *
 * preValidCount
 *
 * Number of valid subarrays
 * ending at the previous index.
 *
 * This is useful when the current element
 * is smaller than left.
 *
 * ===================================================
 * Three Possible Cases
 *
 * ---------------------------------------------------
 * Case 1
 *
 * arr[ep] > right
 *
 * Example:
 *
 * right = 3
 *
 * Current Element = 5
 *
 * Since 5 itself is larger than right,
 * every subarray containing 5
 * becomes INVALID.
 *
 * Therefore:
 *
 * Reset
 *
 * preValidCount = 0
 *
 * Move boundary
 *
 * lgei = ep + 1
 *
 * ---------------------------------------------------
 * Case 2
 *
 * left <= arr[ep] <= right
 *
 * Example:
 *
 * left = 2
 *
 * right = 3
 *
 * Current Element = 2
 *
 * Current element itself
 * satisfies the condition.
 *
 * Every subarray starting
 * from lgei up to ep
 * becomes valid.
 *
 * Number of such subarrays:
 *
 * ep - lgei + 1
 *
 * Add this number
 * to the answer.
 *
 * Also store it in
 *
 * preValidCount
 *
 * ---------------------------------------------------
 * Case 3
 *
 * arr[ep] < left
 *
 * Example:
 *
 * Current Element = 1
 *
 * Alone,
 * it cannot create
 * a valid subarray.
 *
 * However,
 * it can extend all previously
 * valid subarrays.
 *
 * Therefore,
 *
 * Add preValidCount
 * to the answer.
 *
 * ===================================================
 * Complete Dry Run
 *
 * Array:
 *
 * [2,1,4,3]
 *
 * left = 2
 *
 * right = 3
 *
 * -----------------------------------
 * ep = 0
 *
 * Element = 2
 *
 * Case 2
 *
 * lgei = 0
 *
 * Valid =
 *
 * 0 - 0 + 1
 *
 * = 1
 *
 * count = 1
 *
 * preValidCount = 1
 *
 * -----------------------------------
 * ep = 1
 *
 * Element = 1
 *
 * Case 3
 *
 * count += preValidCount
 *
 * count = 2
 *
 * -----------------------------------
 * ep = 2
 *
 * Element = 4
 *
 * Case 1
 *
 * Reset:
 *
 * preValidCount = 0
 *
 * lgei = 3
 *
 * -----------------------------------
 * ep = 3
 *
 * Element = 3
 *
 * Case 2
 *
 * Valid =
 *
 * 3 - 3 + 1
 *
 * = 1
 *
 * count = 3
 *
 * ===================================================
 * Why does
 *
 * ep - lgei + 1
 *
 * work?
 *
 * Suppose
 *
 * lgei = 2
 *
 * ep = 5
 *
 * Possible starting indices:
 *
 * 2
 * 3
 * 4
 * 5
 *
 * Total:
 *
 * 4
 *
 * Formula:
 *
 * 5 - 2 + 1
 *
 * = 4
 *
 * ===================================================
 * Time Complexity:
 *
 * O(n)
 *
 * Single traversal.
 *
 * ===================================================
 * Space Complexity:
 *
 * O(1)
 *
 * Only a few variables are used.
 *
 * ===================================================
 * Pattern Used:
 *
 * Sliding Window
 * +
 * Counting Valid Subarrays
 *
 * ===================================================
 * Key Takeaway:
 *
 * When
 *
 * arr[i] > right
 *
 * reset everything.
 *
 * When
 *
 * arr[i] is inside the range,
 * count new valid subarrays.
 *
 * When
 *
 * arr[i] < left,
 * simply extend previous valid subarrays.
 *
 * This gives an O(n) solution.
 */
public class Q15_ValidSubArray_CountOptimal {
     static void maxEle_SubArray(int arr[], int left, int right) {

        int count = 0;

        /*
         * lgei:
         * last greater element index + 1
         * 
         * Stores starting boundary
         */
        int lgei = 0;

        /*
         * Stores previous valid subarray count
         */
        int preVaildCount = 0;

        /*
         * ep -> ending point
         */
        for (int ep = 0; ep < arr.length; ep++) {

            // -----------------------------------------
            // Case 1:
            // arr[ep] > right
            // -----------------------------------------

            if (arr[ep] > right) {

                /*
                 * Reset previous valid count
                 */
                preVaildCount = 0;

                /*
                 * Move invalid boundary
                 */
                lgei = ep + 1;
            }

            // -----------------------------------------
            // Case 2:
            // left <= arr[ep] <= right
            // -----------------------------------------

            else if (arr[ep] >= left && arr[ep] <= right) {

                /*
                 * Count valid subarrays
                 */
                count = count + (ep - lgei + 1);

                /*
                 * Store valid count
                 * for future extension
                 */
                preVaildCount = ep - lgei + 1;
            }

            // -----------------------------------------
            // Case 3:
            // arr[ep] < left
            // -----------------------------------------

            else {

                /*
                 * Extend previous valid subarrays
                 */
                count = count + preVaildCount;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
         int arr[] = { 2, 1, 4, 3 };

        int left = 2;
        int right = 3;

        maxEle_SubArray(arr, left, right);
    }
}
