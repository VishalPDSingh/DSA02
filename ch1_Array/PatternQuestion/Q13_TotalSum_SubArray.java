package ch1_Array.PatternQuestion;

/*
 * Total Sum of All Subarrays
 * (Contribution Technique)
 *
 * ---------------------------------------------------
 * Problem:
 *
 * Find the total sum of all possible subarrays
 * without generating the subarrays.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Array:
 *
 * [5, 3, -1, 8]
 *
 * Instead of generating every subarray,
 * determine how many times each element
 * appears in all subarrays.
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Every element contributes to several subarrays.
 *
 * If we know:
 *
 * 1. How many subarrays contain the element.
 *
 * 2. The value of the element.
 *
 * Then
 *
 * Contribution
 *
 * =
 *
 * Element Value
 * ×
 * Number of Occurrences
 *
 * ---------------------------------------------------
 * Important Formula:
 *
 * Suppose an element is present
 * at index i.
 *
 * Number of possible starting positions
 * =
 *
 * (i + 1)
 *
 * Number of possible ending positions
 * =
 *
 * (n - i)
 *
 * Therefore,
 *
 * Total Occurrences
 *
 * =
 *
 * (i + 1) × (n - i)
 *
 * ---------------------------------------------------
 * Why?
 *
 * Consider:
 *
 * Array:
 *
 * [5, 3, -1, 8]
 *
 * Index:
 *
 * 0 1 2 3
 *
 * -----------------------------------
 *
 * Element = 3
 *
 * Index = 1
 *
 * Starting index can be:
 *
 * 0
 * 1
 *
 * Total choices
 *
 * = 2
 *
 * Ending index can be:
 *
 * 1
 * 2
 * 3
 *
 * Total choices
 *
 * = 3
 *
 * Therefore,
 *
 * Number of subarrays
 *
 * =
 *
 * 2 × 3
 *
 * = 6
 *
 * So,
 *
 * Element 3 contributes
 * six times.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 *
 * [5, 3, -1, 8]
 *
 * n = 4
 *
 * -----------------------------------
 *
 * i = 0
 *
 * Element = 5
 *
 * Occurrences
 *
 * = (0 + 1) × (4 - 0)
 *
 * = 1 × 4
 *
 * = 4
 *
 * Contribution
 *
 * = 5 × 4
 *
 * = 20
 *
 * -----------------------------------
 *
 * i = 1
 *
 * Element = 3
 *
 * Occurrences
 *
 * = 2 × 3
 *
 * = 6
 *
 * Contribution
 *
 * = 18
 *
 * -----------------------------------
 *
 * i = 2
 *
 * Element = -1
 *
 * Occurrences
 *
 * = 3 × 2
 *
 * = 6
 *
 * Contribution
 *
 * = -6
 *
 * -----------------------------------
 *
 * i = 3
 *
 * Element = 8
 *
 * Occurrences
 *
 * = 4 × 1
 *
 * = 4
 *
 * Contribution
 *
 * = 32
 *
 * -----------------------------------
 *
 * Total Sum
 *
 * = 20 + 18 - 6 + 32
 *
 * = 64
 *
 * ---------------------------------------------------
 * Pattern Used:
 *
 * Contribution Technique
 *
 * Instead of solving
 * every subarray,
 * solve every element.
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * O(n)
 *
 * Only one traversal.
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * No extra array is used.
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
 * -----------------------------------
 *
 * Contribution Technique
 *
 * O(n)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Every element contributes
 * to multiple subarrays.
 *
 * Contribution Formula:
 *
 * arr[i]
 * ×
 * (i + 1)
 * ×
 * (n - i)
 *
 * This is one of the most important
 * mathematical patterns in array problems.
 */

public class Q13_TotalSum_SubArray {

    // ---------------------------------------------------
    // Calculate the total sum of all subarrays
    // using the Contribution Technique.
    // ---------------------------------------------------
    static int totalSum(int arr[]) {

        // Stores the final answer.
        int sum = 0;

        int n = arr.length;

        // Traverse every element.
        for (int i = 0; i < arr.length; i++) {

            // Number of subarrays
            // containing arr[i].
            int occurrences = (i + 1) * (n - i);

            // Add the contribution
            // of the current element.
            sum += occurrences * arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int arr[] = {5, 3, -1, 8};

        int res = totalSum(arr);

        System.out.println(res);
    }
}