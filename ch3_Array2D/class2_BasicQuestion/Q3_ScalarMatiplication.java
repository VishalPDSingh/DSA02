package ch3_Array2D.class2_BasicQuestion;

import java.util.Scanner;

public class Q3_ScalarMatiplication {
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

        int arr3[][] = new int[r][c];
        int n = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr3[i][j] = (arr[i][j]) * n;
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
