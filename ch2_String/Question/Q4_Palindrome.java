package ch2_String.Question;

import java.util.Scanner;

/*
 * Check Whether a String is Palindrome
 * (Using StringBuilder)
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
 * A palindrome remains the same
 * even after reversing.
 *
 * Therefore,
 *
 * Step 1:
 * Reverse the given String.
 *
 * Step 2:
 * Compare the reversed String
 * with the original String.
 *
 * If both are equal,
 * the String is a palindrome.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 * Create an empty StringBuilder.
 *
 * Step 2:
 * Traverse the String
 * from the last index
 * to the first index.
 *
 * Step 3:
 * Append every character
 * into the StringBuilder.
 *
 * Step 4:
 * Convert StringBuilder
 * into String.
 *
 * Step 5:
 * Compare with the original String
 * using equals().
 *
 * ===================================================
 * Dry Run
 *
 * Input:
 *
 * "MADAM"
 *
 * -----------------------------------
 * Initially
 *
 * sb = ""
 *
 * -----------------------------------
 * i = 4
 *
 * Character = M
 *
 * sb = "M"
 *
 * -----------------------------------
 * i = 3
 *
 * Character = A
 *
 * sb = "MA"
 *
 * -----------------------------------
 * i = 2
 *
 * Character = D
 *
 * sb = "MAD"
 *
 * -----------------------------------
 * i = 1
 *
 * Character = A
 *
 * sb = "MADA"
 *
 * -----------------------------------
 * i = 0
 *
 * Character = M
 *
 * sb = "MADAM"
 *
 * Reverse String:
 *
 * "MADAM"
 *
 * Compare:
 *
 * "MADAM".equals("MADAM")
 *
 * Result:
 *
 * true
 *
 * ===================================================
 * Why use equals() instead of == ?
 *
 * == compares object references
 * (memory addresses).
 *
 * equals() compares the actual
 * contents of the String.
 *
 * Example:
 *
 * String a = "Java";
 * String b = new String("Java");
 *
 * a == b
 *
 * false
 *
 * a.equals(b)
 *
 * true
 *
 * ===================================================
 * Why use toString()?
 *
 * StringBuilder and String
 * are different classes.
 *
 * StringBuilder:
 *
 * Stores mutable characters.
 *
 * String:
 *
 * Immutable sequence of characters.
 *
 * Therefore,
 *
 * Convert StringBuilder
 * into String using:
 *
 * sb.toString()
 *
 * ===================================================
 * Important Methods Used
 *
 * StringBuilder()
 *
 * Creates an empty StringBuilder.
 *
 * -----------------------------------
 *
 * append(char)
 *
 * Adds a character
 * at the end.
 *
 * Example:
 *
 * sb.append('A');
 *
 * -----------------------------------
 *
 * toString()
 *
 * Converts StringBuilder
 * into String.
 *
 * -----------------------------------
 *
 * equals()
 *
 * Compares the contents
 * of two Strings.
 *
 * ===================================================
 * Time Complexity:
 *
 * O(n)
 *
 * Reverse traversal
 * +
 * String comparison
 *
 * ===================================================
 * Space Complexity:
 *
 * O(n)
 *
 * StringBuilder stores
 * the reversed String.
 *
 * ===================================================
 * Better Solution
 *
 * Instead of creating
 * another String,
 * use Two Pointers.
 *
 * Compare:
 *
 * First Character
 *        &
 * Last Character
 *
 * Continue until
 * both pointers meet.
 *
 * Time:
 * O(n)
 *
 * Space:
 * O(1)
 *
 * ===================================================
 * Pattern Used:
 *
 * Reverse Traversal
 * +
 * StringBuilder
 *
 * ===================================================
 * Key Takeaway:
 *
 * Reverse the String.
 *
 * Compare the reversed String
 * with the original String.
 *
 * Always use equals()
 * for String comparison,
 * never use ==.
 */

public class Q4_Palindrome {

    // ---------------------------------------------------
    // Returns true if the given String
    // is a palindrome.
    // ---------------------------------------------------
    static boolean isPalindrome(String s) {

        // Create an empty StringBuilder
        // to store the reversed String.
        StringBuilder sb = new StringBuilder();

        // Traverse from the last character
        // to the first character.
        for (int i = s.length() - 1; i >= 0; i--) {

            // Append the current character.
            sb.append(s.charAt(i));
        }

        // Convert StringBuilder into String
        // and compare with the original String.
        return sb.toString().equals(s);
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