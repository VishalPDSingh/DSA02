package ch2_SearchingAndSorting.class3_Sorting;

import java.util.Arrays;

/*
 * Selection Sort
 *
 * ===================================================
 * Problem:
 *
 * Sort an array in ascending order
 * using the Selection Sort algorithm.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Input:
 *
 * 2 5 1 6 11 10
 *
 * Output:
 *
 * 1 2 5 6 10 11
 *
 * ===================================================
 * What is Selection Sort?
 *
 * Selection Sort repeatedly selects
 * the smallest element from the
 * unsorted part of the array
 * and places it at its correct position.
 *
 * After every pass,
 * one smallest element
 * is fixed in the sorted part.
 *
 * That is why it is called
 * Selection Sort.
 *
 * ===================================================
 * Main Idea
 *
 * Pass 1:
 *
 * Find the smallest element
 * in the whole array
 * and place it at index 0.
 *
 * Pass 2:
 *
 * Find the smallest element
 * from index 1 onward
 * and place it at index 1.
 *
 * Continue until
 * the array becomes sorted.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Assume the first element
 * of the unsorted part
 * is the minimum.
 *
 * Step 2:
 *
 * Traverse the remaining elements.
 *
 * Step 3:
 *
 * If a smaller element is found,
 * update the minimum.
 *
 * Step 4:
 *
 * After traversal,
 * swap the minimum element
 * with the first element
 * of the unsorted part.
 *
 * Step 5:
 *
 * Repeat for
 * n-1 passes.
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
 * Minimum = 1
 *
 * Swap 5 and 1
 *
 * 1 4 3 2 5
 *
 * -----------------------------------
 * Pass 2
 *
 * Unsorted Part:
 *
 * 4 3 2 5
 *
 * Minimum = 2
 *
 * Swap 4 and 2
 *
 * 1 2 3 4 5
 *
 * -----------------------------------
 * Pass 3
 *
 * Unsorted Part:
 *
 * 3 4 5
 *
 * Minimum = 3
 *
 * Already in correct position.
 *
 * -----------------------------------
 * Pass 4
 *
 * Unsorted Part:
 *
 * 4 5
 *
 * Minimum = 4
 *
 * Already in correct position.
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
 * j = i + 1 ?
 *
 * Because
 * arr[i]
 * is already assumed
 * to be the minimum.
 *
 * Therefore,
 * comparisons start
 * from the next element.
 *
 * ===================================================
 * Time Complexity
 *
 * Best Case:
 *
 * O(n²)
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
 * NO
 *
 * Equal elements
 * may change
 * their original order
 * because of swapping.
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
 * Find Minimum
 *
 * +
 *
 * Single Swap
 *
 * ===================================================
 * Bubble Sort vs Selection Sort
 *
 * Bubble Sort
 *
 * -> Compares adjacent elements.
 *
 * -> Many swaps.
 *
 * -> Stable.
 *
 * -> Can be optimized to O(n).
 *
 * -----------------------------------
 *
 * Selection Sort
 *
 * -> Finds minimum element.
 *
 * -> Only one swap per pass.
 *
 * -> Not Stable.
 *
 * -> Always O(n²).
 *
 * ===================================================
 * Key Takeaway
 *
 * Find the minimum element
 * from the unsorted part.
 *
 * Swap it with
 * the first unsorted element.
 *
 * After every pass,
 * one smallest element
 * reaches its correct position.
 */

public class Demo3SelectionSort {

    static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int arr[] = {2, 5, 1, 6, 11, 10};

        selectionSort(arr);
    }
}