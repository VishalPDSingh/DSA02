package ch5_Hashing.Question_HashMap;

/*
 * Find the Character with Maximum Frequency
 * (Brute Force Approach)
 *
 * ===================================================
 * Problem:
 *
 * Given a String,
 * find the character that appears
 * the maximum number of times.
 *
 * If multiple characters have the same
 * maximum frequency,
 * return the character whose maximum
 * frequency is found first during traversal.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Input:
 *
 * banana
 *
 * Frequency:
 *
 * b -> 1
 * a -> 3
 * n -> 2
 *
 * Output:
 *
 * a
 *
 * ===================================================
 * Brute Force Idea
 *
 * For every character,
 * count how many times it appears
 * in the String.
 *
 * While counting,
 * keep track of the character having
 * the highest frequency.
 *
 * ===================================================
 * Solution Intuition
 *
 * Since we do not know the frequency
 * of any character,
 * we compare every character
 * with all remaining characters.
 *
 * This requires two loops.
 *
 * Outer Loop:
 *
 * Picks one character.
 *
 * Inner Loop:
 *
 * Counts how many times
 * that character appears.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Assume the first character
 * is the answer.
 *
 * Step 2:
 *
 * Traverse every character.
 *
 * Step 3:
 *
 * Count its frequency
 * using another loop.
 *
 * Step 4:
 *
 * If current frequency is greater
 * than maximum frequency,
 * update:
 *
 * maxFreq
 *
 * and
 *
 * answer character.
 *
 * Step 5:
 *
 * Return the answer.
 *
 * ===================================================
 * Dry Run
 *
 * Input:
 *
 * "banana"
 *
 * -----------------------------------
 * i = 0
 *
 * Character = b
 *
 * Frequency = 1
 *
 * maxFreq = 1
 *
 * answer = b
 *
 * -----------------------------------
 * i = 1
 *
 * Character = a
 *
 * Frequency = 3
 *
 * maxFreq = 3
 *
 * answer = a
 *
 * -----------------------------------
 * i = 2
 *
 * Character = n
 *
 * Frequency = 2
 *
 * maxFreq remains 3
 *
 * -----------------------------------
 * Remaining characters
 * produce no larger frequency.
 *
 * Final Answer:
 *
 * a
 *
 * ===================================================
 * Why does the Inner Loop
 * start from i + 1 ?
 *
 * Frequency is initialized as 1
 * because the current character
 * itself is already counted.
 *
 * Therefore,
 * we only need to check
 * the remaining characters.
 *
 * ===================================================
 * Important Variables
 *
 * maxFreq
 *
 * Stores the highest frequency
 * found so far.
 *
 * -----------------------------------
 *
 * freq
 *
 * Stores the frequency of the
 * current character.
 *
 * -----------------------------------
 *
 * ch
 *
 * Stores the answer.
 *
 * ===================================================
 * Limitation
 *
 * This algorithm counts the
 * frequency of the same character
 * multiple times.
 *
 * Example:
 *
 * banana
 *
 * Frequency of 'a'
 * is calculated three times.
 *
 * This makes the algorithm slow.
 *
 * ===================================================
 * Better Solution
 *
 * Use HashMap<Character, Integer>
 *
 * Store every character's frequency
 * only once.
 *
 * Time Complexity:
 *
 * O(n)
 *
 * ===================================================
 * Time Complexity:
 *
 * O(n²)
 *
 * Outer Loop:
 * O(n)
 *
 * Inner Loop:
 * O(n)
 *
 * Total:
 *
 * O(n²)
 *
 * ===================================================
 * Space Complexity:
 *
 * O(1)
 *
 * (Ignoring the input String,
 * only a few variables are used.)
 *
 * ===================================================
 * Pattern Used:
 *
 * Frequency Counting
 *
 * ===================================================
 * Key Takeaway:
 *
 * Brute Force:
 *
 * Count every character
 * by comparing it with
 * all remaining characters.
 *
 * Better Approach:
 *
 * Use HashMap
 * to store frequencies
 * in one traversal.
 */

import java.util.Scanner;

public class Q1_FindMaxChar_Freq {

    // ---------------------------------------------------
    // Returns the character having
    // the maximum frequency.
    // ---------------------------------------------------
    static char charFreq(String s) {

        // Stores the maximum frequency found.
        int maxFreq = 0;

        // Assume first character as answer.
        char ch = s.charAt(0);

        // Pick one character at a time.
        for (int i = 0; i < s.length(); i++) {

            // Current character appears once.
            int freq = 1;

            // Count occurrences of the
            // current character.
            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {

                    freq++;
                }
            }

            // Update answer if a larger
            // frequency is found.
            if (freq > maxFreq) {

                maxFreq = freq;

                ch = s.charAt(i);
            }
        }

        return ch;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");

        String s = sc.next();

        char result = charFreq(s);

        System.out.println("Maximum Frequency Character: " + result);

        sc.close();
    }
}