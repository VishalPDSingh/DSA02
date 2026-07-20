package ch3_Array2D.class2_BasicQuestion;

import java.util.Scanner;

public class Q9_Indentity {

    static boolean isIdentiy(int arr[][]) {
        int r = arr.length;// row
        int c = arr[0].length; // col
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i != j && arr[i][j] != 0) {
                    return false;
                }
                if (i == j && arr[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

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

        System.out.println(isIdentiy(arr));

        sc.close();
    }
}
