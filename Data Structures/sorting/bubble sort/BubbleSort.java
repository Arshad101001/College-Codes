// import java.util.*;
class BubbleSort {

    static void bubbleSort(int[] arr, int n) {
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap the numbers
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // if swap not done i.e soring completed then run below code

            if (!swapped) {
                break;
            }
        }
    }

    // function to print array

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 25, 5, 34, 24, 23 };

        int n = arr.length;

        bubbleSort(arr, n);

        System.out.println("Sorted Array :");
        printArray(arr, n);
    }
}