package ch1_Array.Class1EasyQuestion;

public class Demo2_Traversing {
    public static void main(String[] args) {
        
        int arr[];
        arr = new int[10];

        for(int i=0; i<=arr.length-1; i++)
        {
            arr[i]= i+5;
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
