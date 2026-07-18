package ch4_String.Class1IntroOfString;

// ===================== IMPORTANT NOTES =====================

// 1. String is IMMUTABLE.
//    Once a String object is created, its content cannot be changed.

// 2. s1 = s1 + "Coder Army";
//    This does NOT modify the original String.
//    A new String object is created, and the local reference points to it.

// 3. Java passes object references by VALUE.
//    The method receives a copy of the reference, not the original variable.

// 4. Changing the local String reference inside the method
//    does NOT affect the original String in main().

// 5. StringBuffer is MUTABLE.
//    Its content can be changed without creating a new object.

// 6. sb.append(" World");
//    append() modifies the same StringBuffer object.

// 7. Since both references point to the same StringBuffer object,
//    changes made inside the method are visible in main().

// ===================== OUTPUT =====================
// String:
// DSACoder Army
// DSA
//
// StringBuffer:
// Hello World
// Hello World
public class Demo7_StringAsFunction {

    static void modifyingString(String s1) {
        s1 = s1 + "Coder Army";
        System.out.println(s1);
    }

    static void modifyingBuffer(StringBuffer sb) {
        sb.append("World");
        // System.out.println(sb);
    }

    public static void main(String[] args) {

        String s1 = "DSA";
        modifyingString(s1);
        System.out.println(s1);

        StringBuffer sb = new StringBuffer("Hello ");
        modifyingBuffer(sb);
        System.out.println(sb);
    }
}