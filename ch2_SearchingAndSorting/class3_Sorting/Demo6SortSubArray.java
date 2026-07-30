package ch2_SearchingAndSorting.class3_Sorting;

import java.util.Arrays;

/*
 * Merge Two Sorted Subarrays
 *
 * ===================================================
 * Problem:
 *
 * Merge two already sorted
 * subarrays of a single array.
 *
 * The merged result
 * is copied back
 * into the original array.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Input:
 *
 * Array:
 *
 * 4 8 -1 2 6 9 11 3 4 713 0
 *
 * s = 2
 * m = 6
 * e = 9
 *
 * Left Subarray:
 *
 * -1 2 6 9 11
 *
 * Right Subarray:
 *
 * 3 4 713
 *
 * Output:
 *
 * 4 8 -1 2 3 4 6 9 11 713 0
 *
 * ===================================================
 * What is Subarray Merging?
 *
 * A subarray
 * is a continuous part
 * of an array.
 *
 * This algorithm
 * merges two sorted
 * subarrays into
 * one sorted subarray.
 *
 * It is the most important
 * operation of
 * Merge Sort.
 *
 * ===================================================
 * Main Idea
 *
 * Divide the array
 * into two sorted parts.
 *
 * Left Part:
 *
 * s to m
 *
 * Right Part:
 *
 * m+1 to e
 *
 * Compare
 * one element
 * from both parts.
 *
 * Copy the smaller element
 * into a temporary array.
 *
 * After one part finishes,
 * copy all remaining elements.
 *
 * Finally,
 * copy the temporary array
 * back into
 * the original array.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Create a temporary array
 * of size
 *
 * e - s + 1.
 *
 * Step 2:
 *
 * Initialize
 *
 * i = s
 *
 * j = m + 1
 *
 * k = 0
 *
 * Step 3:
 *
 * Compare
 * a[i]
 * and
 * a[j].
 *
 * Step 4:
 *
 * Copy
 * the smaller element
 * into c[k].
 *
 * Step 5:
 *
 * Continue
 * until one subarray finishes.
 *
 * Step 6:
 *
 * Copy remaining elements
 * of the left subarray.
 *
 * Step 7:
 *
 * Copy remaining elements
 * of the right subarray.
 *
 * Step 8:
 *
 * Copy
 * the merged array
 * back into
 * the original array.
 *
 * Step 9:
 *
 * Print the array.
 *
 * ===================================================
 * Dry Run
 *
 * Array
 *
 * 4 8 -1 2 6 9 11 3 4 713 0
 *
 * Left
 *
 * -1 2 6 9 11
 *
 * Right
 *
 * 3 4 713
 *
 * -----------------------------------
 *
 * Compare
 *
 * -1 and 3
 *
 * Take -1
 *
 * c
 *
 * -1 _ _ _ _ _ _ _
 *
 * -----------------------------------
 *
 * Compare
 *
 * 2 and 3
 *
 * Take 2
 *
 * c
 *
 * -1 2 _ _ _ _ _ _
 *
 * -----------------------------------
 *
 * Compare
 *
 * 6 and 3
 *
 * Take 3
 *
 * c
 *
 * -1 2 3 _ _ _ _ _
 *
 * -----------------------------------
 *
 * Compare
 *
 * 6 and 4
 *
 * Take 4
 *
 * c
 *
 * -1 2 3 4 _ _ _ _
 *
 * -----------------------------------
 *
 * Copy Remaining
 *
 * 6 9 11 713
 *
 * c
 *
 * -1 2 3 4 6 9 11 713
 *
 * -----------------------------------
 *
 * Copy c
 * back into
 * original array.
 *
 * Final Array
 *
 * 4 8 -1 2 3 4 6 9 11 713 0
 *
 * ===================================================
 * Why
 *
 * e - s + 1 ?
 *
 * Because
 * the total number
 * of elements
 * from
 *
 * s
 *
 * to
 *
 * e
 *
 * is
 *
 * e - s + 1.
 *
 * ===================================================
 * Why
 *
 * Three Pointers?
 *
 * i
 *
 * Traverses
 * the left subarray.
 *
 * j
 *
 * Traverses
 * the right subarray.
 *
 * k
 *
 * Traverses
 * the temporary array.
 *
 * ===================================================
 * Why
 *
 * Copy Back?
 *
 * The merged elements
 * are stored
 * in a temporary array.
 *
 * To update
 * the original array,
 * copy every element
 * of the temporary array
 * back into
 * the original array.
 *
 * ===================================================
 * Time Complexity
 *
 * Best Case:
 *
 * O(n)
 *
 * -----------------------------------
 *
 * Average Case:
 *
 * O(n)
 *
 * -----------------------------------
 *
 * Worst Case:
 *
 * O(n)
 *
 * where
 *
 * n = e - s + 1
 *
 * ===================================================
 * Space Complexity
 *
 * O(n)
 *
 * Because
 * a temporary array
 * is created.
 *
 * ===================================================
 * Stable?
 *
 * YES
 *
 * Because
 * equal elements
 * keep their
 * original order
 * using
 *
 * <=
 *
 * ===================================================
 * In-place?
 *
 * NO
 *
 * A temporary array
 * is required.
 *
 * ===================================================
 * Pattern Used
 *
 * Two Pointer Technique
 *
 * +
 *
 * Merge Process
 *
 * ===================================================
 * Used In
 *
 * Merge Sort
 *
 * Divide and Conquer
 *
 * External Sorting
 *
 * ===================================================
 * Key Takeaway
 *
 * Merge
 * two sorted subarrays.
 *
 * Compare
 * one element
 * from each side.
 *
 * Copy
 * the smaller element.
 *
 * Copy remaining elements.
 *
 * Finally,
 * copy the merged result
 * back into
 * the original array.
 */

public class Demo6SortSubArray {

    static void subArraySort(int a[], int s, int m, int e) {

        // Temporary array
        int c[] = new int[e - s + 1];

        // Pointers
        int i = s;
        int j = m + 1;
        int k = 0;

        // Merge both subarrays
        while (i <= m && j <= e) {

            if (a[i] <= a[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = a[j];
                j++;
            }

            k++;
        }

        // Copy remaining left subarray
        while (i <= m) {
            c[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining right subarray
        while (j <= e) {
            c[k] = a[j];
            j++;
            k++;
        }

        // Copy merged array back
        for (int x = 0; x < c.length; x++) {
            a[s + x] = c[x];
        }

        // Print updated array
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {

        int arr[] = {4, 8, -1, 2, 6, 9, 11, 3, 4, 713, 0};

        int s = 2;
        int m = 6;
        int e = 9;

        subArraySort(arr, s, m, e);
    }
}