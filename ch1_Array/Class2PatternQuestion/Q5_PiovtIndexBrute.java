package ch1_Array.Class2PatternQuestion;

/*
 * Pivot Index / Equilibrium Index (Brute Force)
 *
 * ---------------------------------------------------
 * Problem:
 * Find the Pivot (Equilibrium) Index of an array.
 *
 * A Pivot Index is an index where:
 *
 * Sum of all elements on the left
 * =
 * Sum of all elements on the right.
 *
 * Note:
 * The pivot element itself is NOT included
 * in either sum.
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Consider every index as a possible pivot.
 *
 * Step 2:
 * Calculate the Left Sum.
 *
 * (Elements before the current index.)
 *
 * Step 3:
 * Calculate the Right Sum.
 *
 * (Elements after the current index.)
 *
 * Step 4:
 * If both sums are equal,
 * return the current index.
 *
 * Step 5:
 * If no such index exists,
 * return -1.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 *
 * [-2, 6, 3, 4]
 *
 * -----------------------------------
 * i = 0
 *
 * Left Sum = 0
 *
 * Right Sum
 * = 6 + 3 + 4
 * = 13
 *
 * Not Equal
 *
 * -----------------------------------
 * i = 1
 *
 * Left Sum
 * = -2
 *
 * Right Sum
 * = 3 + 4
 * = 7
 *
 * Not Equal
 *
 * -----------------------------------
 * i = 2
 *
 * Left Sum
 * = -2 + 6
 * = 4
 *
 * Right Sum
 * = 4
 *
 * Equal ✔
 *
 * Pivot Index = 2
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Every index is checked independently.
 *
 * For each index,
 * both left and right sums are calculated again.
 *
 * This repeated calculation makes the algorithm slow.
 *
 * ---------------------------------------------------
 * Pattern Used:
 *
 * Brute Force
 *
 * For Every Index
 *      ↓
 * Calculate Left Sum
 *      ↓
 * Calculate Right Sum
 *      ↓
 * Compare
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * Outer Loop = O(n)
 *
 * Left Sum Calculation = O(n)
 *
 * Right Sum Calculation = O(n)
 *
 * Overall:
 *
 * O(n²)
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Brute Force recalculates the left and right sums
 * for every index.
 *
 * This can be optimized using Prefix Sum
 * or by maintaining running left and right sums.
 */

public class Q5_PiovtIndexBrute {

    // ---------------------------------------------------
    // Find Pivot Index (Brute Force)
    // ---------------------------------------------------
    static int equilibriumIndex(int arr[]) {

        // Check every index as a possible pivot.
        for (int i = 0; i < arr.length; i++) {

            int lsum = 0;
            int rsum = 0;

            // -------------------------------------------
            // Calculate Left Sum.
            // -------------------------------------------
            for (int j = 0; j < i; j++) {

                lsum += arr[j];
            }

            // -------------------------------------------
            // Calculate Right Sum.
            // -------------------------------------------
            for (int k = i + 1; k < arr.length; k++) {

                rsum += arr[k];
            }

            // If both sums are equal,
            // current index is the pivot.
            if (lsum == rsum) {

                return i;
            }
        }

        // No pivot index found.
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1,7,3,6,5,6};

        int ans = equilibriumIndex(arr);

        System.out.println(ans);
    }
}