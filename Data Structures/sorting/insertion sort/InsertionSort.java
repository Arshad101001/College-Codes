// Insertion Sort is a simple sorting algorithm that builds the sorted list one element at a time by inserting each new element into its correct position among the already sorted elements.

import java.util.*;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;

            while (j >= 0 && arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }

            System.out.println("Array after " + i + " pass :");
            System.out.println(Arrays.toString(arr));

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int n = sc.nextInt();

        System.out.println("Enter elements of array : ");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray before sorting : ");
        System.out.println(Arrays.toString(arr) + "\n");

        insertionSort(arr);

        sc.close();
    }
}
