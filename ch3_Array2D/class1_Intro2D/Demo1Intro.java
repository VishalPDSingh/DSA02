package ch3_Array2D.class1_Intro2D;

public class Demo1Intro {
    public static void main(String[] args) {

        // 2D Array
        // declare
        int arr[][];
        arr = new int[5][4]; // initialization

        System.out.println(arr);

        System.out.println(arr[1][2]);

        // direct value
        int[][] arr1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(arr1[1][2]);
    }
}
// Every class in Java implicitly extends Object.
//
// When you print an object:
//
// System.out.println(object);
//
// Java internally calls:
//
// object.toString();
//
// If the class does not override toString(),
// the default implementation from Object is used.
//
// Default format:
//
// ClassName@HexHashCode
//
// Arrays also inherit Object.toString(),
// so printing an array directly displays its type and hash code,
// not its elements.
//
// To print array contents:
// Arrays.toString()      -> 1D array
// Arrays.deepToString()  -> 2D or multidimensional array