package ch2_String.StringMethod;

import java.util.Scanner;

public class Method6_TocharArray {

    // ============================================================
    // IMPORTANT NOTES
    // ------------------------------------------------------------
    // 1. toCharArray() converts a String into a character array.
    // 2. Each character is copied into a new array.
    // 3. Strings are immutable but arrays are mutable.
    // 4. Time Complexity : O(n)
    // 5. Space Complexity : O(n)
    // ============================================================

    static char[] charArray(String s) {

        // Create array of same size as string
        char arr[] = new char[s.length()];

        // Copy each character
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char arr[] = charArray(s);

        // Print each character
        for (char ch : arr) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}