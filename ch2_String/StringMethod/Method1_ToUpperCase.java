package ch2_String.StringMethod;

public class Method1_ToUpperCase {

    static String toupperCase(String s1) {
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c >= 'a' && c <= 'z') {
                s2 = s2 + (char) (c - 32);
            } else {
                s2 = s2 + c;
            }
        }
        return s2;
    }

    public static void main(String[] args) {

        String s = "j1Ava";
        System.out.println(toupperCase(s));
        // direct way
        System.out.println(s.toUpperCase());
    }
}
