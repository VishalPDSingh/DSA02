package ch8_SimpleMath.class2SimpleMath;

import java.util.Scanner;

/*
 * Print Digits of a Number
 *
 * ===================================================
 * Problem:
 *
 * Print every digit
 * of a given number.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Input:
 *
 * 12345
 *
 * Output:
 *
 * 5
 * 4
 * 3
 * 2
 * 1
 *
 * ===================================================
 * What is the Idea?
 *
 * Every number
 * consists of digits.
 *
 * We can extract
 * the last digit
 * using
 *
 * n % 10
 *
 * After printing
 * the last digit,
 * remove it
 * using
 *
 * n / 10
 *
 * Repeat
 * until
 * the number
 * becomes zero.
 *
 * ===================================================
 * Main Idea
 *
 * Step 1:
 *
 * Find
 * the last digit.
 *
 * Step 2:
 *
 * Print
 * the digit.
 *
 * Step 3:
 *
 * Remove
 * the last digit.
 *
 * Step 4:
 *
 * Repeat
 * until
 * n becomes 0.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Read
 * the number.
 *
 * Step 2:
 *
 * While
 *
 * n > 0
 *
 * Find
 *
 * rem = n % 10
 *
 * Step 3:
 *
 * Print
 * rem.
 *
 * Step 4:
 *
 * Remove
 * the last digit.
 *
 * n = n / 10
 *
 * Step 5:
 *
 * Continue
 * until
 * n becomes 0.
 *
 * ===================================================
 * Dry Run
 *
 * Number:
 *
 * 12345
 *
 * -----------------------------------
 *
 * n = 12345
 *
 * rem = 5
 *
 * Print
 *
 * 5
 *
 * n = 1234
 *
 * -----------------------------------
 *
 * rem = 4
 *
 * Print
 *
 * 4
 *
 * n = 123
 *
 * -----------------------------------
 *
 * rem = 3
 *
 * Print
 *
 * 3
 *
 * n = 12
 *
 * -----------------------------------
 *
 * rem = 2
 *
 * Print
 *
 * 2
 *
 * n = 1
 *
 * -----------------------------------
 *
 * rem = 1
 *
 * Print
 *
 * 1
 *
 * n = 0
 *
 * Loop Ends.
 *
 * ===================================================
 * Why
 *
 * n % 10 ?
 *
 * Because
 * modulo (%)
 * gives
 * the last digit
 * of a number.
 *
 * Example:
 *
 * 786 % 10 = 6
 *
 * ===================================================
 * Why
 *
 * n / 10 ?
 *
 * Integer division
 * removes
 * the last digit.
 *
 * Example:
 *
 * 786 / 10 = 78
 *
 * ===================================================
 * Time Complexity
 *
 * O(d)
 *
 * where
 *
 * d = number of digits
 *
 * ===================================================
 * Space Complexity
 *
 * O(1)
 *
 * No extra space
 * is required.
 *
 * ===================================================
 * Pattern Used
 *
 * Modulo
 *
 * +
 *
 * Integer Division
 *
 * ===================================================
 * Limitation
 *
 * This program
 * prints digits
 * from
 * right to left
 * (reverse order).
 *
 * ===================================================
 * Key Takeaway
 *
 * Use
 *
 * n % 10
 *
 * to get
 * the last digit.
 *
 * Use
 *
 * n / 10
 *
 * to remove
 * the last digit.
 *
 * Repeat
 * until
 * the number
 * becomes zero.
 */
public class Q1_PrintDigit {
    static void digitprint(int n) {
        while (n > 0) {
            int rem = n % 10;
            System.out.println(rem);
            n /= 10;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the diigt of a number: ");
        int n = sc.nextInt();
        digitprint(n);
        sc.close();
    }
}
