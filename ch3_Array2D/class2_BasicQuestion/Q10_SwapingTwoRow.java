package ch3_Array2D.class2_BasicQuestion;

import java.util.Scanner;

/*
 * Swap Two Rows of a 2D Matrix
 *
 * ===================================================
 * Problem:
 *
 * Given a matrix and two row numbers,
 * swap the contents of those two rows.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Input Matrix:
 *
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * Rows to Swap:
 *
 * r1 = 1
 * r2 = 3
 *
 * Output:
 *
 * 7 8 9
 * 4 5 6
 * 1 2 3
 *
 * ===================================================
 * Solution Intuition
 *
 * A row is simply a collection
 * of columns.
 *
 * Therefore,
 * to swap two rows,
 * we only need to swap
 * every column value
 * of those rows.
 *
 * Example:
 *
 * Row 1:
 *
 * 1 2 3
 *
 * Row 3:
 *
 * 7 8 9
 *
 * Swap:
 *
 * Column 0
 *
 * 1 ↔ 7
 *
 * Column 1
 *
 * 2 ↔ 8
 *
 * Column 2
 *
 * 3 ↔ 9
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Read the matrix.
 *
 * Step 2:
 *
 * Read two row numbers.
 *
 * Step 3:
 *
 * Traverse every column.
 *
 * Step 4:
 *
 * Swap
 *
 * arr[r1][col]
 *
 * with
 *
 * arr[r2][col]
 *
 * Step 5:
 *
 * Print the updated matrix.
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
 * r1 = 1
 * r2 = 3
 *
 * -----------------------------------
 * Column = 0
 *
 * Swap:
 *
 * 1 ↔ 7
 *
 * Matrix:
 *
 * 7 2 3
 * 4 5 6
 * 1 8 9
 *
 * -----------------------------------
 * Column = 1
 *
 * Swap:
 *
 * 2 ↔ 8
 *
 * Matrix:
 *
 * 7 8 3
 * 4 5 6
 * 1 2 9
 *
 * -----------------------------------
 * Column = 2
 *
 * Swap:
 *
 * 3 ↔ 9
 *
 * Matrix:
 *
 * 7 8 9
 * 4 5 6
 * 1 2 3
 *
 * ===================================================
 * Why use r1-1 and r2-1 ?
 *
 * User enters row numbers
 * starting from 1.
 *
 * Example:
 *
 * Row 1
 * Row 2
 * Row 3
 *
 * But Java arrays
 * use 0-based indexing.
 *
 * Row 1 → Index 0
 * Row 2 → Index 1
 * Row 3 → Index 2
 *
 * Therefore:
 *
 * r1 - 1
 * r2 - 1
 *
 * ===================================================
 * Important Variables
 *
 * r
 *
 * Number of rows.
 *
 * -----------------------------------
 *
 * c
 *
 * Number of columns.
 *
 * -----------------------------------
 *
 * r1
 *
 * First row to swap.
 *
 * -----------------------------------
 *
 * r2
 *
 * Second row to swap.
 *
 * ===================================================
 * Time Complexity:
 *
 * O(c)
 *
 * We traverse only
 * all columns once.
 *
 * ===================================================
 * Space Complexity:
 *
 * O(1)
 *
 * Only one temporary variable
 * is used.
 *
 * ===================================================
 * Pattern Used:
 *
 * Matrix Traversal
 * +
 * Swapping
 *
 * ===================================================
 * Key Takeaway:
 *
 * To swap two rows,
 * iterate through every column
 * and exchange the values
 * of those rows.
 */

public class Q10_SwapingTwoRow {

    // ---------------------------------------------------
    // Swaps two rows of the matrix.
    //
    // r1 and r2 are taken as
    // 1-based row numbers.
    // ---------------------------------------------------
    static void swapingTwoRow(int arr[][], int r1, int r2) {

        // Total rows
        int r = arr.length;

        // Total columns
        int c = arr[0].length;

        // Traverse every column
        // and swap corresponding elements.
        for (int j = 0; j < c; j++) {

            int temp = arr[r1 - 1][j];

            arr[r1 - 1][j] = arr[r2 - 1][j];

            arr[r2 - 1][j] = temp;
        }

        // Print the updated matrix.
        System.out.println("\nMatrix After Swapping Rows:\n");

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
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

        System.out.println("Enter the two row numbers to swap (1-based indexing):");

        int r1 = sc.nextInt();

        int r2 = sc.nextInt();

        swapingTwoRow(arr, r1, r2);

        sc.close();
    }
}