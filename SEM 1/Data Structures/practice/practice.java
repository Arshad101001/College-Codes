import java.util.*;


// linear search

// class searching{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number of elements of array : ");
//         int n = sc.nextInt();

//         System.out.println("Enter elements of array : ");
//         int[] arr = new int[n]; // 0 - 4

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt(); // 0 1 2 3 4 5
//         }

//         System.out.println("Enter a number you want to search : ");
//         int val = sc.nextInt();
//         // 1, 2, 3, 4, 5

//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i] == val){
//                 System.out.println("Element found at index : " + i);
//                 break;
//             }  
//             else if (i == arr.length - 1){
//                 System.out.println("Element not found");
//             }
//         }
//     }
// }

// binary search

// class searching {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number of elements of array : ");
//         int n = sc.nextInt();

//         System.out.println("Enter elements of array in sorted order : ");
//         int[] arr = new int[n]; // 0 - 4

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt(); // 0 1 2 3 4 5
//         }

//         System.out.println("Enter a number you want to search : ");
//         int val = sc.nextInt();

//         int low = 0;
//         int high = arr.length - 1;
//         boolean found = false;

//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == val) {
//                 found = true;
//                 System.out.println("Element found at index : " + mid);
//                 break;
//             } 
//             else if (val < arr[mid]) {
//                 high = mid - 1;
//                 if (mid == low) {
//                     System.out.println("Element not found");
//                 }
//             } 
//             else if (val > arr[mid]) {
//                 low = mid + 1;
//                 if (mid == high) {
//                     System.out.println("Element not found");
//                 }
//             }
// if(!found){
//      System.out.println("Element not found");
// }
//         }
//         sc.close();

//     }
// }

// bubble sort

// class BubbleSort {

//     public static void bubbleSort(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }

//             }

//             System.out.println("Array after " + (i + 1) + " pass :");
//             printArray(arr);
//         }
//     }

//     public static void printArray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of the array : ");
//         int n = sc.nextInt();

//         System.out.println("Enter elements of array : ");
//         int[] arr = new int[n];

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Array before Sorting");
//         printArray(arr);

//         bubbleSort(arr);

//         sc.close();
//     }

// }

// selection sort

// class SelectionSort{

//     public static void selectionSort(int[] arr){
//         for (int i = 0; i < arr.length; i++) {
//             int index = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if(arr[index] > arr[j]){
//                     index = j;
//                 }
//             }

//             int temp = arr[i];
//             arr[i] = arr[index];
//             arr[index] = temp;

//             System.out.println("Array after " + (i + 1) + " pass :");
//             printArray(arr);
//         }
//     }

//     public static void printArray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of the array : ");
//         int n = sc.nextInt();

//         System.out.println("Enter elements of array : ");
//         int[] arr = new int[n];

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("\nArray before Sorting");
//         printArray(arr);
//         // System.out.println(Arrays.toString(arr));

//         selectionSort(arr);

//         sc.close();
//     }

// }

// Insertion sort

// class InsertionSort {

//     public static void insertionSort(int[] arr){
//         for (int i = 1; i < arr.length; i++) {
//             int j = i - 1;

//             while (j >= 0 && arr[j] > arr[j+1]) {
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//                 j--;
//             }

//             System.out.println("Array after " + i + " pass :");
//             System.out.println(Arrays.toString(arr));

//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of the array : ");
//         int n = sc.nextInt();

//         System.out.println("Enter elements of array : ");
//         int[] arr = new int[n];

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("\nArray before sorting : ");
//         System.out.println(Arrays.toString(arr) + "\n");

//         insertionSort(arr);

//         sc.close();
//     }
// }

// Quick sort

// class QuickSort {

//     public static int partition(int[] arr, int low, int high) {
//         int pivot = arr[high];
//         int index = low - 1;
//         for (int i = low; i <= high; i++) {
//             if (arr[i] <= pivot) {
//                 index++;
//                 int temp = arr[index];
//                 arr[index] = arr[i];
//                 arr[i] = temp;
//             }
//         }

//         System.out.println(Arrays.toString(arr) + "Array after pass");

//         return index;

//     }

//     public static void quickSort(int[] arr, int low, int high) {
//         if (low < high) {

//             int partitionIndex = partition(arr, low, high);
//             // System.out.println(Arrays.toString(arr) + " index is " + partitionIndex);
//             quickSort(arr, low, partitionIndex - 1);
//             quickSort(arr, partitionIndex + 1, high);
//         }

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of the array : ");
//         int n = sc.nextInt();

//         System.out.println("Enter elements of array : ");
//         int[] arr = new int[n];

//         for (int i = 0; i < arr.length; i++) {
//         arr[i] = sc.nextInt();
//         }

//         System.out.println("\nArray before sorting : ");
//         System.out.println(Arrays.toString(arr) + "\n");

//         System.out.println(Arrays.toString(arr) + "Array before sort");

//         quickSort(arr, 0, arr.length - 1);
//         sc.close();
//     }
// }

// shell sort

// class ShellSort {
//     static int pass = 1;

//     public static void shellSort(int[] arr) {
//         for (int gap = arr.length / 2; gap > 0; gap /= 2) {
//             for (int i = gap; i < arr.length; i++) {
//                 for (int j = (i - gap); j >= 0; j -= gap) {
//                     if (arr[j] > arr[j + gap]) {
//                         int temp = arr[j];
//                         arr[j] = arr[j + gap];
//                         arr[j + gap] = temp;
//                     }
//                 }
//             }
//             System.out.println("Array after pass " + pass++ + Arrays.toString(arr));
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of the array : ");
//         int n = sc.nextInt();

//         System.out.println("Enter elements of array : ");
//         int[] arr = new int[n];

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("\nArray before sorting : ");
//         System.out.println(Arrays.toString(arr) + "\n");

//         shellSort(arr);

//         sc.close();
//     }
// }

// radix sort

class RadixSort {

    public static void radixSort (int[] arr){

    }
    public static void main(String[] args) {
        int[] arr = {105, 101, 106, 100, 111};

        System.out.println("\nArray before sorting is : " + Arrays.toString(arr) + "\n");

        radixSort(arr);

    }
}