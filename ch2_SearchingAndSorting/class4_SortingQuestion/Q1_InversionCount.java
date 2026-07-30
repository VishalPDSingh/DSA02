package ch2_SearchingAndSorting.class4_SortingQuestion;

/*
 * Inversion Count (Brute Force)
 *
 * ===================================================
 * Problem:
 *
 * Count the number
 * of inversions
 * in an array.
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
 * Main Idea
 *
 * Compare
 * every element
 * with all elements
 * to its right.
 *
 * If
 *
 * arr[i] > arr[j]
 *
 * then
 * it is an inversion.
 *
 * Increase
 * the count.
 *
 * ===================================================
 * Algorithm
 *
 * Step 1:
 *
 * Initialize
 *
 * count = 0
 *
 * Step 2:
 *
 * Traverse
 * the array
 * using i.
 *
 * Step 3:
 *
 * Traverse
 * all elements
 * after i
 * using j.
 *
 * Step 4:
 *
 * If
 *
 * arr[i] > arr[j]
 *
 * count++
 *
 * Step 5:
 *
 * Return
 * the total count.
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
 * i = 0
 *
 * Compare
 *
 * 8 and 4
 *
 * Inversion
 *
 * Count = 1
 *
 * Compare
 *
 * 8 and 2
 *
 * Inversion
 *
 * Count = 2
 *
 * Compare
 *
 * 8 and 1
 *
 * Inversion
 *
 * Count = 3
 *
 * -----------------------------------
 *
 * i = 1
 *
 * Compare
 *
 * 4 and 2
 *
 * Inversion
 *
 * Count = 4
 *
 * Compare
 *
 * 4 and 1
 *
 * Inversion
 *
 * Count = 5
 *
 * -----------------------------------
 *
 * i = 2
 *
 * Compare
 *
 * 2 and 1
 *
 * Inversion
 *
 * Count = 6
 *
 * -----------------------------------
 *
 * i = 3
 *
 * No element
 * on the right.
 *
 * Final Count
 *
 * 6
 *
 * ===================================================
 * Why
 *
 * j = i + 1 ?
 *
 * Because
 * we only compare
 * elements
 * on the right side.
 *
 * An inversion
 * requires
 *
 * i < j.
 *
 * ===================================================
 * Why
 *
 * arr[i] > arr[j] ?
 *
 * Because
 * an inversion
 * occurs when
 * a larger element
 * appears
 * before
 * a smaller element.
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
 * Space Complexity
 *
 * O(1)
 *
 * No extra space
 * is used.
 *
 * ===================================================
 * Stable?
 *
 * Not Applicable.
 *
 * This algorithm
 * only counts
 * inversions.
 *
 * ===================================================
 * Pattern Used
 *
 * Nested Loops
 *
 * +
 *
 * Pair Comparison
 *
 * ===================================================
 * Optimization
 *
 * This brute-force
 * approach
 * checks every pair.
 *
 * A better solution
 * uses
 * Merge Sort
 * and counts
 * inversions
 * during merging.
 *
 * Time Complexity
 *
 * O(n log n)
 *
 * ===================================================
 * Key Takeaway
 *
 * Compare
 * every element
 * with all elements
 * to its right.
 *
 * If
 *
 * arr[i] > arr[j]
 *
 * it is an inversion.
 *
 * Count
 * all such pairs.
 */

public class Q1_InversionCount {

    static int inversionCount(int arr[]) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    System.out.print("(" + arr[i] + "," + arr[j] + ") ");

                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int arr[] = {8, 4, 2, 1};

        int res = inversionCount(arr);

        System.out.println("\nTotal Inversions = " + res);
    }
}