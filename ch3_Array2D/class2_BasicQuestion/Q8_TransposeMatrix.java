package ch3_Array2D.class2_BasicQuestion;

import java.util.Scanner;

public class Q8_TransposeMatrix {
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

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                } else
                    System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
