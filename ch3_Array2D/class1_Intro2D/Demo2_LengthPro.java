package ch3_Array2D.class1_Intro2D;

// A 2D array in Java is an "Array of Arrays".
//
// int[][] arr = new int[5][3];
//
// arr
//  |
//  +--> arr[0] --> [0, 0, 0]   // First row (1D array)
//  |
//  +--> arr[1] --> [0, 0, 0]   // Second row
//  |
//  +--> arr[2] --> [0, 0, 0]
//  |
//  +--> arr[3] --> [0, 0, 0]
//  |
//  +--> arr[4] --> [0, 0, 0]
//
// arr.length      -> Number of rows (5)
// arr[0].length   -> Number of columns in the first row (3)
// arr[1].length   -> Number of columns in the second row (3)
public class Demo2_LengthPro {
    public static void main(String[] args) {

        // Create a 2D array with 5 rows and 3 columns
        int arr[][] = new int[5][3];

        // arr.length
        // Returns the total number of rows.
        // Since arr contains 5 row arrays, output = 5
        System.out.println(arr.length);

        // arr[0]
        // Represents the first row of the 2D array.
        // It is itself a 1D array.
        //
        // arr[0] -> [0, 0, 0]
        //
        // arr[0].length
        // Returns the number of columns in the first row.
        // Output = 3
        System.out.println(arr[0].length);
    }
}

// For a normal (rectangular) 2D array, every row has the same number of
// columns:
// But for a jagged array, different rows can have different lengths: