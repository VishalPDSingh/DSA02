package ch1_Array.EasyQuestion;

/*
 * Find Maximum and Minimum Element in an Array
 *
 * ---------------------------------------------------
 * Problem:
 * Find the largest and smallest element present
 * in an array.
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
 * Traverse the array to find the maximum element.
 *
 * Step 3:
 * Traverse the array again to find the minimum element.
 *
 * Step 4:
 * Print the maximum and minimum values.
 *
 * ---------------------------------------------------
 * Why use Integer.MIN_VALUE and Integer.MAX_VALUE?
 *
 * max starts with the smallest possible integer so
 * that any array element will be greater than it.
 *
 * min starts with the largest possible integer so
 * that any array element will be smaller than it.
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
 * Finding Maximum:
 *
 * max = MIN_VALUE
 *
 * 10   > max → max = 10
 * 205  > 10  → max = 205
 * 0    > 205 → No
 * 365  > 205 → max = 365
 * Remaining elements are smaller.
 *
 * Maximum = 365
 *
 * ---------------------------------------------------
 * Finding Minimum:
 *
 * min = MAX_VALUE
 *
 * 10   < min → min = 10
 * 205  < 10  → No
 * 0    < 10  → min = 0
 * 365  < 0   → No
 * 7    < 0   → No
 * -58  < 0   → min = -58
 * Remaining elements are greater.
 *
 * Minimum = -58
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Integer.MIN_VALUE
 * → Smallest integer value in Java.
 *
 * Integer.MAX_VALUE
 * → Largest integer value in Java.
 *
 * These values are commonly used while finding
 * maximum and minimum elements.
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * Current Approach:
 *
 * First Loop  -> O(n)
 * Second Loop -> O(n)
 *
 * Total = O(2n)
 *
 * Since constants are ignored,
 * Overall = O(n)
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Initialize:
 * max = Integer.MIN_VALUE
 * min = Integer.MAX_VALUE
 *
 * Then compare every element to update the
 * maximum and minimum values.
 *
 * Note:
 * This solution uses two traversals.
 * It can be optimized to find both values
 * in a single traversal.
 */

public class Q3_MinAndMaxValue {

    // ---------------------------------------------------
    // Find Maximum and Minimum Element
    // ---------------------------------------------------
    static void maxAndmin(int arr[]) {

        // Initially:
        // max stores the smallest possible integer.
        int max = Integer.MIN_VALUE;

        // min stores the largest possible integer.
        int min = Integer.MAX_VALUE;

        // ---------------------------------------------------
        // Find Maximum Element
        // ---------------------------------------------------
        for (int i = 0; i < arr.length; i++) {

            // If current element is greater than max,
            // update max.
            if (arr[i] > max) {

                max = arr[i];
            }
        }

        System.out.println("Maximum Element = " + max);

        // ---------------------------------------------------
        // Find Minimum Element
        // ---------------------------------------------------
        for (int i = 0; i < arr.length; i++) {

            // If current element is smaller than min,
            // update min.
            if (arr[i] < min) {

                min = arr[i];
            }
        }

        System.out.println("Minimum Element = " + min);
    }

    public static void main(String[] args) {

        int arr[] = {10, 205, 0, 365, 7, -58, 96, 25, -12, 7};

        maxAndmin(arr);
    }
}