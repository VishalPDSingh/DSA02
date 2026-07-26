package ch2_SearchingAndSorting.class3_Sorting;

public class Demo1BubbleSort {

    static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 5, 4, 2};

        bubbleSort(arr);
    }
}