package ch4_String.Class2StringMethod;

import java.util.Scanner;

public class Method7_Equal {

    // ============================================================
    // IMPORTANT NOTES
    // ------------------------------------------------------------
    // 1. equals() compares the CONTENT of two strings.
    // 2. It returns true only if both strings contain exactly
    //    the same characters in the same order.
    // 3. First compare lengths.
    //    If lengths differ, strings cannot be equal.
    // 4. Then compare characters one by one.
    // 5. Time Complexity : O(n)
    // 6. Space Complexity : O(1)
    // ============================================================

    static boolean equal(String s1, String s2) {

        // Step 1: Compare lengths
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: Compare each character
        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        // All characters matched
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(equal(s1, s2));

        sc.close();
    }
}