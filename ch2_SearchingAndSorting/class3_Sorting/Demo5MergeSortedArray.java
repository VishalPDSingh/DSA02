package ch2_SearchingAndSorting.class3_Sorting;

import java.util.Arrays;

/*
 * Merge Two Sorted Arrays
 *
 * ===================================================
 * Problem:
 *
 * Merge two already sorted arrays
 * into a single sorted array.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Input:
 *
 * Array 1:
 *
 * 7 10 11 14
 *
 * Array 2:
 *
 * 3 8 9
 *
 * Output:
 *
 * 3 7 8 9 10 11 14
 *
 * ===================================================
 * What is Merging?
 *
 * Merging means
 * combining two sorted arrays
 * into one sorted array.
 *
 * Since both arrays
 * are already sorted,
 * we compare their elements
 * one by one
 * and insert
 * the smaller element
 * into the new array.
 *
 * This is called
 * the Merge Algorithm.
 *
 * It is also used in
 * Merge Sort.
 *
 * ===================================================
 * Main Idea
 *
 * Keep three pointers.
 *
 * i
 *
 * Points to
 * the first array.
 *
 * j
 *
 * Points to
 * the second array.
 *
 * k
 *
 * Points to
 * the merged array.
 *
 * Compare
 * a[i]
 * and
 * b[j].
 *
 * Copy the smaller element
 * into c[k].
 *
 * Move the corresponding pointer.
 *
 * Continue until
 * one array finishes.
 *
 * Then copy
 * the remaining elements
 * of the other array.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Create a new array
 * of size
 *
 * m + n.
 *
 * Step 2:
 *
 * Initialize
 *
 * i = 0
 *
 * j = 0
 *
 * k = 0
 *
 * Step 3:
 *
 * Compare
 * a[i]
 * and
 * b[j].
 *
 * Step 4:
 *
 * Copy the smaller element
 * into c[k].
 *
 * Increase
 * the corresponding pointer.
 *
 * Step 5:
 *
 * Repeat until
 * one array finishes.
 *
 * Step 6:
 *
 * Copy all remaining elements
 * of the first array.
 *
 * Step 7:
 *
 * Copy all remaining elements
 * of the second array.
 *
 * Step 8:
 *
 * Print the merged array.
 *
 * ===================================================
 * Dry Run
 *
 * a
 *
 * 7 10 11 14
 *
 * b
 *
 * 3 8 9
 *
 * -----------------------------------
 *
 * Compare
 *
 * 7 and 3
 *
 * Take 3
 *
 * c
 *
 * 3 _ _ _ _ _ _
 *
 * -----------------------------------
 *
 * Compare
 *
 * 7 and 8
 *
 * Take 7
 *
 * c
 *
 * 3 7 _ _ _ _ _
 *
 * -----------------------------------
 *
 * Compare
 *
 * 10 and 8
 *
 * Take 8
 *
 * c
 *
 * 3 7 8 _ _ _ _
 *
 * -----------------------------------
 *
 * Compare
 *
 * 10 and 9
 *
 * Take 9
 *
 * c
 *
 * 3 7 8 9 _ _ _
 *
 * -----------------------------------
 *
 * Second array finishes.
 *
 * Copy remaining elements
 * of first array.
 *
 * 10
 *
 * 11
 *
 * 14
 *
 * Final Answer
 *
 * 3 7 8 9 10 11 14
 *
 * ===================================================
 * Why
 *
 * Three Pointers?
 *
 * i
 *
 * Traverses
 * the first array.
 *
 * j
 *
 * Traverses
 * the second array.
 *
 * k
 *
 * Traverses
 * the merged array.
 *
 * Without
 * these pointers,
 * merging becomes difficult.
 *
 * ===================================================
 * Why
 *
 * Copy Remaining Elements?
 *
 * When one array finishes,
 * the other array
 * may still contain elements.
 *
 * Since both arrays
 * are already sorted,
 * those remaining elements
 * are already
 * in correct order.
 *
 * Simply copy them.
 *
 * ===================================================
 * Dry Run of Pointers
 *
 * Initially
 *
 * i = 0
 *
 * j = 0
 *
 * k = 0
 *
 * After taking 3
 *
 * i = 0
 *
 * j = 1
 *
 * k = 1
 *
 * After taking 7
 *
 * i = 1
 *
 * j = 1
 *
 * k = 2
 *
 * After taking 8
 *
 * i = 1
 *
 * j = 2
 *
 * k = 3
 *
 * After taking 9
 *
 * i = 1
 *
 * j = 3
 *
 * k = 4
 *
 * Now
 *
 * j == n
 *
 * Therefore
 * copy remaining elements
 * from array a.
 *
 * ===================================================
 * Time Complexity
 *
 * Best Case:
 *
 * O(m+n)
 *
 * -----------------------------------
 *
 * Average Case:
 *
 * O(m+n)
 *
 * -----------------------------------
 *
 * Worst Case:
 *
 * O(m+n)
 *
 * ===================================================
 * Space Complexity
 *
 * O(m+n)
 *
 * Because
 * a new array
 * is created.
 *
 * ===================================================
 * Stable?
 *
 * YES
 *
 * Equal elements
 * keep their
 * original order
 * if we choose
 * the first array element
 * when values are equal.
 *
 * ===================================================
 * In-place?
 *
 * NO
 *
 * Because
 * a separate array
 * is used.
 *
 * ===================================================
 * Pattern Used
 *
 * Two Pointer Technique
 *
 * +
 *
 * Array Traversal
 *
 * ===================================================
 * Merge vs Merge + Sort
 *
 * Merge + Arrays.sort()
 *
 * Time:
 *
 * O((m+n) log(m+n))
 *
 * -----------------------------------
 *
 * Merge Algorithm
 *
 * Time:
 *
 * O(m+n)
 *
 * Because
 * the arrays
 * are already sorted.
 *
 * ===================================================
 * Key Takeaway
 *
 * Compare
 * the current elements
 * of both arrays.
 *
 * Copy
 * the smaller element
 * into the new array.
 *
 * Move
 * the corresponding pointer.
 *
 * After one array finishes,
 * copy
 * all remaining elements.
 *
 * This algorithm
 * is the heart
 * of Merge Sort.
 */

public class Demo5MergeSortedArray {

    static void mergeSortedArray(int a[], int b[]) {

        int m = a.length;
        int n = b.length;

        int c[] = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {

            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }

            k++;
        }

        while (i < m) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < n) {
            c[k] = b[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(c));
    }

    public static void main(String[] args) {

        int a[] = {7, 10, 11, 14};
        int b[] = {3, 8, 9};

        mergeSortedArray(a, b);
    }
}