package ch3_Array2D.class2_BasicQuestion;

import java.util.Scanner;

public class Q7_ColWiseSum {
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

        int sum = 0;
        for (int i = 0; i < r; i++) {
            sum = 0;
            for (int j = 0; j < c; j++) {
                sum = sum + arr[j][i];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
