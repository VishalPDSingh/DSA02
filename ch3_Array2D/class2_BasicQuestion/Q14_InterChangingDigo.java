package ch3_Array2D.class2_BasicQuestion;

import java.util.Scanner;

/*
 * Interchange Primary and Secondary Diagonals
 *
 * ===================================================
 * Problem:
 *
 * Given a square matrix,
 * interchange (swap)
 * the Primary Diagonal
 * and the Secondary Diagonal.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Input:
 *
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * Primary Diagonal:
 *
 * 1 5 9
 *
 * Secondary Diagonal:
 *
 * 3 5 7
 *
 * Output:
 *
 * 3 2 1
 * 4 5 6
 * 9 8 7
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
 * Swap these two elements
 * for every row.
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
 * Swap
 *
 * arr[i][i]
 *
 * with
 *
 * arr[i][n-i-1]
 *
 * Step 3:
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
 * -----------------------------------
 * i = 0
 *
 * Swap
 *
 * 1 ↔ 3
 *
 * Matrix
 *
 * 3 2 1
 * 4 5 6
 * 7 8 9
 *
 * -----------------------------------
 * i = 1
 *
 * Swap
 *
 * 5 ↔ 5
 *
 * No change.
 *
 * -----------------------------------
 * i = 2
 *
 * Swap
 *
 * 9 ↔ 7
 *
 * Matrix
 *
 * 3 2 1
 * 4 5 6
 * 9 8 7
 *
 * ===================================================
 * Time Complexity:
 *
 * O(n²)
 *
 * Swapping:
 * O(n)
 *
 * Printing:
 * O(n²)
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
 * Diagonal Swapping
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

public class Q14_InterChangingDigo {

    // Swap the primary and secondary diagonals.
    static void interchangeingDigo(int arr[][]) {

        int n = arr.length;

        // Swap the diagonal elements.
        for (int i = 0; i < n; i++) {

            int temp = arr[i][i];

            arr[i][i] = arr[i][n - i - 1];

            arr[i][n - i - 1] = temp;
        }

        System.out.println("\nMatrix After Interchanging Diagonals:\n");

        // Print the updated matrix.
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns:");

        int r = sc.nextInt();

        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter Matrix Elements:");

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        interchangeingDigo(arr);

        sc.close();
    }
}