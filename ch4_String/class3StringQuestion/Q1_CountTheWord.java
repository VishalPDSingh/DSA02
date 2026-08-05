package ch4_String.class3StringQuestion;

/*
 * Count Total Words in a String Array
 *
 * ===================================================
 * Problem:
 *
 * Given an array
 * of strings,
 * count the total
 * number of words.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Input:
 *
 * {
 *   "alice and bob love leetcode",
 *   "i think so too",
 *   "this is great thanks very much"
 * }
 *
 * Output:
 *
 * Total words = 15
 *
 * ===================================================
 * What is the Idea?
 *
 * Each element
 * of the array
 * is a sentence.
 *
 * Split
 * each sentence
 * into words
 * using spaces.
 *
 * Count
 * the number
 * of words
 * in each sentence.
 *
 * Add
 * all counts
 * together.
 *
 * ===================================================
 * Main Idea
 *
 * Step 1:
 *
 * Traverse
 * every string
 * in the array.
 *
 * Step 2:
 *
 * Split
 * the sentence
 * into words.
 *
 * Step 3:
 *
 * Count
 * the number
 * of words.
 *
 * Step 4:
 *
 * Add
 * the count
 * to the total.
 *
 * Step 5:
 *
 * Return
 * the total count.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Initialize
 *
 * count = 0
 *
 * Step 2:
 *
 * Traverse
 * the array.
 *
 * Step 3:
 *
 * Split
 * every string
 * using
 *
 * "\\s+"
 *
 * Step 4:
 *
 * Add
 * words.length
 * to count.
 *
 * Step 5:
 *
 * Return
 * count.
 *
 * ===================================================
 * Dry Run
 *
 * Array:
 *
 * "alice and bob love leetcode"
 *
 * Split:
 *
 * alice
 * and
 * bob
 * love
 * leetcode
 *
 * Count = 5
 *
 * -----------------------------------
 *
 * "i think so too"
 *
 * Split:
 *
 * i
 * think
 * so
 * too
 *
 * Count = 4
 *
 * Total = 9
 *
 * -----------------------------------
 *
 * "this is great thanks very much"
 *
 * Split:
 *
 * this
 * is
 * great
 * thanks
 * very
 * much
 *
 * Count = 6
 *
 * Total = 15
 *
 * ===================================================
 * Why
 *
 * split("\\s+") ?
 *
 * "\\s"
 *
 * means
 * white space.
 *
 * "+"
 *
 * means
 * one or more.
 *
 * Therefore,
 * the sentence
 * is divided
 * at one or more spaces.
 *
 * Example:
 *
 * "I   Love   Java"
 *
 * becomes
 *
 * I
 * Love
 * Java
 *
 * ===================================================
 * Time Complexity
 *
 * O(n)
 *
 * where
 *
 * n
 *
 * is the total
 * number of characters
 * in all strings.
 *
 * ===================================================
 * Space Complexity
 *
 * O(w)
 *
 * where
 *
 * w
 *
 * is the number
 * of words
 * after splitting.
 *
 * ===================================================
 * Pattern Used
 *
 * String Traversal
 *
 * +
 *
 * String Splitting
 *
 * ===================================================
 * Key Takeaway
 *
 * Traverse
 * every sentence.
 *
 * Split
 * the sentence
 * into words.
 *
 * Count
 * the words.
 *
 * Add
 * them
 * to the total.
 */

public class Q1_CountTheWord {

    static int countWord(String word[]) {

        int count = 0;

        for (int i = 0; i < word.length; i++) {

            // Split the sentence into words
            String[] words = word[i].split("\\s+");

            // Add number of words
            count += words.length;
        }

        return count;
    }

    public static void main(String[] args) {

        String ans[] = {
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
        };

        int result = countWord(ans);

        System.out.println("Total words = " + result);
    }
}