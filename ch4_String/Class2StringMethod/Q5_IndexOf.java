package ch4_String.Class2StringMethod;

import java.util.Scanner;

public class Q5_IndexOf {

    static int findChar(String str, char key) {

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        System.out.print("Enter Character: ");
        char c = sc.next().charAt(0);

        System.out.println("Index: " + findChar(s, c));

        sc.close();
    }
}
