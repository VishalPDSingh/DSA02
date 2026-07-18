package ch1_Array.Class1EasyQuestion;

/*
 * Reverse an Array (Two Pointer Approach)
 *
 * ---------------------------------------------------
 * Problem:
 * Reverse all elements of an array without using
 * any extra array.
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Initialize two pointers.
 *
 * i = 0                  (First element)
 * j = arr.length - 1     (Last element)
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
 * Why Two Pointers?
 *
 * The first element should become the last.
 * The last element should become the first.
 *
 * Therefore,
 * we swap both ends simultaneously.
 *
 * This avoids using another array.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 * [10, 20, 30, 40, 50]
 *
 * Initial:
 * i = 0
 * j = 4
 *
 * Step 1:
 * Swap 10 and 50
 *
 * [50, 20, 30, 40, 10]
 *
 * i = 1
 * j = 3
 *
 * Step 2:
 * Swap 20 and 40
 *
 * [50, 40, 30, 20, 10]
 *
 * i = 2
 * j = 2
 *
 * Step 3:
 * Swap 30 with itself
 *
 * Done.
 *
 * Final Array:
 * [50, 40, 30, 20, 10]
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Two Pointer Technique
 *
 * One pointer starts from the beginning.
 * Another pointer starts from the end.
 *
 * After every swap:
 *
 * Left Pointer  → moves right
 * Right Pointer → moves left
 *
 * This technique is commonly used in:
 *
 * • Reverse Array
 * • Reverse String
 * • Palindrome Checking
 * • Pair Sum Problems
 * • Partitioning Problems
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * O(n)
 *
 * Only half of the array is traversed.
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * Reversal is performed in-place.
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Use two pointers to reverse an array
 * without using any extra space.
 */

public class Q6_ReverseWholeArray {

    // ---------------------------------------------------
    // Reverse the complete array
    // ---------------------------------------------------
    static void reverseArray(int arr[]) {

        // Left pointer
        int i = 0;

        // Right pointer
        int j = arr.length - 1;

        // ---------------------------------------------------
        // Continue until both pointers meet or cross.
        // ---------------------------------------------------
        while (i <= j) {

            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // Move pointers towards the center.
            i++;
            j--;
        }

        // ---------------------------------------------------
        // Print reversed array.
        // ---------------------------------------------------
        for (int res : arr) {

            System.out.println(res);
        }
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        reverseArray(arr);
    }
}