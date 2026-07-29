package Basics;

public class Q2_HarshedNumber3099 {
    static int sumOfTheDigitsOfHarshadNumber(int x) {
        // int rem = 0;
        int sum = 0;
        int n = x;
        while (x > 0) {
            int rem = x % 10;
            sum = rem + sum;
            x /= 10;
        }
      if(n%sum==0)
      {
        return sum;
      }
      return -1;
    }

    public static void main(String[] args) {
       int res =  sumOfTheDigitsOfHarshadNumber(23);
       System.out.println(res);
    }
}
