package ch3_Array2D.class2_BasicQuestion;

import java.util.Scanner;

/*
 * Swap Two Columns of a 2D Matrix
 *
 * ===================================================
 * Problem:
 *
 * Given a matrix and two column numbers,
 * swap the contents of those two columns.
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
 * Columns to Swap:
 *
 * c1 = 1
 * c2 = 3
 *
 * Output:
 *
 * 3 2 1
 * 6 5 4
 * 9 8 7
 *
 * ===================================================
 * Solution Intuition
 *
 * A column contains one element
 * from every row.
 *
 * Therefore,
 * to swap two columns,
 * traverse every row
 * and exchange the values
 * of those columns.
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
 * Read the two column numbers.
 *
 * Step 3:
 *
 * Traverse every row.
 *
 * Step 4:
 *
 * Swap
 *
 * arr[row][c1]
 *
 * with
 *
 * arr[row][c2]
 *
 * Step 5:
 *
 * Print the matrix.
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
 * Swap:
 *
 * Column 1 and Column 3
 *
 * -----------------------------------
 * Row 0
 *
 * 1 ↔ 3
 *
 * 3 2 1
 *
 * -----------------------------------
 * Row 1
 *
 * 4 ↔ 6
 *
 * 6 5 4
 *
 * -----------------------------------
 * Row 2
 *
 * 7 ↔ 9
 *
 * 9 8 7
 *
 * ===================================================
 * Why iterate over rows?
 *
 * Each row contains one value
 * of every column.
 *
 * To swap columns,
 * we must visit every row.
 *
 * Therefore,
 *
 * Loop:
 *
 * for(row = 0; row < rows; row++)
 *
 * ===================================================
 * Why use c1-1 and c2-1 ?
 *
 * User enters:
 *
 * Column 1
 * Column 2
 * Column 3
 *
 * Java stores:
 *
 * Index 0
 * Index 1
 * Index 2
 *
 * Therefore,
 *
 * c1-1
 * c2-1
 *
 * ===================================================
 * Time Complexity:
 *
 * O(r)
 *
 * r = Number of Rows
 *
 * ===================================================
 * Space Complexity:
 *
 * O(1)
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
 * Swap rows
 * →
 * Traverse columns.
 *
 * Swap columns
 * →
 * Traverse rows.
 */

public class Q11_SwapingTwoCol {

    // ---------------------------------------------------
    // Swaps two columns of the matrix.
    //
    // c1 and c2 are
    // 1-based column numbers.
    // ---------------------------------------------------
    static void swapingTwoCol(int arr[][], int c1, int c2) {

        // Total rows.
        int rows = arr.length;

        // Total columns.
        int cols = arr[0].length;

        // Traverse every row
        // and swap the selected columns.
        for (int i = 0; i < rows; i++) {

            int temp = arr[i][c1 - 1];

            arr[i][c1 - 1] = arr[i][c2 - 1];

            arr[i][c2 - 1] = temp;
        }

        // Print the updated matrix.
        System.out.println("\nMatrix After Swapping Columns:\n");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");

        int rows = sc.nextInt();

        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        System.out.println("Enter Matrix Elements:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter two column numbers to swap (1-based indexing):");

        int c1 = sc.nextInt();

        int c2 = sc.nextInt();

        swapingTwoCol(arr, c1, c2);

        sc.close();
    }
}