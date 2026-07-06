package ch1_Array.EasyQuestion;

/*
 * Rotate Array to the Right by K Positions
 * (Reversal Algorithm)
 *
 * ---------------------------------------------------
 * Problem:
 * Rotate an array to the right by k positions
 * without using any extra array.
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Reverse the entire array.
 *
 * Step 2:
 * Reverse the first k elements.
 *
 * Step 3:
 * Reverse the remaining n-k elements.
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
 * Reverse Complete Array
 *
 * [8, 9, 6, 4, 1, -2, 3]
 *
 * ---------------------------------------------------
 * Step 2:
 * Reverse First k Elements
 *
 * [6, 9, 8, 4, 1, -2, 3]
 *
 * ---------------------------------------------------
 * Step 3:
 * Reverse Remaining Elements
 *
 * [6, 9, 8, 3, -2, 1, 4]
 *
 * Final Rotated Array.
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Array Rotation can be performed in-place
 * using three reversals.
 *
 * No extra array is required.
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * O(n)
 *
 * Three traversals.
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Right Rotation:
 *
 * Reverse Whole Array
 * Reverse First k Elements
 * Reverse Remaining Elements
 */

public class Q8_RotateArray {

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
    // Rotate array to the right by k positions.
    // ---------------------------------------------------
    static void rotateArray(int arr[], int k) {

        int n = arr.length;

        // Handle k greater than array size.
        k = k % n;

        // Step 1
        reverseArray(arr, 0, n - 1);

        // Step 2
        reverseArray(arr, 0, k - 1);

        // Step 3
        reverseArray(arr, k, n - 1);

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