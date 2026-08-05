package ch1_Array.LeetCodeSolution;

public class Q2_SearchEle {

    static int searchEle(int arr[], int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 205, 0, 365, 7, -58, 96, 25, -12, 74 };
        int a = 205;

        int ans = searchEle(arr, a);
        if (ans == -1) {
            System.out.println("Element is not found");
        } else {
            System.out.println("Element is at the index: " + ans);
        }
    }
}
