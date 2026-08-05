package ch4_String.Class2StringMethod;

import java.util.Scanner;

public class Q1_ReverseString {

    static String rverse(String str) {
        String s = ""; // empty string
        for (int i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }
        return s;
    }

    public static void main(String[] args) {

        // reverse String
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String line = sc.nextLine();

        String res = rverse(line);
        System.out.println(res);
        sc.close();
    }
}
