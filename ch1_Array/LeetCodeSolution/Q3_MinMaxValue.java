package ch1_Array.LeetCodeSolution;

public class Q3_MinMaxValue {

    static int[] minmaxValue(int arr[]) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return new int[] { minValue, maxValue };
    }

    public static void main(String[] args) {

        int arr[] = { 10, 205, 0, 365, 7, -58, 96, 25, -12, 74 };
        int res[] = minmaxValue(arr);
        for (int ans : res)
            System.out.println(ans);
    }
}
