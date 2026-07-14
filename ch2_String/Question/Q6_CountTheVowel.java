package ch2_String.Question;

import java.util.Scanner;

/*
 * Count the Number of Vowels in a String
 *
 * ===================================================
 * Problem:
 *
 * Given a String,
 * count the total number
 * of vowels present in it.
 *
 * Vowels are:
 *
 * a, e, i, o, u
 *
 * Both uppercase
 * and lowercase vowels
 * should be counted.
 *
 * ---------------------------------------------------
 * Examples:
 *
 * Input:
 * Hello
 *
 * Output:
 * 2
 *
 * Explanation:
 *
 * Vowels are:
 * e, o
 *
 * -------------------------
 *
 * Input:
 * PROGRAMMING
 *
 * Output:
 * 3
 *
 * Explanation:
 *
 * Vowels are:
 * O, A, I
 *
 * ===================================================
 * Solution Intuition
 *
 * Traverse the String
 * one character at a time.
 *
 * For every character,
 * check whether it is
 * a vowel.
 *
 * If it is a vowel,
 * increase the count.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 * Initialize
 *
 * count = 0
 *
 * Step 2:
 * Traverse the String
 * from index 0
 * to length - 1.
 *
 * Step 3:
 * Extract the current character
 * using charAt().
 *
 * Step 4:
 * Check whether the character
 * is a vowel.
 *
 * If yes,
 * increment count.
 *
 * Step 5:
 * Return count.
 *
 * ===================================================
 * Dry Run
 *
 * Input:
 *
 * "Hello"
 *
 * -----------------------------------
 *
 * count = 0
 *
 * i = 0
 *
 * Character = H
 *
 * Not a vowel
 *
 * count = 0
 *
 * -----------------------------------
 *
 * i = 1
 *
 * Character = e
 *
 * Vowel
 *
 * count = 1
 *
 * -----------------------------------
 *
 * i = 2
 *
 * Character = l
 *
 * Not a vowel
 *
 * count = 1
 *
 * -----------------------------------
 *
 * i = 3
 *
 * Character = l
 *
 * Not a vowel
 *
 * count = 1
 *
 * -----------------------------------
 *
 * i = 4
 *
 * Character = o
 *
 * Vowel
 *
 * count = 2
 *
 * Return:
 *
 * 2
 *
 * ===================================================
 * Why use charAt()?
 *
 * charAt(index)
 * returns the character
 * present at the specified index.
 *
 * It allows us
 * to examine each character
 * individually.
 *
 * ===================================================
 * Important Methods Used
 *
 * length()
 *
 * Returns the total number
 * of characters.
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
 * Every character
 * is visited exactly once.
 *
 * ===================================================
 * Space Complexity:
 *
 * O(1)
 *
 * Only one integer variable
 * (count)
 * is used.
 *
 * ===================================================
 * Pattern Used:
 *
 * String Traversal
 *
 * ===================================================
 * Key Takeaway:
 *
 * Traverse the String
 * character by character.
 *
 * Check whether each character
 * is a vowel.
 *
 * Increase the count
 * whenever a vowel is found.
 */

public class Q6_CountTheVowel {

    // ---------------------------------------------------
    // Returns the total number
    // of vowels present
    // in the given String.
    // ---------------------------------------------------
    static int countVowel(String s) {

        // Stores the total
        // number of vowels.
        int count = 0;

        // Traverse the String.
        for (int i = 0; i < s.length(); i++) {

            // Get the current character.
            char c = s.charAt(i);

            // Check whether
            // the current character
            // is a vowel.
            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' ||
                c == 'O' || c == 'U') {

                // Increase vowel count.
                count++;
            }
        }

        // Return total vowels.
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");

        String s = sc.next();

        int result = countVowel(s);

        System.out.println("Number of Vowels = " + result);

        sc.close();
    }
}