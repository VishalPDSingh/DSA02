package ch2_SearchingAndSorting.class3_Sorting;

import java.util.Arrays;

/*
 * Merge Sort
 *
 * ===================================================
 * Problem:
 *
 * Sort an array
 * in ascending order
 * using the Merge Sort algorithm.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Input:
 *
 * 4 8 -1 2 6 9 11 3 4 713 0
 *
 * Output:
 *
 * -1 0 2 3 4 4 6 8 9 11 713
 *
 * ===================================================
 * What is Merge Sort?
 *
 * Merge Sort
 * is a
 * Divide and Conquer
 * algorithm.
 *
 * It repeatedly
 * divides the array
 * into smaller halves
 * until every subarray
 * contains only
 * one element.
 *
 * Then
 * it merges
 * those subarrays
 * in sorted order.
 *
 * ===================================================
 * Main Idea
 *
 * Divide
 *
 * Divide the array
 * into two halves.
 *
 * Conquer
 *
 * Recursively sort
 * both halves.
 *
 * Combine
 *
 * Merge
 * the two sorted halves
 * into one
 * sorted array.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Find the middle index.
 *
 * Step 2:
 *
 * Divide
 * the array
 * into
 * left
 * and
 * right.
 *
 * Step 3:
 *
 * Recursively sort
 * the left half.
 *
 * Step 4:
 *
 * Recursively sort
 * the right half.
 *
 * Step 5:
 *
 * Merge
 * both sorted halves.
 *
 * Step 6:
 *
 * Repeat
 * until
 * the complete array
 * becomes sorted.
 *
 * ===================================================
 * Dry Run
 *
 * Array
 *
 * 8 3 6 2
 *
 * Divide
 *
 * 8 3
 *
 * 6 2
 *
 * Divide Again
 *
 * 8
 *
 * 3
 *
 * 6
 *
 * 2
 *
 * Merge
 *
 * 3 8
 *
 * 2 6
 *
 * Merge Again
 *
 * 2 3 6 8
 *
 * Final Answer
 *
 * 2 3 6 8
 *
 * ===================================================
 * Why
 *
 * Divide?
 *
 * Smaller arrays
 * are easier
 * to merge
 * than
 * one large array.
 *
 * ===================================================
 * Why
 *
 * Merge?
 *
 * Because
 * two sorted arrays
 * can be merged
 * in
 * O(n)
 * time.
 *
 * ===================================================
 * Recurrence Relation
 *
 * T(n)
 *
 * =
 *
 * 2T(n/2)
 *
 * +
 *
 * O(n)
 *
 * ===================================================
 * Time Complexity
 *
 * Best Case
 *
 * O(n log n)
 *
 * -----------------------------------
 *
 * Average Case
 *
 * O(n log n)
 *
 * -----------------------------------
 *
 * Worst Case
 *
 * O(n log n)
 *
 * ===================================================
 * Space Complexity
 *
 * O(n)
 *
 * Because
 * a temporary array
 * is required
 * during merging.
 *
 * ===================================================
 * Stable?
 *
 * YES
 *
 * Equal elements
 * keep
 * their
 * original order.
 *
 * ===================================================
 * In-place?
 *
 * NO
 *
 * Uses
 * extra memory.
 *
 * ===================================================
 * Pattern Used
 *
 * Divide
 *
 * +
 *
 * Conquer
 *
 * +
 *
 * Merge
 *
 * ===================================================
 * Advantages
 *
 * Guaranteed
 * O(n log n)
 * performance.
 *
 * Stable sorting.
 *
 * Efficient
 * for large datasets.
 *
 * ===================================================
 * Disadvantages
 *
 * Uses
 * extra memory.
 *
 * Recursive calls
 * increase
 * function overhead.
 *
 * ===================================================
 * Key Takeaway
 *
 * Divide
 * the array
 * into halves.
 *
 * Recursively sort
 * both halves.
 *
 * Merge
 * the sorted halves.
 *
 * Repeat
 * until
 * the entire array
 * is sorted.
 */
public class Demo7MergeSort {

    static void mergeSort(int arr[], int s, int e) {

        if (s < e) {

            int mid = (s + e) / 2;

            // Left half
            mergeSort(arr, s, mid);

            // Right half
            mergeSort(arr, mid + 1, e);

            // Merge both halves
            merge(arr, s, mid, e);
        }
    }

    static void merge(int a[], int s, int m, int e) {

        int c[] = new int[e - s + 1];

        int i = s;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= e) {

            if (a[i] <= a[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = a[j++];
            }
        }

        while (i <= m) {
            c[k++] = a[i++];
        }

        while (j <= e) {
            c[k++] = a[j++];
        }

        for (int x = 0; x < c.length; x++) {
            a[s + x] = c[x];
        }
    }

    public static void main(String[] args) {

        int arr[] = { 4, 8, -1, 2, 6, 9, 11, 3, 4, 713, 0 };

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}