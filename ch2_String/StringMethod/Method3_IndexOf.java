package ch2_String.StringMethod;

public class Method3_IndexOf {

    static int indexOf(String s1, char c) {
        s1 = s1.toLowerCase();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == c) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String s = "java";

        char c = 'k';
        System.out.println(indexOf(s, c));
        System.out.println("Inbuilt way---------------");
        System.out.println(s.indexOf('a'));
    }
}
