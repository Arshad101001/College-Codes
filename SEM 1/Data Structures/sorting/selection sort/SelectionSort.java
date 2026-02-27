// Selection Sort is a simple sorting algorithm that repeatedly finds the smallest (or largest) element from the unsorted part and places it at the beginning of the sorted part.

import java.util.*;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[index] > arr[j]){
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

            System.out.println("Array after " + (i + 1) + " pass :");
            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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

        System.out.println("\nArray before Sorting");
        printArray(arr);
        // System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        sc.close();
    }
}
