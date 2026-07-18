package ch1_Array.Class1EasyQuestion;

public class Demo3 {
    public static void main(String[] args) {
        
        int arr[];
        arr = new int[10];

        // when we try to point a ref, to string() function automatically called.
        System.out.println(arr); // [I@71d15f18 hash code 

        System.out.println(arr.toString());// [I@33cb5951
    }
}
