package ch1_Array.LeetCodeSolution;

public class Q4_SumElement {

    static int sumEle(int arr[]) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int arr[] = {10, 205, 0, 365, 7, -58, 96, 25, -12, 74};

        int res = sumEle(arr);

        System.out.println("Sum = " + res);
    }
}