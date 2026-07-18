package ch1_Array.Class2PatternQuestion;

/*
 * Range Sum Queries (Optimal Using Prefix Sum)
 *
 * ---------------------------------------------------
 * Problem:
 * Given an array and multiple queries,
 * find the sum of elements between the given
 * left index (l) and right index (r).
 *
 * Query Format:
 *
 * [l, r]
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Construct the Prefix Sum array.
 *
 * Step 2:
 * For every query:
 *
 * If l == 0
 *      Answer = Prefix[r]
 *
 * Otherwise
 *      Answer = Prefix[r] - Prefix[l - 1]
 *
 * Step 3:
 * Print the calculated sum.
 *
 * ---------------------------------------------------
 * Why it Works?
 *
 * Prefix[r]
 *
 * contains the sum from index 0 to r.
 *
 * Prefix[l - 1]
 *
 * contains the sum from index 0 to l-1.
 *
 * Therefore,
 *
 * Prefix[r]
 * -
 * Prefix[l - 1]
 *
 * leaves only the sum between
 * l and r.
 *
 * ---------------------------------------------------
 * Formula:
 *
 * If l == 0
 *
 * Sum = Prefix[r]
 *
 * Otherwise
 *
 * Sum = Prefix[r] - Prefix[l - 1]
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 *
 * [2, 5, 1, 3, 4, 1, 7, -8, 2, 0]
 *
 * Prefix:
 *
 * [2, 7, 8, 11, 15, 16, 23, 15, 17, 17]
 *
 * Query:
 *
 * [3, 8]
 *
 * Sum
 *
 * = Prefix[8]
 * - Prefix[2]
 *
 * = 17 - 8
 *
 * = 9
 *
 * Elements:
 *
 * 3 + 4 + 1 + 7 + (-8) + 2
 *
 * = 9
 *
 * ---------------------------------------------------
 * Pattern Used:
 *
 * Prefix Sum
 *
 * Formula:
 *
 * Prefix[0] = arr[0]
 *
 * Prefix[i]
 * =
 * Prefix[i - 1] + arr[i]
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Prefix Sum is calculated only once.
 *
 * Every query is answered using
 * only one subtraction.
 *
 * Therefore,
 * repeated traversals are avoided.
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * Build Prefix Array = O(n)
 *
 * Each Query = O(1)
 *
 * Total
 *
 * O(n + q)
 *
 * where,
 *
 * n = Array Size
 * q = Number of Queries
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
 * Every Query:
 * O(n)
 *
 * Total:
 * O(q × n)
 *
 * -----------------------------------
 *
 * Prefix Sum
 *
 * Build Prefix:
 * O(n)
 *
 * Every Query:
 * O(1)
 *
 * Total:
 * O(n + q)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Build Prefix Sum once.
 *
 * Then answer every query in O(1).
 *
 * Formula:
 *
 * Sum(l, r)
 *
 * =
 *
 * Prefix[r]
 * -
 * Prefix[l - 1]
 */

public class Q4_OptimalQueriesSum {

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
    // Answer all range sum queries.
    // ---------------------------------------------------
    static void queries(int arr[], int q[][]) {

        // Build prefix sum array once.
        int pf[] = prefixSum(arr);

        // Process each query.
        for (int i = 0; i < q.length; i++) {

            int l = q[i][0];
            int r = q[i][1];

            int sum;

            // If the range starts from index 0.
            if (l == 0) {

                sum = pf[r];

            } else {

                // Formula:
                // Prefix[r] - Prefix[l-1]
                sum = pf[r] - pf[l - 1];
            }

            // Print the answer.
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {

        int arr[] = {2, 5, 1, 3, 4, 1, 7, -8, 2, 0};

        int q[][] = {
                {3, 8},
                {2, 4},
                {0, 3},
                {5, 9},
                {6, 6}
        };

        queries(arr, q);
    }
}