package ch1_Array.Class1EasyQuestion;

/*
 * Remove Duplicates from Sorted Array
 * (Brute Force Approach)
 *
 * ===================================================
 * Problem:
 *
 * Given a SORTED array,
 * remove all duplicate elements.
 *
 * Store only unique elements
 * in another array.
 *
 * Return the number of unique elements.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Input:
 *
 * {0,0,1,1,1,2,2,3,3,4}
 *
 * Output Array:
 *
 * {0,1,2,3,4}
 *
 * Number of Unique Elements:
 *
 * 5
 *
 * ===================================================
 * Important Observation
 *
 * The array is SORTED.
 *
 * Therefore,
 * all duplicate elements
 * are placed together.
 *
 * Example:
 *
 * 0 0 1 1 1 2 2 3 3 4
 *
 * ^
 * Duplicates are adjacent.
 *
 * Because of sorting,
 * we only need to compare
 * the current element
 * with the last unique element.
 *
 * ===================================================
 * Brute Force Idea
 *
 * Create another array.
 *
 * Copy only unique elements
 * into the temporary array.
 *
 * Ignore duplicates.
 *
 * ===================================================
 * Solution Intuition
 *
 * Since duplicates are adjacent,
 *
 * compare:
 *
 * Current Element
 *
 * with
 *
 * Last Unique Element
 *
 * If they are different,
 * store the current element.
 *
 * Otherwise,
 * ignore it.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Create a temporary array.
 *
 * Step 2:
 *
 * Copy the first element.
 *
 * Step 3:
 *
 * Traverse the remaining array.
 *
 * Step 4:
 *
 * If current element
 * is different from
 * the last stored element,
 *
 * copy it into temp[].
 *
 * Step 5:
 *
 * Return the number
 * of unique elements.
 *
 * ===================================================
 * Dry Run
 *
 * Input:
 *
 * {0,0,1,1,1,2,2,3,3,4}
 *
 * -----------------------------------
 * Initially
 *
 * temp = {0}
 *
 * rd = 0
 *
 * -----------------------------------
 * i = 1
 *
 * arr[1] = 0
 *
 * Duplicate
 *
 * Ignore
 *
 * -----------------------------------
 * i = 2
 *
 * arr[2] = 1
 *
 * Different
 *
 * rd = 1
 *
 * temp = {0,1}
 *
 * -----------------------------------
 * i = 3
 *
 * Duplicate
 *
 * Ignore
 *
 * -----------------------------------
 * i = 5
 *
 * temp = {0,1,2}
 *
 * -----------------------------------
 * i = 7
 *
 * temp = {0,1,2,3}
 *
 * -----------------------------------
 * i = 9
 *
 * temp = {0,1,2,3,4}
 *
 * Final Answer:
 *
 * Unique Count = 5
 *
 * ===================================================
 * Important Variable
 *
 * rd
 *
 * Remove Duplicate Index
 *
 * OR
 *
 * Index of the last
 * unique element stored
 * inside temp[].
 *
 * ===================================================
 * Why compare with temp[rd]?
 *
 * temp[rd]
 *
 * always stores
 * the last unique element.
 *
 * Example:
 *
 * temp
 *
 * {0,1,2}
 *      ^
 *     rd
 *
 * If current element is
 * different from temp[rd],
 *
 * then it is a NEW element.
 *
 * ===================================================
 * Limitation
 *
 * This solution uses
 * another array.
 *
 * Therefore,
 * extra memory is required.
 *
 * ===================================================
 * Better Solution
 *
 * Use Two Pointers.
 *
 * Store unique elements
 * in the same array.
 *
 * No extra array required.
 *
 * Time:
 *
 * O(n)
 *
 * Space:
 *
 * O(1)
 *
 * ===================================================
 * Time Complexity:
 *
 * O(n)
 *
 * One traversal.
 *
 * ===================================================
 * Space Complexity:
 *
 * O(n)
 *
 * Temporary array.
 *
 * ===================================================
 * Pattern Used:
 *
 * Sorted Array
 * +
 * Temporary Array
 *
 * ===================================================
 * Key Takeaway:
 *
 * Since the array is sorted,
 * duplicates appear together.
 *
 * Compare every element
 * with the last unique element
 * to remove duplicates.
 */

public class Q11_RemoveDuplicate {

    // ---------------------------------------------------
    // Removes duplicates from a sorted array
    // using a temporary array.
    // Returns the number of unique elements.
    // ---------------------------------------------------
    static int removeDuplicate(int arr[]) {

        // Temporary array to store
        // unique elements.
        int temp[] = new int[arr.length];

        // Index of the last unique element
        // stored in temp[].
        int rd = 0;

        // First element is always unique.
        temp[rd] = arr[0];

        // Traverse the remaining elements.
        for (int i = 1; i < arr.length; i++) {

            // If current element is different
            // from the last stored unique element.
            if (arr[i] != temp[rd]) {

                rd++;

                temp[rd] = arr[i];
            }
        }

        System.out.println("Unique Elements:");

        // Print only the unique elements.
        for (int i = 0; i <= rd; i++) {

            System.out.print(temp[i] + " ");
        }

        System.out.println();

        // Number of unique elements.
        return rd + 1;
    }

    public static void main(String[] args) {

        int arr[] = {0,0,1,1,1,2,2,3,3,4};

        int unique = removeDuplicate(arr);

        System.out.println("Unique Count = " + unique);
    }
}