package ch2_String.Question;

import java.util.Scanner;

/*
 * Reverse a String Using StringBuilder
 *
 * ===================================================
 * Problem:
 *
 * Given a String,
 * reverse all of its characters.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Input:
 *
 * Hello
 *
 * Output:
 *
 * olleH
 *
 * ===================================================
 * Why StringBuilder?
 *
 * Strings in Java are IMMUTABLE.
 *
 * Every time we write:
 *
 * s = s + ch;
 *
 * Java creates a NEW String object.
 *
 * Therefore,
 * repeated concatenation becomes slow.
 *
 * StringBuilder is MUTABLE.
 *
 * It modifies the same object
 * without creating new objects.
 *
 * Hence,
 * it is much faster.
 *
 * ===================================================
 * Solution Intuition
 *
 * Traverse the String
 * from the last character
 * to the first character.
 *
 * Append every character
 * into a StringBuilder.
 *
 * Finally,
 * convert the StringBuilder
 * into a String.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Create an empty StringBuilder.
 *
 * Step 2:
 *
 * Traverse from
 *
 * length - 1
 *
 * to
 *
 * 0.
 *
 * Step 3:
 *
 * Append each character.
 *
 * Step 4:
 *
 * Convert StringBuilder
 * into String.
 *
 * Step 5:
 *
 * Return the reversed String.
 *
 * ===================================================
 * Dry Run
 *
 * String:
 *
 * "JAVA"
 *
 * -----------------------------------
 * Initially
 *
 * sb = ""
 *
 * -----------------------------------
 * i = 3
 *
 * Character = A
 *
 * sb = "A"
 *
 * -----------------------------------
 * i = 2
 *
 * Character = V
 *
 * sb = "AV"
 *
 * -----------------------------------
 * i = 1
 *
 * Character = A
 *
 * sb = "AVA"
 *
 * -----------------------------------
 * i = 0
 *
 * Character = J
 *
 * sb = "AVAJ"
 *
 * Convert:
 *
 * sb.toString()
 *
 * Returns:
 *
 * "AVAJ"
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
 * Example:
 *
 * String ans = sb.toString();
 *
 * ===================================================
 * Why use toString()?
 *
 * StringBuilder and String
 * are different classes.
 *
 * Method return type:
 *
 * String
 *
 * Therefore,
 * before returning,
 * convert StringBuilder
 * into String using
 *
 * toString().
 *
 * ===================================================
 * Time Complexity:
 *
 * O(n)
 *
 * One traversal of the String.
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
 * Pattern Used:
 *
 * Reverse Traversal
 * +
 * StringBuilder
 *
 * ===================================================
 * Key Takeaway:
 *
 * String
 * → Immutable
 *
 * StringBuilder
 * → Mutable
 *
 * For repeated modifications,
 * always prefer StringBuilder.
 */

public class Q3_ReverseString {

    // ---------------------------------------------------
    // Reverse the given String using StringBuilder.
    // ---------------------------------------------------
    static String reverse(String s) {

        // Create an empty StringBuilder
        // to store the reversed String.
        StringBuilder sb = new StringBuilder();

        // Traverse the String
        // from last index to first index.
        for (int i = s.length() - 1; i >= 0; i--) {

            // Append the current character.
            sb.append(s.charAt(i));
        }

        // Convert StringBuilder into String
        // because the method returns String.
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");

        String s = sc.next();

        String reversed = reverse(s);

        System.out.println("Reversed String:");

        System.out.println(reversed);

        sc.close();
    }
}