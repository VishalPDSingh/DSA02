package ch2_String.StringMethod;

import java.util.Scanner;

public class Method5_Trim {

    // ============================================================
    // IMPORTANT NOTES
    // ------------------------------------------------------------
    // 1. trim() removes only leading and trailing spaces.
    // 2. Spaces between words are NOT removed.
    // 3. Strings are immutable, so a new string is created.
    // 4. Time Complexity : O(n)
    // 5. Space Complexity : O(n)
    // ============================================================

    static String trim(String s) {

        String s1 = "";
        int si = 0, ei = 0;

        // Find first non-space character
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                si = i;
                break;
            }
        }

        // Find last non-space character
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) != ' ') {
                ei = i;
                break;
            }
        }

        // Copy characters from original string
        for (int i = si; i <= ei; i++) {
            s1 = s1 + s.charAt(i);
        }

        return s1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(trim(s));

        System.out.println(s.trim());

        sc.close();
    }
}