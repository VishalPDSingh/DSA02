package ch2_String.Question;

import java.util.Scanner;

public class Q8_StrongPasswor {

    static String password(String s)
    {
        if(s.length()<6)
        {
            System.out.println("Out of length");
        }

        String s1 = "";

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c!='0'&&c!='1'&&c!='2'&&c!='3'&&c!='4'&&c!='5'&&c!='6'&&c!='7'&&c!='8'&&c!='9')
            {
                System.out.println("digit is missing");
            }
            else
            {
                s1 = s1+c;
            }
        }
        return s1;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String pass = password(s);

        System.out.println(pass);
        sc.close();
    }
}
