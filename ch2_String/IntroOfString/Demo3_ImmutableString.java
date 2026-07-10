package ch2_String.IntroOfString;

/*
 * String Immutability & Concatenation
 *
 * ===================================================
 * What is a String?
 *
 * A String is a sequence of characters.
 *
 * Example:
 *
 * "Java"
 * "Hello"
 * "OpenAI"
 *
 * ---------------------------------------------------
 * What is Immutable?
 *
 * Immutable means
 *
 * "Cannot be changed."
 *
 * Once a String object is created,
 * its value can never be modified.
 *
 * Example:
 *
 * String s = "Java";
 *
 * s = "Python";
 *
 * Here,
 *
 * "Java" is NOT modified.
 *
 * A new String object "Python"
 * is created and the reference variable
 * now points to it.
 *
 * Old Object:
 *
 * "Java"
 *
 * remains unchanged.
 *
 * ---------------------------------------------------
 * String Memory in Java
 *
 * Java stores Strings in two places:
 *
 * 1. String Constant Pool (SCP)
 *
 * 2. Heap Memory
 *
 * ---------------------------------------------------
 * String Constant Pool (SCP)
 *
 * SCP is a special memory area inside Heap.
 *
 * It stores only one copy
 * of every String literal.
 *
 * Example:
 *
 * String a = "Java";
 * String b = "Java";
 *
 * Both variables point to
 * the SAME object.
 *
 * Therefore:
 *
 * a == b
 *
 * is TRUE
 *
 * ---------------------------------------------------
 * Heap Memory
 *
 * Objects created using
 *
 * new String()
 *
 * are always stored in Heap.
 *
 * Example:
 *
 * String s = new String("Java");
 *
 * Heap:
 * "Java"
 *
 * SCP:
 * "Java"
 *
 * Two different objects exist.
 *
 * ---------------------------------------------------
 * == Operator
 *
 * Compares memory addresses.
 *
 * Same Object?
 *
 * TRUE
 *
 * Different Objects?
 *
 * FALSE
 *
 * ---------------------------------------------------
 * equals() Method
 *
 * Compares actual content.
 *
 * Example:
 *
 * "Java"
 *
 * and
 *
 * "Java"
 *
 * Content is same
 *
 * Result = TRUE
 *
 * ---------------------------------------------------
 * String Concatenation
 *
 * Concatenation means
 *
 * Joining two or more Strings.
 *
 * Example:
 *
 * "Hello" + "World"
 *
 * =
 *
 * "HelloWorld"
 *
 * ---------------------------------------------------
 * There are TWO types of concatenation:
 *
 * 1. Compile-Time Concatenation
 *
 * 2. Run-Time Concatenation
 *
 * ===================================================
 * 1. Compile-Time Concatenation
 *
 * If every operand is a String literal,
 * Java joins them during compilation.
 *
 * Example:
 *
 * "Ja" + "va"
 *
 * becomes
 *
 * "Java"
 *
 * before the program starts.
 *
 * The resulting String is stored
 * inside the String Constant Pool.
 *
 * ---------------------------------------------------
 * 2. Run-Time Concatenation
 *
 * If at least one operand
 * is a variable,
 *
 * Java performs concatenation
 * while the program is executing.
 *
 * The new String is created
 * in Heap Memory.
 *
 * Example:
 *
 * String s = "Ja";
 *
 * s + "va"
 *
 * creates a NEW object in Heap.
 *
 * Even if the content becomes "Java",
 * it is NOT the same object
 * as the SCP String.
 *
 * ---------------------------------------------------
 * Summary
 *
 * Literal + Literal
 *
 * Compile Time
 *
 * Stored in SCP
 *
 * -----------------------------------
 *
 * Variable + Literal
 *
 * Run Time
 *
 * Stored in Heap
 *
 * ===================================================
 */

public class Demo3_ImmutableString {

    public static void main(String[] args) {

        // ===================================================
        // COMPILE-TIME CONCATENATION
        // ===================================================

        // Both operands are String literals.
        // Java combines them during compilation.
        // Result: "java"
        // Stored inside the String Constant Pool.

        String s1 = "ja" + "va";

        // Same literal already exists in SCP.
        String s2 = "java";

        // Both references point to the same object.
        System.out.println(s1 == s2); // true

        // ===================================================
        // RUN-TIME CONCATENATION
        // ===================================================

        // Stored in SCP.
        String s3 = "ja";

        // Since s3 is a variable,
        // concatenation happens at run time.
        // A NEW object is created in Heap.

        String s4 = s3 + "va";

        // Stored in SCP.
        String s5 = "java";

        // Different objects.
        System.out.println(s3 == s4); // false

        // Same content.
        // Different memory locations.
        System.out.println(s5 == s4); // false

        // If we compare content:
        System.out.println(s5.equals(s4)); // true

        // ===================================================
        // ASSIGNING REFERENCES
        // ===================================================

        String st1 = "java";

        // st2 refers to exactly
        // the same object as st1.
        String st2 = st1;

        System.out.println(st1 == st2); // true

        // ===================================================
        // IMMUTABILITY
        // ===================================================

        String st3 = "Hello";

        /*
         * This DOES NOT change "Hello".
         *
         * A new object "World"
         * is created.
         *
         * st3 now points to
         * the new object.
         *
         * Old object:
         *
         * "Hello"
         *
         * becomes eligible for
         * Garbage Collection
         * if no reference points to it.
         */

        st3 = "World";

        System.out.println(st3);

        // ===================================================
        // new String()
        // ===================================================

        /*
         * Creates TWO objects:
         *
         * 1. "Hello" in SCP
         * (if not already present)
         *
         * 2. Another "Hello"
         * in Heap Memory.
         */

        String str1 = new String("Hello");

        // Stored in SCP.
        String str2 = "Hello";

        // Different memory locations.
        System.out.println(str1 == str2); // false

        // Same content.
        System.out.println(str1.equals(str2)); // true
    }
}