package ch2_String.IntroOfString;

import java.util.Scanner;

public class Demo1String {
    public static void main(String[] args) {
        
        String s1 = "DSA"; 

        System.out.println(s1);

        // user intput
        Scanner sc = new Scanner(System.in);

     //   String s2 = sc.next(); // this single words
     //   System.out.println(s2);

        String s3 = sc.nextLine();
        System.out.println(s3); // this take single word and the statements
        sc.close();
    }
}
