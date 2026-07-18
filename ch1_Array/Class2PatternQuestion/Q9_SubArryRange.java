package ch1_Array.Class2PatternQuestion;

import java.util.Scanner;

/*
 * Print All Subarrays Within a Given Range
 *
 * ---------------------------------------------------
 * Problem:
 *
 * Given an array and two indices
 * (start and end),
 * print all possible subarrays
 * whose starting and ending indices
 * lie within that range.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Array:
 *
 * [5, 3, -1]
 *
 * Range:
 *
 * s = 1
 * e = 2
 *
 * Output:
 *
 * [3]
 * [3, -1]
 * [-1]
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Choose the starting index
 * from s to e.
 *
 * Step 2:
 * Choose the ending index
 * from the current starting index
 * to e.
 *
 * Step 3:
 * Print every element between
 * the starting and ending indices.
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
 * Prints the current subarray.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 *
 * [5, 3, -1]
 *
 * Range:
 *
 * s = 1
 * e = 2
 *
 * -----------------------------------
 *
 * i = 1
 *
 * j = 1
 *
 * Print:
 *
 * 3
 *
 * -----------------------------------
 *
 * i = 1
 *
 * j = 2
 *
 * Print:
 *
 * 3 -1
 *
 * -----------------------------------
 *
 * i = 2
 *
 * j = 2
 *
 * Print:
 *
 * -1
 *
 * ---------------------------------------------------
 * Pattern Used:
 *
 * Generate Subarrays in a Specific Range
 *
 * Start Index
 *      ↓
 * End Index
 *      ↓
 * Print Elements
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * Outer Loop = O(n)
 *
 * Middle Loop = O(n)
 *
 * Inner Loop = O(n)
 *
 * Overall:
 *
 * O(n³)
 *
 * (For the selected range)
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * This is the same three-loop subarray pattern,
 * but the loops start from the given range
 * instead of index 0.
 */

public class Q9_SubArryRange {

    // ---------------------------------------------------
    // Print all subarrays within the given range.
    // ---------------------------------------------------
    static void subarrayRange(int arr[], int s, int e) {

        // -------------------------------------------
        // Step 1:
        // Select the starting index.
        // -------------------------------------------
        for (int i = s; i <= e; i++) {

            // ---------------------------------------
            // Step 2:
            // Select the ending index.
            // ---------------------------------------
            for (int j = i; j <= e; j++) {

                // -----------------------------------
                // Step 3:
                // Print the current subarray.
                // -----------------------------------
                for (int k = i; k <= j; k++) {

                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }

            // Blank line for readability.
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting and ending index:");

        int s = sc.nextInt();
        int e = sc.nextInt();

        int arr[] = {5, 3, -1};

        subarrayRange(arr, s, e);

        sc.close();
    }
}