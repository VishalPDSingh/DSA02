package ch4_String.Class1IntroOfString;

public class Demo5_Constuctor {
    public static void main(String[] args) {
        
        String s1 = new String();
        String s2 = new String("Hello");
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "Vishal";
        String s4 = new String(s3);
        System.out.println(s3);
        System.out.println(s4);

        // char array
        char arr[] = {'v','i','s','h','a','l'};
        String s5 = new String(arr);
        arr[0] ='B';
        System.out.println(s5); // vishal

         char arr1[] = {'v','i','s','h','a','l',' ','s','i','n','g','h'};
        String s6 = new String(arr1,0,6);
        System.out.println(s6);
    }
    
}
