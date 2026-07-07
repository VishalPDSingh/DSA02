package ch1_Array.PatternQuestion;

/*
 * Product of Array Except Self
 * (Prefix Product + Suffix Product)
 *
 * ---------------------------------------------------
 * Problem:
 *
 * Given an array,
 * return a new array where each element
 * contains the product of all elements
 * except itself.
 *
 * Division is NOT allowed.
 *
 * ---------------------------------------------------
 * Example:
 *
 * Input:
 *
 * [1, 2, 3, 4]
 *
 * Output:
 *
 * [24, 12, 8, 6]
 *
 * Explanation:
 *
 * Index 0
 *
 * 2 × 3 × 4 = 24
 *
 * Index 1
 *
 * 1 × 3 × 4 = 12
 *
 * Index 2
 *
 * 1 × 2 × 4 = 8
 *
 * Index 3
 *
 * 1 × 2 × 3 = 6
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 *
 * Construct Prefix Product array.
 *
 * Prefix Product[i]
 *
 * =
 *
 * Product of all elements
 * from index 0 to i.
 *
 * Step 2:
 *
 * Traverse from right to left
 * while maintaining Suffix Product.
 *
 * Step 3:
 *
 * Product Except Self
 *
 * =
 *
 * Prefix Product before i
 * ×
 * Suffix Product after i
 *
 * ---------------------------------------------------
 * Prefix Product Formula:
 *
 * pre[0] = arr[0]
 *
 * pre[i]
 * =
 * pre[i - 1] × arr[i]
 *
 * ---------------------------------------------------
 * Why it Works?
 *
 * Suppose:
 *
 * Array
 *
 * [1, 2, 3, 4]
 *
 * Prefix Product:
 *
 * [1, 2, 6, 24]
 *
 * -----------------------------------
 *
 * While traversing from right:
 *
 * suffix = 1
 *
 * i = 3
 *
 * Answer
 *
 * = pre[2] × 1
 *
 * = 6
 *
 * suffix = 4
 *
 * -----------------------------------
 *
 * i = 2
 *
 * Answer
 *
 * = pre[1] × 4
 *
 * = 8
 *
 * suffix = 12
 *
 * -----------------------------------
 *
 * i = 1
 *
 * Answer
 *
 * = pre[0] × 12
 *
 * = 12
 *
 * suffix = 24
 *
 * -----------------------------------
 *
 * i = 0
 *
 * Answer
 *
 * = suffix
 *
 * = 24
 *
 * Final Answer:
 *
 * [24, 12, 8, 6]
 *
 * ---------------------------------------------------
 * Pattern Used:
 *
 * Prefix Product
 * +
 * Running Suffix Product
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Instead of creating a separate suffix array,
 * maintain only one variable:
 *
 * suffix
 *
 * This saves extra memory.
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * Prefix Traversal
 * = O(n)
 *
 * Suffix Traversal
 * = O(n)
 *
 * Total
 *
 * O(n)
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(n)
 *
 * Output Array
 *
 * Extra Variables
 *
 * O(1)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Answer at index i
 *
 * =
 *
 * Prefix Product before i
 * ×
 * Suffix Product after i
 */

public class Q7_ProductofArrayExpect_Itsel {

    // ---------------------------------------------------
    // Product of Array Except Self
    // ---------------------------------------------------
    static int[] productExpectItself(int arr[]) {

        // Stores prefix products and later becomes
        // the final answer array.
        int prePro[] = new int[arr.length];

        // First prefix product.
        prePro[0] = arr[0];

        // -------------------------------------------
        // Step 1:
        // Construct Prefix Product array.
        // -------------------------------------------
        for (int i = 1; i < arr.length; i++) {

            prePro[i] = prePro[i - 1] * arr[i];
        }

        // -------------------------------------------
        // Step 2:
        // Traverse from right while maintaining
        // suffix product.
        // -------------------------------------------
        int suffix = 1;

        for (int i = arr.length - 1; i > 0; i--) {

            // Product Except Self
            prePro[i] = prePro[i - 1] * suffix;

            // Update suffix product.
            suffix *= arr[i];
        }

        // For index 0,
        // only suffix product exists.
        prePro[0] = suffix;

        return prePro;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};

        int res[] = productExpectItself(arr);

        for (int ans : res)

            System.out.println(ans);
    }
}