package Basics;

public class Q1_SumMultiple2652 {
    static int sumOfMultiples(int n) {
        int sum = 0;
        while (n > 0) {
            if (n % 3 == 0) {
                sum = sum + n;
            } else if (n % 5 == 0) {
                sum = sum + n;
            } else if (n % 7 == 0) {
                sum = sum + n;
            }
            n--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int re = sumOfMultiples(10);
        System.out.println(re);
    }
}
