package ch1_Array.EasyQuestion;

import java.util.Scanner;

/*
 * Swap Two Numbers (Pass by Value)
 *
 * ---------------------------------------------------
 * Problem:
 * Swap the values of two numbers using a temporary
 * variable.
 *
 * ---------------------------------------------------
 * Main Logic:
 *
 * Step 1:
 * Store the first value in a temporary variable.
 *
 * Step 2:
 * Assign the second value to the first variable.
 *
 * Step 3:
 * Assign the temporary value to the second variable.
 *
 * ---------------------------------------------------
 * Swap Process:
 *
 * Before:
 * a = 10
 * b = 20
 *
 * temp = a     → temp = 10
 * a = b        → a = 20
 * b = temp     → b = 10
 *
 * After:
 * a = 20
 * b = 10
 *
 * ---------------------------------------------------
 * Important Concept:
 *
 * Java is Pass by Value.
 *
 * The swap() method receives COPIES of 'a' and 'b',
 * not the original variables from main().
 *
 * So the values are swapped only inside the swap()
 * method.
 *
 * Original variables in main() remain unchanged.
 *
 * Example:
 *
 * main():
 * a = 10
 * b = 20
 *
 * swap(a, b)
 *
 * Inside swap():
 * a = 20
 * b = 10
 *
 * Back to main():
 * a = 10
 * b = 20
 *
 * ---------------------------------------------------
 * Time Complexity:
 * O(1)
 *
 * Space Complexity:
 * O(1)
 */

public class Q1_SwapEle {

    // ---------------------------------------------------
    // Swap Two Numbers
    // ---------------------------------------------------
    static void swap(int a, int b) {

        // ---------------------------------------------------
        // Step 1:
        // Store the value of 'a' in a temporary variable.
        // ---------------------------------------------------
        int temp = a;

        // ---------------------------------------------------
        // Step 2:
        // Copy the value of 'b' into 'a'.
        // ---------------------------------------------------
        a = b;

        // ---------------------------------------------------
        // Step 3:
        // Copy the original value of 'a' (stored in temp)
        // into 'b'.
        // ---------------------------------------------------
        b = temp;

        // Print swapped values (only inside this method)
        System.out.println(
                "Value of a and b after swapping: " + a + " " + b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read two numbers from the user
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Print original values
        System.out.println(
                "Value of a and b before swapping: " + a + " " + b);

        // Call swap method
        // NOTE:
        // Only copies of a and b are sent.
        swap(a, b);

        // Uncomment below to verify Pass by Value
        /*
         * System.out.println(
         * "Back in main(): " + a + " " + b);
         */

        sc.close();
    }
}