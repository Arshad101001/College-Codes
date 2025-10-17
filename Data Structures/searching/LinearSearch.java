// Linear Search is a simple searching technique that checks each element one by one in a list until the target element is found or the list ends.

package searching;

import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements of array : ");
        int n = sc.nextInt();

        System.out.println("Enter elements of array : ");
        int[] arr = new int[n]; // 0 - 4

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 0 1 2 3 4 5
        }

        System.out.println("Enter a number you want to search : ");
        int val = sc.nextInt();
        // 1, 2, 3, 4, 5

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                System.out.println("Element found at index : " + i);
                break;
            } else if (i == arr.length - 1) {
                System.out.println("Element not found");
            }
        }
        sc.close();
    }
}
