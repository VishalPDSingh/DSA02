package ch1_Array.Class2PatternQuestion;

/*
 * Pivot Index / Equilibrium Index
 * (Prefix Sum Approach)
 *
 * ---------------------------------------------------
 * Problem:
 *
 * Find an index such that:
 *
 * Sum of elements on the left
 * =
 * Sum of elements on the right
 *
 * The pivot element itself is NOT included
 * in either sum.
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Construct the Prefix Sum array.
 *
 * Step 2:
 * For every index:
 *
 * Left Sum
 * = Prefix[i - 1]
 *
 * Right Sum
 * = Prefix[n - 1] - Prefix[i]
 *
 * Step 3:
 * If Left Sum == Right Sum,
 * return the current index.
 *
 * Step 4:
 * Handle corner cases:
 *
 * Index 0
 * Last Index
 *
 * Step 5:
 * If no pivot exists,
 * return -1.
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
 * Why it Works?
 *
 * Prefix Sum stores cumulative sums.
 *
 * Therefore:
 *
 * Left Sum
 * =
 * Sum of all elements before i
 *
 * =
 * pf[i - 1]
 *
 * -----------------------------------
 *
 * Right Sum
 * =
 * Total Sum - Prefix[i]
 *
 * =
 * pf[n - 1] - pf[i]
 *
 * -----------------------------------
 *
 * Both sums are obtained in O(1).
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 *
 * [-2, 6, 3, 4]
 *
 * Prefix Sum:
 *
 * [-2, 4, 7, 11]
 *
 * -----------------------------------
 * i = 1
 *
 * Left Sum
 * = pf[0]
 * = -2
 *
 * Right Sum
 * = pf[3] - pf[1]
 * = 11 - 4
 * = 7
 *
 * Not Equal
 *
 * -----------------------------------
 * i = 2
 *
 * Left Sum
 * = pf[1]
 * = 4
 *
 * Right Sum
 * = pf[3] - pf[2]
 * = 11 - 7
 * = 4
 *
 * Equal ✔
 *
 * Pivot Index = 2
 *
 * ---------------------------------------------------
 * Pattern Used:
 *
 * Prefix Sum
 *
 * Idea:
 *
 * Store cumulative sums once
 * and reuse them for every index.
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Instead of recalculating the left and
 * right sums repeatedly,
 * Prefix Sum allows both values to be
 * obtained in constant time.
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * Build Prefix Array = O(n)
 *
 * Check Pivot Index = O(n)
 *
 * Total:
 *
 * O(n)
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
 * Time:
 * O(n²)
 *
 * -----------------------------------
 *
 * Prefix Sum
 *
 * Time:
 * O(n)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Left Sum
 * = pf[i - 1]
 *
 * Right Sum
 * = pf[n - 1] - pf[i]
 *
 * Prefix Sum converts repeated calculations
 * into constant-time lookups.
 */

public class Q6_OptimalPivotIndex {

    // ---------------------------------------------------
    // Construct Prefix Sum Array
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
    // Find Pivot Index using Prefix Sum
    // ---------------------------------------------------
    static int equilibriumIndex(int arr[]) {

        // Build prefix sum array.
        int pf[] = prefixSum(arr);

        // -------------------------------------------
        // Check middle indices.
        // -------------------------------------------
        for (int i = 1; i < arr.length - 1; i++) {

            // Sum of elements before i.
            int lsum = pf[i - 1];

            // Sum of elements after i.
            int rsum = pf[arr.length - 1] - pf[i];

            // Pivot found.
            if (lsum == rsum)
                return i;
        }

        // -------------------------------------------
        // Check index 0.
        // Left Sum = 0
        // -------------------------------------------
        if (0 == pf[arr.length - 1] - pf[0]) {

            return 0;
        }

        // -------------------------------------------
        // Check last index.
        // Right Sum = 0
        // -------------------------------------------
        if (pf[arr.length - 2] == 0) {

            return arr.length - 1;
        }

        // No pivot index found.
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {-1,-1,0,1,1,-1};

        int ans = equilibriumIndex(arr);

        System.out.println(ans);
    }
}