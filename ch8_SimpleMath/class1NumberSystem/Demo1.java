package ch8_SimpleMath.class1NumberSystem;

public class Demo1 {
    public static void main(String[] args) {
         int decimal     = 45;       // No prefix
        int binary      = 0b101101; // 0b prefix for base 2
        int octal       = 055;      // 0 prefix for base 8 (Careful: leading zero changes base!)
        int hexadecimal = 0x2D;     // 0x prefix for base 16

        // All print 45 because Java automatically prints in Decimal by default
        System.out.println(decimal);     // Output: 45
        System.out.println(binary);      // Output: 45
        System.out.println(octal);       // Output: 45
        System.out.println(hexadecimal); // Output: 45
    }
}
