package ch2_SearchingAndSorting.class3_Sorting;

import java.util.Arrays;

/*
 * Bubble Sort
 *
 * ===================================================
 * Problem:
 *
 * Sort an array in ascending order
 * using the Bubble Sort algorithm.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Input:
 *
 * 52 96 78 36 89 1 25
 *
 * Output:
 *
 * 1 25 36 52 78 89 96
 *
 * ===================================================
 * What is Bubble Sort?
 *
 * Bubble Sort repeatedly compares
 * two adjacent elements.
 *
 * If they are in the wrong order,
 * swap them.
 *
 * After every pass,
 * the largest unsorted element
 * "bubbles" to its correct position.
 *
 * That is why it is called
 * Bubble Sort.
 *
 * ===================================================
 * Main Idea
 *
 * Pass 1:
 *
 * Largest element moves
 * to the last position.
 *
 * Pass 2:
 *
 * Second largest element moves
 * to the second last position.
 *
 * Continue until
 * the array becomes sorted.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Traverse the array.
 *
 * Step 2:
 *
 * Compare adjacent elements.
 *
 * arr[j]
 *
 * and
 *
 * arr[j+1]
 *
 * Step 3:
 *
 * If
 *
 * arr[j] > arr[j+1]
 *
 * swap them.
 *
 * Step 4:
 *
 * Repeat the process
 * for n-1 passes.
 *
 * ===================================================
 * Dry Run
 *
 * Array:
 *
 * 5 4 3 2 1
 *
 * -----------------------------------
 * Pass 1
 *
 * 5 4
 * Swap
 *
 * 4 5 3 2 1
 *
 * 5 3
 * Swap
 *
 * 4 3 5 2 1
 *
 * 5 2
 * Swap
 *
 * 4 3 2 5 1
 *
 * 5 1
 * Swap
 *
 * 4 3 2 1 5
 *
 * Largest element (5)
 * reaches its correct position.
 *
 * -----------------------------------
 * Pass 2
 *
 * 4 3
 * Swap
 *
 * 3 4 2 1 5
 *
 * 4 2
 * Swap
 *
 * 3 2 4 1 5
 *
 * 4 1
 * Swap
 *
 * 3 2 1 4 5
 *
 * Second largest element
 * reaches its correct position.
 *
 * Continue similarly.
 *
 * Final Answer:
 *
 * 1 2 3 4 5
 *
 * ===================================================
 * Why
 *
 * n-1 Passes?
 *
 * Because after every pass,
 * one element reaches
 * its final position.
 *
 * Therefore,
 * after
 *
 * n-1
 *
 * passes,
 * every element is sorted.
 *
 * ===================================================
 * Why
 *
 * j <= n-2-i ?
 *
 * After each pass,
 * the last i elements
 * are already sorted.
 *
 * No need to compare them again.
 *
 * Example:
 *
 * n = 5
 *
 * Pass 1
 *
 * Compare till index 3
 *
 * Pass 2
 *
 * Compare till index 2
 *
 * Pass 3
 *
 * Compare till index 1
 *
 * Pass 4
 *
 * Compare till index 0
 *
 * ===================================================
 * Optimization
 *
 * If no swapping happens
 * in a complete pass,
 * the array is already sorted.
 *
 * We can stop immediately.
 *
 * Use:
 *
 * boolean swapped = false;
 *
 * If swapped remains false,
 * break the loop.
 *
 * This improves
 * the Best Case
 * to O(n).
 *
 * ===================================================
 * Time Complexity
 *
 * Best Case:
 *
 * O(n)
 * (Optimized version)
 *
 * O(n²)
 * (Current version)
 *
 * -----------------------------------
 *
 * Average Case:
 *
 * O(n²)
 *
 * -----------------------------------
 *
 * Worst Case:
 *
 * O(n²)
 *
 * ===================================================
 * Space Complexity:
 *
 * O(1)
 *
 * Sorting is done
 * in-place.
 *
 * ===================================================
 * Stable?
 *
 * YES
 *
 * Equal elements
 * keep their original order.
 *
 * ===================================================
 * In-place?
 *
 * YES
 *
 * No extra array is used.
 *
 * ===================================================
 * Pattern Used:
 *
 * Adjacent Swapping
 *
 * +
 *
 * Repeated Passes
 *
 * ===================================================
 * Key Takeaway
 *
 * Compare adjacent elements.
 *
 * If left > right,
 * swap them.
 *
 * After every pass,
 * the largest element
 * moves to the end.
 */

public class Demo2BubbleSort {

    // ---------------------------------------------------
    // Sorts the array using Bubble Sort.
    // ---------------------------------------------------
    static void bubbleSort(int arr[]) {

        int n = arr.length;

        // Total passes.
        for (int i = 0; i <= n - 2; i++) {

            // Compare adjacent elements.
            for (int j = 0; j <= n - 2 - i; j++) {

                // Swap if elements
                // are in the wrong order.
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int arr[] = {
                52, 96, 78, 36, 89,
                1, 25, 65, 32, 25, 36
        };

        bubbleSort(arr);
    }
}