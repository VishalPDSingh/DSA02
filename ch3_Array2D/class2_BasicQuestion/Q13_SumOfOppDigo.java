package ch3_Array2D.class2_BasicQuestion;

import java.util.Scanner;

/*
 * Sum of Secondary (Opposite) Diagonal
 *
 * ===================================================
 * Problem:
 *
 * Given a square matrix,
 * find the sum of all elements
 * present on the Secondary Diagonal.
 *
 * The Secondary Diagonal is also
 * called the Opposite Diagonal
 * or Anti-Diagonal.
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
 * Secondary Diagonal:
 *
 *     3
 *   5
 * 7
 *
 * Sum:
 *
 * 3 + 5 + 7 = 15
 *
 * ===================================================
 * Observation
 *
 * In a square matrix,
 * the row index increases
 * from top to bottom.
 *
 * The column index decreases
 * from right to left.
 *
 * Therefore,
 *
 * Row:
 *
 * 0 1 2 3 ...
 *
 * Column:
 *
 * n-1
 * n-2
 * n-3
 * ...
 *
 * Formula:
 *
 * arr[i][n - i - 1]
 *
 * ===================================================
 * Why
 *
 * n - i - 1
 * ?
 *
 * Consider a 4 × 4 matrix.
 *
 * Row      Column
 *
 * 0  --->   3
 * 1  --->   2
 * 2  --->   1
 * 3  --->   0
 *
 * Formula:
 *
 * column = n - i - 1
 *
 * When
 *
 * i = 0
 *
 * column = 4 - 0 - 1 = 3
 *
 * When
 *
 * i = 1
 *
 * column = 4 - 1 - 1 = 2
 *
 * and so on.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Initialize sum = 0.
 *
 * Step 2:
 *
 * Traverse every row.
 *
 * Step 3:
 *
 * Add
 *
 * arr[i][n-i-1]
 *
 * to the sum.
 *
 * Step 4:
 *
 * Return the final sum.
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
 * arr[0][2]
 *
 * = 3
 *
 * sum = 3
 *
 * -----------------------------------
 * i = 1
 *
 * arr[1][1]
 *
 * = 5
 *
 * sum = 8
 *
 * -----------------------------------
 * i = 2
 *
 * arr[2][0]
 *
 * = 7
 *
 * sum = 15
 *
 * Final Answer:
 *
 * 15
 *
 * ===================================================
 * Important Formula
 *
 * Primary Diagonal:
 *
 * arr[i][i]
 *
 * -----------------------------------
 *
 * Secondary Diagonal:
 *
 * arr[i][n-i-1]
 *
 * ===================================================
 * Time Complexity:
 *
 * O(n)
 *
 * One traversal of the diagonal.
 *
 * ===================================================
 * Space Complexity:
 *
 * O(1)
 *
 * Only one variable (sum)
 * is used.
 *
 * ===================================================
 * Pattern Used:
 *
 * Matrix Traversal
 * +
 * Diagonal Traversal
 *
 * ===================================================
 * Key Takeaway:
 *
 * Primary Diagonal:
 *
 * Row ↑
 * Column ↑
 *
 * Formula:
 *
 * arr[i][i]
 *
 * -------------------------
 *
 * Secondary Diagonal:
 *
 * Row ↑
 * Column ↓
 *
 * Formula:
 *
 * arr[i][n-i-1]
 */

public class Q13_SumOfOppDigo {

    // ---------------------------------------------------
    // Returns the sum of all elements
    // on the secondary diagonal.
    // ---------------------------------------------------
    static int sumofOppDiagonal(int arr[][]) {

        // Number of rows
        int n = arr.length;

        // Stores the answer
        int sum = 0;

        // Traverse every row.
        for (int i = 0; i < n; i++) {

            // Secondary diagonal element.
            sum += arr[i][n - i - 1];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");

        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter Matrix Elements:");

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of Secondary Diagonal:");

        System.out.println(sumofOppDiagonal(arr));

        sc.close();
    }
}