package ch2_String.Question;

import java.util.Scanner;

/*
 * Convert String to Character Array
 *
 * ===================================================
 * Problem:
 *
 * Convert a given String into
 * a character array.
 *
 * There are two approaches:
 *
 * 1. Using Java's built-in method
 *      toCharArray()
 *
 * 2. Manually using charAt()
 *
 * ===================================================
 * Example:
 *
 * Input:
 *
 * Hello
 *
 * Output:
 *
 * H
 * e
 * l
 * l
 * o
 *
 * ===================================================
 * Solution Intuition
 *
 * A String is internally stored as
 * a sequence of characters.
 *
 * We can access every character
 * using:
 *
 * charAt(index)
 *
 * Therefore,
 * create a character array of the
 * same length and copy every
 * character one by one.
 *
 * ===================================================
 * Approach 1
 *
 * Using Built-in Method
 *
 * char[] arr = str.toCharArray();
 *
 * Java automatically creates
 * a new character array and
 * copies every character.
 *
 * Time Complexity:
 *
 * O(n)
 *
 * ===================================================
 * Approach 2
 *
 * Manual Conversion
 *
 * Step 1:
 *
 * Create a character array
 * of size String length.
 *
 * Step 2:
 *
 * Traverse the String.
 *
 * Step 3:
 *
 * Store each character using
 * charAt(i).
 *
 * Step 4:
 *
 * Return the character array.
 *
 * ===================================================
 * Dry Run
 *
 * String:
 *
 * "JAVA"
 *
 * Length = 4
 *
 * Character Array:
 *
 * Initially
 *
 * [ , , , ]
 *
 * i = 0
 *
 * c[0] = 'J'
 *
 * i = 1
 *
 * c[1] = 'A'
 *
 * i = 2
 *
 * c[2] = 'V'
 *
 * i = 3
 *
 * c[3] = 'A'
 *
 * Final Array:
 *
 * ['J','A','V','A']
 *
 * ===================================================
 * Important String Methods
 *
 * length()
 *
 * Returns the length of the String.
 *
 * Example:
 *
 * "Hello".length()
 *
 * = 5
 *
 * -----------------------------------
 *
 * charAt(index)
 *
 * Returns the character
 * present at the given index.
 *
 * Example:
 *
 * "Java".charAt(2)
 *
 * = 'v'
 *
 * -----------------------------------
 *
 * toCharArray()
 *
 * Converts the complete String
 * into a character array.
 *
 * ===================================================
 * Why Create a New Array?
 *
 * Strings are IMMUTABLE.
 *
 * Their characters cannot be changed.
 *
 * Therefore,
 * if we want to modify individual
 * characters,
 * we first convert the String
 * into a character array.
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
 * Character array of size n.
 *
 * ===================================================
 * Pattern Used:
 *
 * String Traversal
 *
 * ===================================================
 * Key Takeaway:
 *
 * Method                 Use
 *
 * charAt(i)          -> Access one character
 *
 * toCharArray()      -> Convert entire String
 *
 * length()           -> Get String length
 */

public class Q1_StringToArray {

    // ---------------------------------------------------
    // Convert String into Character Array manually.
    // ---------------------------------------------------
    static char[] stringArray(String s) {

        // Create a character array
        // of the same length.
        char c[] = new char[s.length()];

        // Copy every character
        // into the array.
        for (int i = 0; i < s.length(); i++) {

            c[i] = s.charAt(i);
        }

        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");

        String s = sc.next();

        // -------------------------------
        // Built-in Method
        // -------------------------------
        char[] s1 = s.toCharArray();

        System.out.println("Using toCharArray():");

        // Printing a char array directly
        // prints the characters.
        System.out.println(s1);

        // -------------------------------
        // Manual Method
        // -------------------------------
        char c[] = stringArray(s);

        System.out.println("Using charAt():");

        for (char ch : c) {

            System.out.println(ch);
        }

        sc.close();
    }
}