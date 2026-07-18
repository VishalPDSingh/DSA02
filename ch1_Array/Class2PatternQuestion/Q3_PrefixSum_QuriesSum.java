package ch1_Array.Class2PatternQuestion;

/*
 * Range Sum Queries (Brute Force)
 *
 * ---------------------------------------------------
 * Problem:
 * Given an array and multiple queries,
 * find the sum of elements lying between
 * the given start index and end index.
 *
 * Query Format:
 *
 * [start, end]
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Process each query one by one.
 *
 * Step 2:
 * Read the starting index (s)
 * and ending index (e).
 *
 * Step 3:
 * Traverse from index s to e.
 *
 * Step 4:
 * Add every element in that range.
 *
 * Step 5:
 * Print the calculated sum.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 *
 * [2, 5, 1, 3, 4, 1, 7, -8, 2, 0]
 *
 * Query:
 *
 * [2, 4]
 *
 * Start = 2
 * End   = 4
 *
 * Sum:
 *
 * = arr[2]
 * + arr[3]
 * + arr[4]
 *
 * = 1 + 3 + 4
 *
 * = 8
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Every query independently traverses
 * the required range.
 *
 * Previously calculated sums are NOT reused.
 *
 * Therefore,
 * the same elements may be added again
 * for different queries.
 *
 * This repeated work makes the solution slower.
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * Let:
 *
 * n = Array Size
 * q = Number of Queries
 *
 * Worst Case:
 *
 * Each query may traverse the entire array.
 *
 * Total:
 *
 * O(q × n)
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * This is the brute-force solution.
 *
 * The optimized solution uses Prefix Sum,
 * where each query can be answered in O(1).
 */

public class Q3_PrefixSum_QuriesSum {

    // ---------------------------------------------------
    // Process each range sum query.
    // ---------------------------------------------------
    static void queriesSum(int arr[], int q[][]) {

        // Traverse all queries.
        for (int i = 0; i < q.length; i++) {

            // Starting index.
            int s = q[i][0];

            // Ending index.
            int e = q[i][1];

            // Stores the range sum.
            int sum = 0;

            // ---------------------------------------------------
            // Traverse the required range.
            // ---------------------------------------------------
            for (int j = s; j <= e; j++) {

                // Add the current element.
                sum = sum + arr[j];
            }

            // Print the range sum.
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

        queriesSum(arr, q);
    }
}