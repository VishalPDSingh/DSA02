package ch2_String.IntroOfString;

public class Demo6_StringBuilder {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Java ");
        sb.append("its cool");
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("JIS ");
        sb1.append("College ");
        sb1.append("Engineering ");
        sb1.append("Kalyani");
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
    }
}
