package ch2_String.StringMethod;

public class Method3_IndexOf {

    // ============================================================
    // IMPORTANT NOTES
    // ------------------------------------------------------------
    // 1. indexOf() returns the index of the first occurrence.
    // 2. If the character is not found, it returns -1.
    // 3. Strings are immutable.
    //    s1 = s1.toLowerCase() creates a new String.
    // 4. charAt(i) is used to access each character.
    // 5. Time Complexity : O(n)
    // 6. Space Complexity : O(1)
    // ============================================================

    // Custom implementation of indexOf()
    static int indexOf(String s1, char c) {

        // Convert string into lowercase for case-insensitive search.
        // NOTE:
        // If the searched character can be uppercase,
        // also convert c = Character.toLowerCase(c);
        s1 = s1.toLowerCase();

        // Traverse the complete string
        for (int i = 0; i < s1.length(); i++) {

            // Get current character
            char ch = s1.charAt(i);

            // Return index when character is found
            if (ch == c) {
                return i;
            }
        }

        // Character not found
        return -1;
    }

    // Find the k-th occurrence of a character
    static int ooc_IndexOf(String s, char c, int k) {

        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == c) {

                // Count every occurrence
                count++;

                // When count becomes k, return index
                if (k == count) {
                    return i;
                }
            }
        }

        // k-th occurrence doesn't exist
        return -1;
    }

    public static void main(String[] args) {

        String s = "java";

        char c = 'a';

        // First occurrence
        System.out.println(indexOf(s, c));

        // Second occurrence
        int k = 2;
        System.out.println(ooc_IndexOf(s, c, k));

        System.out.println("Inbuilt way---------------");

        // Built-in indexOf()
        System.out.println(s.indexOf('a'));
    }
}