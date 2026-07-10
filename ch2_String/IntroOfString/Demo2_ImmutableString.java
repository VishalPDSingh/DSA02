package ch2_String.IntroOfString;

public class Demo2_ImmutableString {
    public static void main(String[] args) {

        // way 1 linter (String pool)
        String s1 =  "Hello";
        String s2 = "Hello";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2); // ref true

        // way 2
        String s3 = new String("Vishal");
        String s4 =  new String("Vishal");
        System.out.println(s3==s4); // false

        
    }
}
