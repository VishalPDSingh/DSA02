package ch2_String.Question;

import java.util.Scanner;

/*
 * Remove All Vowels from a String
 *
 * ===================================================
 * Problem:
 *
 * Given a String,
 * remove all vowels
 * and return the new String.
 *
 * Vowels:
 *
 * a, e, i, o, u
 *
 * Both uppercase
 * and lowercase vowels
 * should be removed.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Input:
 * education
 *
 * Output:
 * dctn
 *
 * ===================================================
 * Solution Intuition
 *
 * Traverse every character.
 *
 * If the character
 * is NOT a vowel,
 * append it
 * to a new String.
 *
 * Finally,
 * return the new String.
 *
 * ===================================================
 * Time Complexity:
 *
 * O(n)
 *
 * Space Complexity:
 *
 * O(n)
 */

public class Q7_RemoveVowel {

    // Returns a String
    // after removing all vowels.
    static String removeVowel(String s) {

        String result = "";

        // Traverse the String.
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // Keep only consonants.
            if (c != 'a' && c != 'e' && c != 'i' &&
                c != 'o' && c != 'u' &&
                c != 'A' && c != 'E' && c != 'I' &&
                c != 'O' && c != 'U') {

                result = result + c;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");

        String s = sc.next();

        String result = removeVowel(s);

        System.out.println("After Removing Vowels: " + result);

        sc.close();
    }
}