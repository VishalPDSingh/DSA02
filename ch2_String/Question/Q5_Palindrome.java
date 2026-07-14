package ch2_String.Question;

import java.util.Scanner;

/*
 * Check Whether a String is Palindrome
 * (Using Two Pointers)
 *
 * ===================================================
 * Problem:
 *
 * Given a String,
 * determine whether it is a palindrome.
 *
 * A palindrome is a String that reads
 * the same from left to right
 * and from right to left.
 *
 * ---------------------------------------------------
 * Examples:
 *
 * Input:
 * madam
 *
 * Output:
 * Palindrome
 *
 * -------------------------
 *
 * Input:
 * hello
 *
 * Output:
 * Not Palindrome
 *
 * ===================================================
 * Solution Intuition
 *
 * Instead of creating
 * another String,
 * compare characters
 * from both ends.
 *
 * If every pair of characters
 * is equal,
 * the String is a palindrome.
 *
 * As soon as one pair
 * is different,
 * return false.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 * Initialize two pointers.
 *
 * i = 0
 *
 * j = s.length() - 1
 *
 * Step 2:
 * Compare
 *
 * s.charAt(i)
 * and
 * s.charAt(j)
 *
 * Step 3:
 * If both characters
 * are different,
 * return false.
 *
 * Step 4:
 * Otherwise,
 * move both pointers.
 *
 * i++
 *
 * j--
 *
 * Step 5:
 * Repeat until
 * i >= j.
 *
 * Step 6:
 * If the loop finishes,
 * return true.
 *
 * ===================================================
 * Dry Run
 *
 * Input:
 *
 * "MADAM"
 *
 * -----------------------------------
 *
 * i = 0
 * j = 4
 *
 * Compare:
 *
 * M == M
 *
 * Move:
 *
 * i = 1
 * j = 3
 *
 * -----------------------------------
 *
 * Compare:
 *
 * A == A
 *
 * Move:
 *
 * i = 2
 * j = 2
 *
 * Loop stops.
 *
 * Result:
 *
 * Palindrome
 *
 * ===================================================
 *
 * Example 2
 *
 * Input:
 *
 * "HELLO"
 *
 * -----------------------------------
 *
 * i = 0
 * j = 4
 *
 * Compare:
 *
 * H != O
 *
 * Return false.
 *
 * ===================================================
 * Why use Two Pointers?
 *
 * We compare characters
 * from both ends
 * simultaneously.
 *
 * No extra String
 * is created.
 *
 * Hence,
 * this approach is
 * more memory efficient.
 *
 * ===================================================
 * Important Methods Used
 *
 * length()
 *
 * Returns the total
 * number of characters.
 *
 * -----------------------------------
 *
 * charAt(index)
 *
 * Returns the character
 * at the specified index.
 *
 * ===================================================
 * Time Complexity:
 *
 * O(n)
 *
 * At most,
 * half of the String
 * is traversed.
 *
 * ===================================================
 * Space Complexity:
 *
 * O(1)
 *
 * No extra space
 * is used.
 *
 * ===================================================
 * Pattern Used:
 *
 * Two Pointers
 *
 * ===================================================
 * Key Takeaway:
 *
 * Compare characters
 * from both ends.
 *
 * If every pair matches,
 * the String
 * is a palindrome.
 *
 * This approach is
 * better than reversing
 * the String because
 * it requires
 * O(1) extra space.
 */

public class Q5_Palindrome {

    // ---------------------------------------------------
    // Returns true if the given String
    // is a palindrome.
    // ---------------------------------------------------
    static boolean isPalindrome(String s) {

        // Left pointer starts
        // from the beginning.
        int i = 0;

        // Right pointer starts
        // from the last index.
        int j = s.length() - 1;

        // Continue until
        // both pointers meet.
        while (i < j) {

            // If characters are different,
            // it is not a palindrome.
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            // Move left pointer forward.
            i++;

            // Move right pointer backward.
            j--;
        }

        // Every pair matched.
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");

        String s = sc.next();

        if (isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}