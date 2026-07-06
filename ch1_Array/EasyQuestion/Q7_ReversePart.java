package ch1_Array.EasyQuestion;

import java.util.Scanner;

/*
 * Reverse a Part of an Array
 *
 * ---------------------------------------------------
 * Problem:
 * Reverse the elements of an array between the given
 * starting index and ending index.
 *
 * The remaining elements of the array remain unchanged.
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Take the starting index (i) and ending index (j).
 *
 * Step 2:
 * Swap the elements at i and j.
 *
 * Step 3:
 * Move:
 * i → forward
 * j → backward
 *
 * Step 4:
 * Repeat until both pointers meet or cross.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 * [10, 20, 30, 40, 50, 60]
 *
 * Reverse from index = 1
 * to index = 4
 *
 * Initial:
 * i = 1
 * j = 4
 *
 * Step 1:
 * Swap 20 and 50
 *
 * [10, 50, 30, 40, 20, 60]
 *
 * i = 2
 * j = 3
 *
 * Step 2:
 * Swap 30 and 40
 *
 * [10, 50, 40, 30, 20, 60]
 *
 * i = 3
 * j = 2
 *
 * Stop.
 *
 * Final Array:
 * [10, 50, 40, 30, 20, 60]
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * This is the Two Pointer Technique.
 *
 * Instead of reversing the entire array,
 * only the specified portion is reversed.
 *
 * The remaining elements stay unchanged.
 *
 * This technique is frequently used in:
 *
 * • Array Rotation
 * • Next Permutation
 * • Reverse String
 * • Reverse Words
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * O(k)
 *
 * where,
 * k = number of elements being reversed.
 *
 * In the worst case,
 * k = n
 *
 * Therefore,
 * Worst Case = O(n)
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * The reversal is done in-place.
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Reversing a subarray is the same as reversing
 * a complete array.
 *
 * The only difference is that the pointers start
 * from the given indices instead of the array ends.
 */

public class Q7_ReversePart {

    // ---------------------------------------------------
    // Reverse elements between index i and j.
    // ---------------------------------------------------
    static void rverseArray(int arr[], int i, int j) {

        // Continue until both pointers meet or cross.
        while (i <= j) {

            // Swap the elements.
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // Move pointers toward the center.
            i++;
            j--;
        }

        // ---------------------------------------------------
        // Print the updated array.
        // ---------------------------------------------------
        for (int res : arr)
            System.out.println(res);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the array size.
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        // Read the start and end indices.
        System.out.println("Enter the starting index and ending index:");
        int i1 = sc.nextInt();
        int j = sc.nextInt();

        // Create the array.
        int ar[] = new int[n];

        // Read the array elements.
        for (int i = 0; i < ar.length; i++) {

            ar[i] = sc.nextInt();
        }

        System.out.println("************************");

        // Reverse the specified part of the array.
        rverseArray(ar, i1, j);

        sc.close();
    }
}