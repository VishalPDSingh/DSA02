package ch4_String.Class2StringMethod;

import java.util.Scanner;

public class Q3_ToUpperCase {

    static String toupperCase(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string in the lower case: ");
        String s = sc.nextLine();

        String ans = toupperCase(s);
        System.out.println(ans);
        sc.close();
    }
}
