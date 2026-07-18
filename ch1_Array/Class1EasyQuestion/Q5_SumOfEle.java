package ch1_Array.Class1EasyQuestion;

/*
 * Find the Sum of All Elements in an Array
 *
 * ---------------------------------------------------
 * Problem:
 * Calculate and return the sum of all elements
 * present in an array.
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Initialize a variable 'sum' with 0.
 *
 * Step 2:
 * Traverse the array from the first element
 * to the last element.
 *
 * Step 3:
 * Add the current element to 'sum'.
 *
 * Step 4:
 * After traversing the complete array,
 * return the final sum.
 *
 * ---------------------------------------------------
 * Dry Run:
 *
 * Array:
 * [10, 205, 0, 365, 7]
 *
 * Initial:
 * sum = 0
 *
 * sum = 0 + 10  = 10
 * sum = 10 + 205 = 215
 * sum = 215 + 0 = 215
 * sum = 215 + 365 = 580
 * sum = 580 + 7 = 587
 *
 * Final Answer:
 * Sum = 587
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Accumulator Pattern
 *
 * 'sum' acts as an accumulator.
 * It stores the running total while
 * traversing the array.
 *
 * This pattern is commonly used in:
 *
 * • Sum of Elements
 * • Prefix Sum
 * • Kadane's Algorithm
 * • Average Calculation
 * • Frequency Counting
 *
 * ---------------------------------------------------
 * Time Complexity:
 *
 * One Traversal = O(n)
 *
 * ---------------------------------------------------
 * Space Complexity:
 *
 * O(1)
 *
 * ---------------------------------------------------
 * Key Takeaway:
 *
 * Initialize sum = 0.
 *
 * Traverse the array once and keep adding
 * every element to the running total.
 *
 * This is one of the most fundamental
 * array traversal patterns.
 */

public class Q5_SumOfEle {

    // ---------------------------------------------------
    // Calculate Sum of All Elements
    // ---------------------------------------------------
    static int sumEle(int arr[]) {

        // Stores the running total.
        int sum = 0;

        // ---------------------------------------------------
        // Traverse the complete array.
        // ---------------------------------------------------
        for (int i = 0; i < arr.length; i++) {

            // Add the current element to the running total.
            sum = sum + arr[i];

            // Same as:
            // sum += arr[i];
        }

        // Return the final sum.
        return sum;
    }

    public static void main(String[] args) {

        int arr[] = {10, 205, 0, 365, 7, -58, 96, 25, -12, 7};

        // Store the returned sum.
        int sum = sumEle(arr);

        // Print the sum of all elements.
        System.out.println("Sum of all elements = " + sum);
    }
}