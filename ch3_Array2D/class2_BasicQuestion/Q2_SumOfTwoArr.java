package ch3_Array2D.class2_BasicQuestion;

import java.util.Scanner;

public class Q2_SumOfTwoArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row and col");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int arr1[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int arr3[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr3[i][j] = arr[i][j] + arr1[i][j];
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
