package ch1_Array.Class1EasyQuestion;

public class Demo1 {
    public static void main(String[] args) {

        // Array Introduction
        int a = 10;
        System.out.println(a);
        // if we want the 10 integr then we have 10 variable

        int arr[]; // Array declaration
        // ref variable created in the stack
        // null= its is type of value that is initial value for all the array object.

        arr = new int[10]; // intialization
        // new allocate the space in the heap memory
        System.out.println(arr);

        // create an array of size 10 which will store integer.
        int arr1[] = new int[10];
        arr1[0] = 5;
        arr1[4] = 14;

    }
}
