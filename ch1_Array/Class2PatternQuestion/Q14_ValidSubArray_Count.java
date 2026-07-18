package ch1_Array.Class2PatternQuestion;


/*
 * Count Valid Subarrays (Brute Force)
 *
 * ---------------------------------------------------
 * Problem:
 *
 * Given an array and two integers
 * left and right,
 *
 * count all subarrays whose
 * maximum element lies in
 * the range
 *
 * [left, right]
 *
 * ---------------------------------------------------
 * Example:
 *
 * Array:
 *
 * [2, 1, 4, 3]
 *
 * left = 2
 * right = 3
 *
 * Valid Subarrays:
 *
 * [2]
 *
 * [2,1]
 *
 * [3]
 *
 * Answer:
 *
 * 3
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 *
 * Generate every possible subarray.
 *
 * Step 2:
 *
 * Find the maximum element
 * of the current subarray.
 *
 * Step 3:
 *
 * If
 *
 * left <= maximum <= right
 *
 * then increase the count.
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
 * Finds the maximum element
 * in the current subarray.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 *
 * [2,1,4,3]
 *
 * -----------------------------------
 *
 * Subarray:
 *
 * [2]
 *
 * Maximum = 2
 *
 * 2 lies between
 * 2 and 3
 *
 * Count++
 *
 * -----------------------------------
 *
 * Subarray:
 *
 * [2,1]
 *
 * Maximum = 2
 *
 * Count++
 *
 * -----------------------------------
 *
 * Subarray:
 *
 * [2,1,4]
 *
 * Maximum = 4
 *
 * Invalid
 *
 * -----------------------------------
 *
 * Subarray:
 *
 * [3]
 *
 * Maximum = 3
 *
 * Count++
 *
 * ---------------------------------------------------
 * Important Note:
 *
 * maxValue MUST be reset
 * for every new subarray.
 *
 * Therefore,
 *
 * maxValue
 *
 * should be declared
 * inside the second loop.
 *
 * Otherwise,
 * the maximum from the previous
 * subarray will affect the next one.
 *
 * ---------------------------------------------------
 * Pattern Used:
 *
 * Generate All Subarrays
 * +
 * Find Maximum
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * O(n³)
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
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Whenever each subarray
 * needs its own maximum,
 *
 * always initialize
 *
 * maxValue = Integer.MIN_VALUE;
 *
 * inside the loop that starts
 * processing a new subarray.
 */
public class Q14_ValidSubArray_Count {
    static int countValid_SubArray(int arr[], int left, int right) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int maxValue = Integer.MIN_VALUE;
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    if (arr[k] > maxValue) {
                        maxValue = arr[k];
                    }
                }
                if (maxValue >= left && maxValue <= right) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 1, 4, 3 };
        int left = 2;
        int right = 3;
        int res = countValid_SubArray(arr, left, right);
        System.out.println(res);
    }
}
