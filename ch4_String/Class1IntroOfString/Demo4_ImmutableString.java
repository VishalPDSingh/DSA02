package ch4_String.Class1IntroOfString;

public class Demo4_ImmutableString {
    public static void main(String[] args) {

        String s1 = "Hello";

        for (int i = 0; i <= 5; i++) {
            s1 = s1 + "World";
            System.out.println(s1);
        }
    }
}
