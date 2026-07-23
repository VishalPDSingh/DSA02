package ch2_SearchingAndSorting.class2_Question;

/*
 * Floor of a Number (Linear Search)
 *
 * ===================================================
 * Problem:
 *
 * Given a sorted array and a target value k,
 * find the Floor of k.
 *
 * Floor means:
 *
 * The greatest element
 * that is less than or equal to k.
 *
 * If no such element exists,
 * return Integer.MIN_VALUE
 * (or -1 depending on the problem).
 *
 * ---------------------------------------------------
 * Example 1
 *
 * Array:
 *
 * -4 3 4 7 10 11 12 15 19
 *
 * k = 8
 *
 * Floor = 7
 *
 * ---------------------------------------------------
 * Example 2
 *
 * k = 11
 *
 * Floor = 11
 *
 * ---------------------------------------------------
 * Example 3
 *
 * k = -10
 *
 * Floor does not exist.
 *
 * ===================================================
 * What is Floor?
 *
 * Floor(k)
 *
 * =
 *
 * Largest element
 * that is <= k
 *
 * ---------------------------------------------------
 * Example
 *
 * Numbers:
 *
 * 2 5 8 10 14
 *
 * k = 9
 *
 * Floor = 8
 *
 * ===================================================
 * Main Idea
 *
 * Traverse the entire array.
 *
 * Whenever an element
 * is less than or equal to k,
 * check whether it is greater
 * than the current answer.
 *
 * If yes,
 * update the answer.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Initialize
 *
 * ans = Integer.MIN_VALUE
 *
 * Step 2:
 *
 * Traverse the array.
 *
 * Step 3:
 *
 * If
 *
 * arr[i] <= k
 *
 * and
 *
 * arr[i] > ans
 *
 * update ans.
 *
 * Step 4:
 *
 * Return ans.
 *
 * ===================================================
 * Dry Run
 *
 * Array:
 *
 * -4 3 4 7 10 11 12 15 19
 *
 * k = 8
 *
 * -----------------------------------
 * ans = -∞
 *
 * i = 0
 *
 * -4 <= 8
 *
 * ans = -4
 *
 * -----------------------------------
 * i = 1
 *
 * 3 <= 8
 *
 * ans = 3
 *
 * -----------------------------------
 * i = 2
 *
 * 4 <= 8
 *
 * ans = 4
 *
 * -----------------------------------
 * i = 3
 *
 * 7 <= 8
 *
 * ans = 7
 *
 * -----------------------------------
 * Remaining elements
 * are greater than 8.
 *
 * Final Answer:
 *
 * 7
 *
 * ===================================================
 * Why
 *
 * arr[i] > ans
 *
 * ?
 *
 * We want the
 * largest possible value
 * that is still <= k.
 *
 * So every time we find
 * a bigger valid element,
 * we update the answer.
 *
 * ===================================================
 * Time Complexity:
 *
 * O(n)
 *
 * Every element is checked once.
 *
 * ===================================================
 * Space Complexity:
 *
 * O(1)
 *
 * ===================================================
 * Pattern Used:
 *
 * Linear Search
 *
 * ===================================================
 * Key Takeaway
 *
 * Floor
 *
 * =
 *
 * Largest element
 * <= target
 */

public class Q1_FloorOfNum_LinearSearch {

    // Returns the floor of k.
    static int floorNum(int arr[], int k) {

        // Stores the best floor found so far.
        int ans = Integer.MIN_VALUE;

        // Traverse every element.
        for (int i = 0; i < arr.length; i++) {

            // Valid floor candidate.
            if (arr[i] <= k && arr[i] > ans) {

                ans = arr[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { -4, 3, 4, 7, 10, 11, 12, 15, 19 };

        int k = -5;

        System.out.println("Floor = " + floorNum(arr, k));
    }
}