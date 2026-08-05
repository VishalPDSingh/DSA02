package ch4_String.Class2StringMethod;

import java.util.Scanner;

public class Q2_ReverseString_Builder {

    static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String res = reverseString(str);

        System.out.println("Reversed String: " + res);

        sc.close();
    }
}