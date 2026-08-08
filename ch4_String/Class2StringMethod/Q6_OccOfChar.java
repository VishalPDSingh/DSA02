package ch4_String.Class2StringMethod;

import java.util.Scanner;

public class Q6_OccOfChar {

    static int occOfChar(String str, char c, int k) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
                if (count == k) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();

        System.out.println("Enter the char: ");
        char c = sc.next().charAt(0);

        System.out.println("Enter the value of k");
        int k = sc.nextInt();

        int res = occOfChar(s, c, k);
        System.out.println(res);
        sc.close();
    }
}
