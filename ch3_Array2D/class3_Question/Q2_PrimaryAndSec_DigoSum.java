package ch3_Array2D.class3_Question;

/*
 * Sum of Primary and Secondary Diagonals
 *
 * ===================================================
 * Problem:
 *
 * Given a square matrix,
 * return the sum of all elements
 * on both diagonals.
 *
 * If an element belongs to both
 * diagonals,
 * count it only once.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Matrix:
 *
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * Primary Diagonal:
 *
 * 1 + 5 + 9
 *
 * Secondary Diagonal:
 *
 * 3 + 5 + 7
 *
 * Since
 *
 * 5
 *
 * belongs to both diagonals,
 * count it only once.
 *
 * Answer:
 *
 * 1 + 3 + 5 + 7 + 9
 *
 * = 25
 *
 * ===================================================
 * Observation
 *
 * Primary Diagonal:
 *
 * arr[i][i]
 *
 * Secondary Diagonal:
 *
 * arr[i][n-i-1]
 *
 * ===================================================
 * Important Condition
 *
 * In an odd-sized matrix,
 * the center element
 * lies on both diagonals.
 *
 * Example:
 *
 * 3 × 3
 *
 *      5
 *
 * 5 belongs to both diagonals.
 *
 * Therefore,
 * avoid counting it twice.
 *
 * Condition:
 *
 * if(i != n-i-1)
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Traverse every row.
 *
 * Step 2:
 *
 * Add the primary diagonal element.
 *
 * Step 3:
 *
 * If the secondary diagonal element
 * is different,
 * add it.
 *
 * Step 4:
 *
 * Return the sum.
 *
 * ===================================================
 * Dry Run
 *
 * Matrix:
 *
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * -----------------------------------
 * i = 0
 *
 * Primary:
 *
 * 1
 *
 * Secondary:
 *
 * 3
 *
 * Sum = 4
 *
 * -----------------------------------
 * i = 1
 *
 * Primary:
 *
 * 5
 *
 * Secondary:
 *
 * Same element
 *
 * Ignore
 *
 * Sum = 9
 *
 * -----------------------------------
 * i = 2
 *
 * Primary:
 *
 * 9
 *
 * Secondary:
 *
 * 7
 *
 * Sum = 25
 *
 * ===================================================
 * Time Complexity:
 *
 * O(n)
 *
 * ===================================================
 * Space Complexity:
 *
 * O(1)
 *
 * ===================================================
 * Pattern Used:
 *
 * Matrix
 * +
 * Diagonal Traversal
 *
 * ===================================================
 * Key Formula
 *
 * Primary:
 *
 * arr[i][i]
 *
 * Secondary:
 *
 * arr[i][n-i-1]
 */

public class Q2_PrimaryAndSec_DigoSum {

    // Returns the sum of both diagonals.
    static int diagonalSum(int[][] mat) {

        int n = mat.length;

        int sum = 0;

        // Traverse every row.
        for (int i = 0; i < n; i++) {

            // Primary diagonal.
            sum += mat[i][i];

            // Secondary diagonal.
            // Avoid double counting
            // the center element.
            if (i != n - i - 1) {

                sum += mat[i][n - i - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(diagonalSum(arr));
    }
}