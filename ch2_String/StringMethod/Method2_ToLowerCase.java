package ch2_String.StringMethod;

public class Method2_ToLowerCase {
     static String toLowerCase(String s1) {
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                s2 = s2 + (char) (c + 32);
            } else {
                s2 = s2 + c;
            }
        }
        return s2;
    }
    public static void main(String[] args) {
        
        String s = "J1aVa";
        System.out.println(toLowerCase(s));
    }
}
