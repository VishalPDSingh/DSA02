package ch2_SearchingAndSorting.class1_Searching;

/*
 * Linear Search
 *
 * ===================================================
 * Problem:
 *
 * Given an array and a target element,
 * find the index of the target.
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
 * Linear Search works on:
 *
 * • Sorted Array
 * • Unsorted Array
 *
 * Sorting is NOT required.
 *
 * ===================================================
 * Main Idea
 *
 * Start from the first element.
 *
 * Compare every element
 * with the target.
 *
 * If found,
 * return its index.
 *
 * Otherwise,
 * continue searching.
 *
 * If the loop finishes,
 * the element does not exist.
 *
 * Return -1.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Start from index 0.
 *
 * Step 2:
 *
 * Compare
 *
 * arr[i]
 *
 * with the target.
 *
 * Step 3:
 *
 * If equal,
 * return i.
 *
 * Step 4:
 *
 * Otherwise,
 * move to the next element.
 *
 * Step 5:
 *
 * If every element is checked,
 * return -1.
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
 * i = 0
 *
 * arr[0] = 4
 *
 * Not equal.
 *
 * -----------------------------------
 * i = 1
 *
 * arr[1] = 7
 *
 * Not equal.
 *
 * -----------------------------------
 * i = 2
 *
 * arr[2] = 10
 *
 * Not equal.
 *
 * -----------------------------------
 * i = 3
 *
 * arr[3] = 13
 *
 * Found.
 *
 * Return 3.
 *
 * ===================================================
 * Example When Element Does Not Exist
 *
 * Target = 100
 *
 * Compare every element.
 *
 * None matches.
 *
 * Return:
 *
 * -1
 *
 * ===================================================
 * Why Return -1?
 *
 * Array indices start from 0.
 *
 * Valid indices are:
 *
 * 0 to n-1
 *
 * Therefore,
 * -1 is used to indicate
 * "Element Not Found."
 *
 * ===================================================
 * When Should We Use Linear Search?
 *
 * ✔ Small arrays.
 *
 * ✔ Unsorted arrays.
 *
 * ✔ When searching only once.
 *
 * ===================================================
 * When Should We NOT Use It?
 *
 * Large sorted arrays.
 *
 * Use Binary Search instead.
 *
 * ===================================================
 * Time Complexity
 *
 * Best Case:
 *
 * O(1)
 *
 * Target is at index 0.
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
 * Target is at the last index
 * or does not exist.
 *
 * ===================================================
 * Space Complexity:
 *
 * O(1)
 *
 * No extra memory is used.
 *
 * ===================================================
 * Pattern Used:
 *
 * Sequential Search
 *
 * Check every element
 * one by one.
 *
 * ===================================================
 * Difference Between
 * Linear Search and Binary Search
 *
 * Linear Search
 * -------------------------
 * Works on sorted array?      YES
 * Works on unsorted array?    YES
 * Time Complexity             O(n)
 *
 * Binary Search
 * -------------------------
 * Works on sorted array?      YES
 * Works on unsorted array?    NO
 * Time Complexity             O(log n)
 *
 * ===================================================
 * Key Takeaway
 *
 * Start from the first element.
 *
 * Compare every element
 * one by one.
 *
 * If found,
 * return the index.
 *
 * Otherwise,
 * return -1.
 */

public class Demo1LinearSearch {

    // ---------------------------------------------------
    // Searches the target element
    // and returns its index.
    // ---------------------------------------------------
    static int linearSearch(int arr[], int target) {

        // Traverse the entire array.
        for (int i = 0; i < arr.length; i++) {

            // Element found.
            if (arr[i] == target) {

                return i;
            }
        }

        // Element not found.
        return -1;
    }

    public static void main(String[] args) {

        // Example array.
        int arr[] = {4, 7, 10, 13, 15, 20, 21, 24, 26, 28};

        int target = 13;

        int result = linearSearch(arr, target);

        if (result == -1) {

            System.out.println("Element not found.");
        }
        else {

            System.out.println("Element found at index : " + result);
        }
    }
}