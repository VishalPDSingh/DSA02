package ch4_String.Class2StringMethod;

import java.util.Scanner;

public class Q5_IndexOf {

    static int findChar(String str, String c)
    {
        char key = c.charAt(0);

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String c = sc.nextLine();
    }
}
