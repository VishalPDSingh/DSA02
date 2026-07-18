package ch3_Array2D.class1_Intro2D;

public class Demo3_Traversing_Row {
    public static void main(String[] args) {

        // 3 x 3 Matrix
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Row-wise Traversal
        // Outer loop -> Rows
        // Inner loop -> Columns

        for(int i = 0; i < arr1.length; i++) {

            // arr1[i] represents the current row
            // arr1[i].length gives the number of columns in that row

            for(int j = 0; j < arr1[i].length; j++) {

                // arr1[i][j]
                // i -> Row index
                // j -> Column index

                System.out.print(arr1[i][j] + " ");
            }

            // Move to the next row
            System.out.println();
        }
    }
}