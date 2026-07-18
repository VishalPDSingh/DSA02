package ch1_Array.Class1EasyQuestion;

/*
 * Count Elements Having At Least One Greater Element
 *
 * ---------------------------------------------------
 * Problem:
 * Count the number of elements that have at least one
 * greater element present somewhere in the array.
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Find the maximum element in the array.
 *
 * Step 2:
 * Count how many times the maximum element occurs.
 *
 * Step 3:
 * All elements except the maximum element(s)
 * have at least one greater element.
 *
 * Answer:
 *
 * Array Length - Count of Maximum Element
 *
 * ---------------------------------------------------
 * Why it Works?
 *
 * The maximum element has no greater element.
 *
 * Every other element is smaller than the maximum,
 * so it definitely has a greater element.
 *
 * If the maximum appears multiple times,
 * none of those occurrences should be counted.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Example 1:
 *
 * Array:
 * [3, 2, 1, 4]
 *
 * Maximum = 4
 * Count of Maximum = 1
 *
 * Answer:
 * 4 - 1 = 3
 *
 * Elements:
 * 3 ✔
 * 2 ✔
 * 1 ✔
 * 4 ✘
 *
 * ---------------------------------------------------
 * Example 2:
 *
 * Array:
 * [7, 7, 7, 7, 7]
 *
 * Maximum = 7
 * Count of Maximum = 5
 *
 * Answer:
 * 5 - 5 = 0
 *
 * No element has a greater element.
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Instead of checking every element against every
 * other element (O(n²)),
 * we only need:
 *
 * • Maximum Element
 * • Frequency of Maximum
 *
 * This reduces the solution to linear time.
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * First Traversal  -> O(n)
 * Second Traversal -> O(n)
 *
 * Total = O(2n)
 *
 * Ignoring constants,
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
 * Only the maximum element(s) cannot have a greater
 * element in the array.
 *
 * Therefore:
 *
 * Answer = Array Length - Frequency of Maximum
 */

public class Q10_CountEle_GreaterThanItself {

    // ---------------------------------------------------
    // Count elements having at least one greater element.
    // ---------------------------------------------------
    static int countEle(int arr[]) {

        // Assume the smallest possible integer
        // as the initial maximum.
        int maxValue = Integer.MIN_VALUE;

        // ---------------------------------------------------
        // Step 1:
        // Find the maximum element.
        // ---------------------------------------------------
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxValue) {

                maxValue = arr[i];
            }
        }

        // Stores how many times the maximum occurs.
        int count = 0;

        // ---------------------------------------------------
        // Step 2:
        // Count occurrences of the maximum element.
        // ---------------------------------------------------
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == maxValue)

                count++;
        }

        // ---------------------------------------------------
        // Step 3:
        // Every element except the maximum element(s)
        // has a greater element.
        // ---------------------------------------------------
        return arr.length - count;
    }

    public static void main(String[] args) {

        int arr[] = {7, 7, 7, 7, 7};

        int res = countEle(arr);

        System.out.println("Count = " + res);
    }
}