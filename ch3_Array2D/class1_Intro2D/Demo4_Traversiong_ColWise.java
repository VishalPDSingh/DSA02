package ch3_Array2D.class1_Intro2D;

public class Demo4_Traversiong_ColWise {
    public static void main(String[] args) {

        // 3 x 3 Matrix
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Column-wise Traversal
        // Outer loop -> Columns
        // Inner loop -> Rows

        for (int j = 0; j < arr1[0].length; j++) {

            // j represents the current column

            for (int i = 0; i < arr1.length; i++) {

                // arr1[i][j]
                // i -> Row index
                // j -> Column index

                System.out.print(arr1[i][j] + " ");
            }

            // Move to the next column
            System.out.println();
        }
    }
}