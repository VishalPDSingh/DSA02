package ch4_String.Class2StringMethod;

import java.util.Scanner;

public class Q4_ToLowerCase {

    static String tolowerCase(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string in the upper case: ");
        String s = sc.nextLine();

        String res = tolowerCase(s);
        System.out.println(res);
        sc.close();
    }
}
