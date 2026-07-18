package ch1_Array.Class1EasyQuestion;

/*
 * Rotate Array to the Left by K Positions
 * (Reversal Algorithm)
 *
 * ---------------------------------------------------
 * Problem:
 * Rotate an array to the left by k positions
 * without using any extra array.
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Reverse the first k elements.
 *
 * Step 2:
 * Reverse the remaining n-k elements.
 *
 * Step 3:
 * Reverse the complete array.
 *
 * ---------------------------------------------------
 * Why it Works?
 *
 * Original Array:
 *
 * [3, -2, 1, 4, 6, 9, 8]
 *
 * k = 3
 *
 * ---------------------------------------------------
 * Step 1:
 * Reverse First k Elements
 *
 * [1, -2, 3, 4, 6, 9, 8]
 *
 * ---------------------------------------------------
 * Step 2:
 * Reverse Remaining Elements
 *
 * [1, -2, 3, 8, 9, 6, 4]
 *
 * ---------------------------------------------------
 * Step 3:
 * Reverse Complete Array
 *
 * [4, 6, 9, 8, 3, -2, 1]
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Left Rotation is the opposite of Right Rotation.
 *
 * Right Rotation:
 * Reverse Whole
 * Reverse First k
 * Reverse Remaining
 *
 * Left Rotation:
 * Reverse First k
 * Reverse Remaining
 * Reverse Whole
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * O(n)
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Left Rotation:
 *
 * Reverse First k
 * Reverse Remaining
 * Reverse Whole Array
 */

public class Q9_RotateArrayFirstToLast {

    // ---------------------------------------------------
    // Reverse elements between index i and j.
    // ---------------------------------------------------
    static void reverseArray(int arr[], int i, int j) {

        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    // ---------------------------------------------------
    // Rotate array to the left by k positions.
    // ---------------------------------------------------
    static void rotateArray(int arr[], int k) {

        int n = arr.length;

        // Handle k greater than array size.
        k = k % n;

        // Step 1
        reverseArray(arr, 0, k - 1);

        // Step 2
        reverseArray(arr, k, n - 1);

        // Step 3
        reverseArray(arr, 0, n - 1);

        // Print rotated array.
        for (int num : arr) {

            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {3, -2, 1, 4, 6, 9, 8};

        int k = 3;

        rotateArray(arr, k);
    }
}