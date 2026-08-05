package ch1_Array.LeetCodeSolution;

import java.util.Scanner;

public class Q1_SwapTwoNumber {

    static void swapNum(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a and b before the swap: " + a + " " + b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Value of a and b before the swap: " + a + " " + b);
        swapNum(a, b);
        sc.close();
    }
}
