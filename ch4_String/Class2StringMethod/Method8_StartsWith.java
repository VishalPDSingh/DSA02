package ch4_String.Class2StringMethod;

import java.util.Scanner;

public class Method8_StartsWith {

    // ============================================================
    // IMPORTANT NOTES
    // ------------------------------------------------------------
    // 1. startsWith() checks whether a string begins with
    // the given prefix.
    // 2. Comparison starts from index 0.
    // 3. If the prefix is longer than the string,
    // return false immediately.
    // 4. Time Complexity : O(m)
    // (m = length of prefix)
    // 5. Space Complexity : O(1)
    // ============================================================

    static boolean startsWith(String s1, String s2) {

        // Prefix cannot be longer than original string
        if (s2.length() > s1.length()) {
            return false;
        }

        // Compare characters one by one
        for (int i = 0; i < s2.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(startsWith(s1, s2));

        sc.close();
    }
}