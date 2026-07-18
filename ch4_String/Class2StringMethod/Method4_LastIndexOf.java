package ch4_String.Class2StringMethod;

import java.util.Scanner;

public class Method4_LastIndexOf {

    // ============================================================
    // IMPORTANT NOTES
    // ------------------------------------------------------------
    // 1. lastIndexOf() returns the index of the last occurrence.
    // 2. If the character is not found, it returns -1.
    // 3. Traverse the string from right to left.
    // 4. Strings are immutable.
    //    s = s.toLowerCase() creates a new String.
    // 5. Time Complexity : O(n)
    // 6. Space Complexity : O(1)
    // ============================================================

    static int lastIndexOf(String s, char c) {

        // Convert to lowercase for case-insensitive search
        s = s.toLowerCase();

        // Better:
        // c = Character.toLowerCase(c);

        // Start from the last index
        for (int i = s.length() - 1; i >= 0; i--) {

            // Current character
            char ch = s.charAt(i);

            // Return immediately when found
            if (ch == c) {
                return i;
            }
        }

        // Character not found
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(lastIndexOf(s, c));

        sc.close();
    }
}