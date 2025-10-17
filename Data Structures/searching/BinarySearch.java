// Binary Search is a fast searching algorithm that repeatedly divides a sorted list in half to find the target element, eliminating half of the remaining elements each time.

package searching;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements of array : ");
        int n = sc.nextInt();

        System.out.println("Enter elements of array in sorted order : ");
        int[] arr = new int[n]; // 0 - 4

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 0 1 2 3 4 5
        }

        System.out.println("Enter a number you want to search : ");
        int val = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;
        // boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == val) {
                // found = true;
                System.out.println("Element found at index : " + mid);
                break;
            } else if (val < arr[mid]) {
                high = mid - 1;
                if (mid == low) {
                    System.out.println("Element not found");
                }
            } else if (val > arr[mid]) {
                low = mid + 1;
                if (mid == high) {
                    System.out.println("Element not found");
                }
            }
        }
        // if (!found) {
        //     System.out.println("Element not found");
        // }
        sc.close();

    }
}
