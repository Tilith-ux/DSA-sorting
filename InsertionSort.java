import java.util.Scanner;

public class InsertionSort {

    // Method for ascending order insertion sort
    public static void insertionSortAscending(int[] arr) {
        int n = arr.length;

        // Outer loop to iterate through the array
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // The element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Method for descending order insertion sort
    public static void insertionSortDescending(int[] arr) {
        int n = arr.length;

        // Outer loop to iterate through the array
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // The element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1] that are smaller than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking the user for the array size
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Declaring an array of the given size
        int[] arr = new int[n];

        // Asking the user to input the values of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Displaying the original array
        System.out.println("\nOriginal Array:");
        printArray(arr);

        // Perform insertion sort in ascending order
        insertionSortAscending(arr);
        System.out.println("Sorted Array in Ascending Order:");
        printArray(arr);

        // Perform insertion sort in descending order (same array)
        insertionSortDescending(arr);
        System.out.println("Sorted Array in Descending Order:");
        printArray(arr);

        sc.close();
    }
}
