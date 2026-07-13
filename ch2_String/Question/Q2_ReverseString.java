package ch2_String.Question;

import java.util.Scanner;

/*
 * Reverse a String
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
 * Solution Intuition
 *
 * The last character of the original
 * String becomes the first character
 * of the reversed String.
 *
 * Therefore,
 * traverse the String from
 * the last index to the first index
 * and append each character
 * into a new String.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Create an empty String.
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
 * Append each character
 * into the new String.
 *
 * Step 4:
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
 * Initially:
 *
 * answer = ""
 *
 * -----------------------------------
 *
 * i = 3
 *
 * Character = A
 *
 * answer = "A"
 *
 * -----------------------------------
 *
 * i = 2
 *
 * Character = V
 *
 * answer = "AV"
 *
 * -----------------------------------
 *
 * i = 1
 *
 * Character = A
 *
 * answer = "AVA"
 *
 * -----------------------------------
 *
 * i = 0
 *
 * Character = J
 *
 * answer = "AVAJ"
 *
 * ===================================================
 * Important Concept
 *
 * Strings are IMMUTABLE.
 *
 * This statement:
 *
 * answer = answer + ch;
 *
 * does NOT modify
 * the existing String.
 *
 * Instead,
 * Java creates a NEW String object
 * every time.
 *
 * Example:
 *
 * answer = ""
 *
 * answer = "A"
 *
 * answer = "AV"
 *
 * answer = "AVA"
 *
 * answer = "AVAJ"
 *
 * Multiple String objects
 * are created.
 *
 * ===================================================
 * Better Approach
 *
 * Use StringBuilder.
 *
 * StringBuilder is mutable.
 *
 * It modifies the existing object
 * instead of creating new objects.
 *
 * Example:
 *
 * StringBuilder sb = new StringBuilder();
 *
 * sb.append(ch);
 *
 * Time Complexity:
 *
 * O(n)
 *
 * ===================================================
 * Time Complexity:
 *
 * Current Approach
 *
 * O(n²)
 *
 * Because every concatenation
 * creates a new String.
 *
 * ===================================================
 * Space Complexity:
 *
 * O(n)
 *
 * Reversed String.
 *
 * ===================================================
 * Pattern Used:
 *
 * Reverse Traversal
 *
 * ===================================================
 * Key Takeaway:
 *
 * Traverse from right to left.
 *
 * Append every character
 * into a new String.
 *
 * For better performance,
 * prefer StringBuilder.
 */

public class Q2_ReverseString {

    // ---------------------------------------------------
    // Reverse the given String.
    // ---------------------------------------------------
    static String reverse(String s) {

        // Stores the reversed String.
        String s1 = "";

        // Traverse from the last character
        // towards the first character.
        for (int i = s.length() - 1; i >= 0; i--) {

            // Extract current character.
            char c = s.charAt(i);

            // Append character to the answer.
            // A new String object is created
            // because Strings are immutable.
            s1 = s1 + c;
        }

        return s1;
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