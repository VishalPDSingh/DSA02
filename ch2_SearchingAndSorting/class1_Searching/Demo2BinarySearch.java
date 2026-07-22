package ch2_SearchingAndSorting.class1_Searching;

/*
 * Binary Search
 *
 * ===================================================
 * Problem:
 *
 * Given a sorted array,
 * find the index of a target element.
 *
 * If the element is not present,
 * return -1.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Array:
 *
 * 4 7 10 13 15 20 21 24 26 28
 *
 * Target:
 *
 * 13
 *
 * Output:
 *
 * 3
 *
 * ===================================================
 * Prerequisite
 *
 * Binary Search works ONLY on
 * a sorted array.
 *
 * If the array is not sorted,
 * Binary Search will produce
 * incorrect results.
 *
 * ===================================================
 * Main Idea
 *
 * Instead of checking every element,
 * Binary Search repeatedly divides
 * the search space into two halves.
 *
 * Compare the middle element
 * with the target.
 *
 * There are only three possibilities:
 *
 * ---------------------------------------------------
 * Case 1
 *
 * arr[mid] == target
 *
 * Element found.
 *
 * Return mid.
 *
 * ---------------------------------------------------
 * Case 2
 *
 * arr[mid] > target
 *
 * Target must be
 * on the left side.
 *
 * Ignore the right half.
 *
 * high = mid - 1
 *
 * ---------------------------------------------------
 * Case 3
 *
 * arr[mid] < target
 *
 * Target must be
 * on the right side.
 *
 * Ignore the left half.
 *
 * low = mid + 1
 *
 * ===================================================
 * Dry Run
 *
 * Array:
 *
 * 4 7 10 13 15 20 21 24 26 28
 *
 * Target = 13
 *
 * -----------------------------------
 * low = 0
 * high = 9
 *
 * mid = (0+9)/2 = 4
 *
 * arr[4] = 15
 *
 * 15 > 13
 *
 * Search Left
 *
 * high = 3
 *
 * -----------------------------------
 * low = 0
 * high = 3
 *
 * mid = (0+3)/2 = 1
 *
 * arr[1] = 7
 *
 * 7 < 13
 *
 * Search Right
 *
 * low = 2
 *
 * -----------------------------------
 * low = 2
 * high = 3
 *
 * mid = (2+3)/2 = 2
 *
 * arr[2] = 10
 *
 * 10 < 13
 *
 * low = 3
 *
 * -----------------------------------
 * low = 3
 * high = 3
 *
 * mid = 3
 *
 * arr[3] = 13
 *
 * Found
 *
 * Return 3
 *
 * ===================================================
 * Why while(low <= high)?
 *
 * Imagine only one element
 * is left.
 *
 * low = high
 *
 * We still need to check
 * that element.
 *
 * Therefore,
 *
 * while(low <= high)
 *
 * is required.
 *
 * ===================================================
 * Mid Formula
 *
 * Instead of
 *
 * (low + high) / 2
 *
 * prefer
 *
 * low + (high - low) / 2
 *
 * because
 * it prevents integer overflow
 * in very large arrays.
 *
 * ===================================================
 * Time Complexity:
 *
 * Best Case:
 *
 * O(1)
 *
 * Middle element is the target.
 *
 * -----------------------------------
 *
 * Average Case:
 *
 * O(log n)
 *
 * -----------------------------------
 *
 * Worst Case:
 *
 * O(log n)
 *
 * ===================================================
 * Space Complexity:
 *
 * O(1)
 *
 * ===================================================
 * Pattern Used:
 *
 * Binary Search
 *
 * Divide the search space
 * into two halves
 * until the element is found.
 */

public class Demo2BinarySearch {

    // Searches the target element
    // and returns its index.
    static int binarySearch(int arr[], int target) {

        // Starting index.
        int low = 0;

        // Ending index.
        int high = arr.length - 1;

        // Continue while search space exists.
        while (low <= high) {

            // Middle index.
            int mid = low + (high - low) / 2;

            // Target found.
            if (arr[mid] == target) {

                return mid;
            }

            // Search left half.
            else if (arr[mid] > target) {

                high = mid - 1;
            }

            // Search right half.
            else {

                low = mid + 1;
            }
        }

        // Target not found.
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 4, 7, 10, 13, 15, 20, 21, 24, 26, 28 };

        int target = 13;

        int result = binarySearch(arr, target);

        if (result == -1) {

            System.out.println("Element is not found.");
        } else {

            System.out.println("Element found at index : " + result);
        }
    }
}