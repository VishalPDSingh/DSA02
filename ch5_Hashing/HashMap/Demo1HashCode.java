package ch5_Hashing.HashMap;

public class Demo1HashCode {
    public static void main(String[] args) {
        
        // 1. String HashCode (Calculated using a formula based on character values)
        String s = "Vishal";
        int stringCode = s.hashCode();
        System.out.println("String 'Vishal' HashCode: " + stringCode);

        // 2. Integer HashCode: The hash code of a number is the number itself!
        Integer num = 12345;
        System.out.println("Integer 12345 HashCode: " + num.hashCode());

        // 3. Character HashCode: The hash code of a char is its ASCII/Unicode value.
        Character ch = 'A'; // ASCII value of 'A' is 65
        System.out.println("Character 'A' HashCode: " + ch.hashCode());
        
        Character chSmall = 'a'; // ASCII value of 'a' is 97
        System.out.println("Character 'a' HashCode: " + chSmall.hashCode());

        // 4. Boolean HashCode: Mechanically mapped constants
        Boolean t = true;  // Java assigns 1231
        Boolean f = false; // Java assigns 1237
        System.out.println("Boolean true HashCode: " + t.hashCode());
        System.out.println("Boolean false HashCode: " + f.hashCode());
    }
}