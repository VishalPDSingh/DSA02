package ch2_SearchingAndSorting.class3_Sorting;

import java.util.Arrays;

/*
 * Merge Two Arrays
 *
 * ===================================================
 * Problem:
 *
 * Merge two arrays
 * into a single array.
 *
 * Then sort the merged array
 * in ascending order.
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
 * combining two arrays
 * into one larger array.
 *
 * In this program,
 * we first copy
 * all elements of
 * the first array.
 *
 * Then we copy
 * all elements of
 * the second array.
 *
 * Finally,
 * we sort the merged array.
 *
 * ===================================================
 * Main Idea
 *
 * Step 1:
 *
 * Create a new array
 * of size
 *
 * m + n
 *
 * where
 *
 * m = size of first array
 *
 * n = size of second array
 *
 * Step 2:
 *
 * Copy every element
 * of the first array.
 *
 * Step 3:
 *
 * Copy every element
 * of the second array
 * after the first array.
 *
 * Step 4:
 *
 * Sort the merged array.
 *
 * Step 5:
 *
 * Print the result.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Find the sizes
 * of both arrays.
 *
 * Step 2:
 *
 * Create a new array
 * of size
 *
 * m + n.
 *
 * Step 3:
 *
 * Copy all elements
 * of arr1
 * into newarr.
 *
 * Step 4:
 *
 * Copy all elements
 * of arr2
 * into newarr
 * starting from index m.
 *
 * Step 5:
 *
 * Sort newarr
 * using
 *
 * Arrays.sort().
 *
 * Step 6:
 *
 * Print the merged array.
 *
 * ===================================================
 * Dry Run
 *
 * arr1:
 *
 * 7 10 11 14
 *
 * arr2:
 *
 * 3 8 9
 *
 * -----------------------------------
 * Create new array
 *
 * Size = 4 + 3 = 7
 *
 * newarr
 *
 * _ _ _ _ _ _ _
 *
 * -----------------------------------
 * Copy arr1
 *
 * 7 10 11 14 _ _ _
 *
 * -----------------------------------
 * Copy arr2
 *
 * 7 10 11 14 3 8 9
 *
 * -----------------------------------
 * Sort
 *
 * 3 7 8 9 10 11 14
 *
 * Final Answer:
 *
 * 3 7 8 9 10 11 14
 *
 * ===================================================
 * Why
 *
 * new array of size
 *
 * m + n ?
 *
 * Because
 * the merged array
 * must contain
 * every element
 * of both arrays.
 *
 * Therefore,
 *
 * Total Size
 *
 * =
 *
 * m + n
 *
 * ===================================================
 * Why
 *
 * m + i ?
 *
 * The first
 * m positions
 * are already occupied
 * by arr1.
 *
 * Therefore,
 * arr2 starts
 * from index
 *
 * m.
 *
 * Example:
 *
 * arr1 size = 4
 *
 * arr2 starts
 * from index 4.
 *
 * ===================================================
 * Time Complexity
 *
 * Copy First Array:
 *
 * O(m)
 *
 * -----------------------------------
 *
 * Copy Second Array:
 *
 * O(n)
 *
 * -----------------------------------
 *
 * Sorting:
 *
 * O((m+n) log(m+n))
 *
 * -----------------------------------
 *
 * Overall:
 *
 * O((m+n) log(m+n))
 *
 * ===================================================
 * Space Complexity:
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
 * Arrays.sort()
 * for primitive arrays
 * correctly sorts
 * all elements.
 *
 * ===================================================
 * In-place?
 *
 * NO
 *
 * Because
 * a separate array
 * is created.
 *
 * ===================================================
 * Pattern Used:
 *
 * Array Copying
 *
 * +
 *
 * Sorting
 *
 * ===================================================
 * Key Takeaway
 *
 * Create a new array.
 *
 * Copy the first array.
 *
 * Copy the second array.
 *
 * Sort the merged array.
 *
 * Print the result.
 */

public class Demo4MergeTwoArray {

    static void mergeArray(int arr1[], int arr2[]) {

        int m = arr1.length;
        int n = arr2.length;

        int newarr[] = new int[m + n];

        // Copy arr1
        for (int i = 0; i < m; i++) {
            newarr[i] = arr1[i];
        }

        // Copy arr2
        for (int i = 0; i < n; i++) {
            newarr[m + i] = arr2[i];
        }

        Arrays.sort(newarr);

        System.out.println(Arrays.toString(newarr));
    }

    public static void main(String[] args) {

        int arr1[] = {7, 10, 11, 14};
        int arr2[] = {3, 8, 9};

        mergeArray(arr1, arr2);
    }
}