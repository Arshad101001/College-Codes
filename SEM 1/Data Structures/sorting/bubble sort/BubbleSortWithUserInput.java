// Bubble Sort is a simple sorting algorithm that repeatedly compares and swaps adjacent elements if they’re in the wrong order, gradually “bubbling” the largest element to the end.

import java.util.Scanner;

public class BubbleSortWithUserInput {
    // code for sorting the array
    public static void sortArray(int[] arr, int n) {
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap the value
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] arr, int n) {
        System.out.print("Sorted array is as follow: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Entered array is: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        sortArray(arr, n);
        printArray(arr, n);

        sc.close();
    }
}
