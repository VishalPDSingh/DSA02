package ch8_SimpleMath.class2SimpleMath;

import java.util.Scanner;

public class Q2_CountTheNumber_Of_Digit {

    static int countdigit(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = countdigit(n);
        System.out.println(res);
        sc.close();
    }
}
/*
 * Count Number of Digits
 *
 * ===================================================
 * Problem:
 *
 * Count the total number
 * of digits
 * in a given number.
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
 *
 * ===================================================
 * What is the Idea?
 *
 * Every time
 * we divide
 * a number
 * by 10,
 * its last digit
 * is removed.
 *
 * Continue
 * dividing
 * until
 * the number
 * becomes zero.
 *
 * Count
 * how many times
 * the division
 * is performed.
 *
 * That count
 * is the number
 * of digits.
 *
 * ===================================================
 * Main Idea
 *
 * Step 1:
 *
 * Initialize
 *
 * count = 0
 *
 * Step 2:
 *
 * Divide
 * the number
 * by 10.
 *
 * Step 3:
 *
 * Increase
 * count.
 *
 * Step 4:
 *
 * Repeat
 * until
 * n becomes 0.
 *
 * Step 5:
 *
 * Return
 * count.
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
 * Initialize
 *
 * count = 0.
 *
 * Step 3:
 *
 * While
 *
 * n > 0
 *
 * Divide
 *
 * n = n / 10
 *
 * Step 4:
 *
 * Increase
 *
 * count++
 *
 * Step 5:
 *
 * Return
 * count.
 *
 * ===================================================
 * Dry Run
 *
 * Number:
 *
 * 98765
 *
 * -----------------------------------
 *
 * n = 98765
 *
 * count = 0
 *
 * Divide
 *
 * n = 9876
 *
 * count = 1
 *
 * -----------------------------------
 *
 * n = 987
 *
 * count = 2
 *
 * -----------------------------------
 *
 * n = 98
 *
 * count = 3
 *
 * -----------------------------------
 *
 * n = 9
 *
 * count = 4
 *
 * -----------------------------------
 *
 * n = 0
 *
 * count = 5
 *
 * Loop Ends.
 *
 * Final Answer
 *
 * 5
 *
 * ===================================================
 * Why
 *
 * n / 10 ?
 *
 * Integer division
 * removes
 * the last digit
 * of a number.
 *
 * Example:
 *
 * 12345 / 10
 *
 * =
 *
 * 1234
 *
 * ===================================================
 * Why
 *
 * count++ ?
 *
 * Every division
 * removes
 * exactly one digit.
 *
 * Therefore,
 * each iteration
 * increases
 * the digit count
 * by one.
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
 * is used.
 *
 * ===================================================
 * Pattern Used
 *
 * Integer Division
 *
 * +
 *
 * Loop
 *
 * ===================================================
 * Limitation
 *
 * This program
 * works correctly
 * for positive numbers.
 *
 * For
 *
 * n = 0
 *
 * it returns
 *
 * 0
 *
 * although
 * zero has
 * one digit.
 *
 * For negative numbers,
 * convert
 * the number
 * into
 * its absolute value
 * before counting.
 *
 * ===================================================
 * Improved Version
 *
 * if (n == 0)
 * return 1;
 *
 * n = Math.abs(n);
 *
 * ===================================================
 * Key Takeaway
 *
 * Divide
 * the number
 * by 10
 * repeatedly.
 *
 * Count
 * how many times
 * the division
 * occurs.
 *
 * That count
 * is the total
 * number of digits.
 */