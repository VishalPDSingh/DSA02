package ch3_Array2D.class1_Intro2D;

import java.util.Scanner;

public class Q1_SumAll_Elem {

    // Function to calculate the sum of all elements
    static int sumOfAllEle(int arr[][])
    {
        int sum = 0;

        // Traverse each row
        for(int i = 0; i < arr.length; i++)
        {
            // Traverse each column of the current row
            // Use arr[i].length because each row can have a different size (Jagged Array)
            for(int j = 0; j < arr[i].length; j++)
            {
                sum += arr[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns");

        int r = sc.nextInt();
        int c = sc.nextInt();

        // Create a 2D array
        int arr[][] = new int[r][c];

        // Input
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print the matrix
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = sumOfAllEle(arr);

        System.out.println("Sum = " + sum);
        sc.close();
    }
}