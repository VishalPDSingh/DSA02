package ch2_SearchingAndSorting.class4_SortingQuestion;

import java.util.Arrays;

/*
 * Inversion Count Using Merge Sort
 *
 * ===================================================
 * Problem:
 *
 * Count the number
 * of inversions
 * in an array
 * using the
 * Merge Sort algorithm.
 *
 * ---------------------------------------------------
 * What is an Inversion?
 *
 * An inversion
 * is a pair
 *
 * (arr[i], arr[j])
 *
 * such that
 *
 * i < j
 *
 * and
 *
 * arr[i] > arr[j]
 *
 * It means
 * a larger element
 * appears before
 * a smaller element.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Input:
 *
 * 8 4 2 1
 *
 * Inversions:
 *
 * (8,4)
 * (8,2)
 * (8,1)
 * (4,2)
 * (4,1)
 * (2,1)
 *
 * Output:
 *
 * 6
 *
 * ===================================================
 * Why Merge Sort?
 *
 * The Brute Force
 * solution compares
 * every pair.
 *
 * Time Complexity:
 *
 * O(n²)
 *
 * Merge Sort
 * counts inversions
 * while merging
 * two sorted halves.
 *
 * Time Complexity:
 *
 * O(n log n)
 *
 * ===================================================
 * Main Idea
 *
 * Divide
 * the array
 * into two halves.
 *
 * Count inversions
 * in the left half.
 *
 * Count inversions
 * in the right half.
 *
 * While merging,
 * count inversions
 * between
 * the two halves.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Divide
 * the array
 * recursively.
 *
 * Step 2:
 *
 * Sort
 * the left half.
 *
 * Step 3:
 *
 * Sort
 * the right half.
 *
 * Step 4:
 *
 * Merge
 * both halves.
 *
 * Step 5:
 *
 * During merging,
 * whenever
 *
 * left element
 * >
 * right element
 *
 * count inversions.
 *
 * Step 6:
 *
 * Return
 * the total count.
 *
 * ===================================================
 * Why
 *
 * ans += (m - i + 1)
 * ?
 *
 * Suppose
 *
 * Left
 *
 * 4 6 8
 *
 * Right
 *
 * 2 5 9
 *
 * Compare
 *
 * 4 and 2
 *
 * Since
 *
 * 4 > 2
 *
 * and
 * the left subarray
 * is already sorted,
 *
 * all remaining elements
 *
 * 4
 * 6
 * 8
 *
 * are also greater
 * than 2.
 *
 * Therefore,
 * three inversions
 * are found
 * at once.
 *
 * Number of inversions
 *
 * =
 *
 * m - i + 1
 *
 * ===================================================
 * Dry Run
 *
 * Array
 *
 * 8 4 2 1
 *
 * -----------------------------------
 *
 * Divide
 *
 * 8 4
 *
 * 2 1
 *
 * -----------------------------------
 *
 * Divide Again
 *
 * 8
 *
 * 4
 *
 * 2
 *
 * 1
 *
 * -----------------------------------
 *
 * Merge
 *
 * Compare
 *
 * 8 and 4
 *
 * 8 > 4
 *
 * Count += 1
 *
 * Result
 *
 * 4 8
 *
 * -----------------------------------
 *
 * Merge
 *
 * Compare
 *
 * 2 and 1
 *
 * 2 > 1
 *
 * Count += 1
 *
 * Result
 *
 * 1 2
 *
 * -----------------------------------
 *
 * Final Merge
 *
 * 4 8
 *
 * 1 2
 *
 * Compare
 *
 * 4 and 1
 *
 * Count += 2
 *
 * (4,1)
 * (8,1)
 *
 * Compare
 *
 * 4 and 2
 *
 * Count += 2
 *
 * (4,2)
 * (8,2)
 *
 * Total Count
 *
 * 6
 *
 * ===================================================
 * Why
 *
 * Merge Step?
 *
 * During merging,
 * both subarrays
 * are already sorted.
 *
 * Therefore,
 * multiple inversions
 * can be counted
 * in one comparison.
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
 * Best Case:
 *
 * O(n log n)
 *
 * -----------------------------------
 *
 * Average Case:
 *
 * O(n log n)
 *
 * -----------------------------------
 *
 * Worst Case:
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
 * Merge Sort
 * preserves
 * the order
 * of equal elements.
 *
 * ===================================================
 * In-place?
 *
 * NO
 *
 * Extra memory
 * is required.
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
 * +
 *
 * Counting
 *
 * ===================================================
 * Advantages
 *
 * Much faster
 * than
 * Brute Force.
 *
 * Counts
 * inversions
 * while sorting.
 *
 * Time Complexity
 *
 * O(n log n)
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
 * the array.
 *
 * Sort
 * both halves.
 *
 * During merging,
 * whenever
 *
 * left element
 * >
 * right element,
 *
 * count
 *
 * (m - i + 1)
 *
 * inversions.
 *
 * This makes
 * inversion counting
 * possible in
 * O(n log n)
 * instead of
 * O(n²).
 */
public class Q2_InversionCountingMergeSort {

    static int ans = 0;

    static void mergeSort(int arr[], int s, int e) {

        if (s < e) {

            int mid = (s + e) / 2;

            mergeSort(arr, s, mid);

            mergeSort(arr, mid + 1, e);

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

                // Count inversions
                ans += (m - i + 1);
            }
        }

        while (i <= m)
            c[k++] = a[i++];

        while (j <= e)
            c[k++] = a[j++];

        for (int x = 0; x < c.length; x++)
            a[s + x] = c[x];
    }

    public static void main(String[] args) {

        int arr[] = { 8, 4, 2, 1 };

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

        System.out.println("Inversion Count = " + ans);
    }
}