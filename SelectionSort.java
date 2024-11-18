import java.util.Scanner;

public class SelectionSort {

    // Method for ascending order selection sort
    public static void selectionSortAscending(int[] arr) {
        int n = arr.length;

        // Outer loop for each element of the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the current position has the minimum value
            int minIndex = i;

            // Inner loop to find the smallest element in the remaining unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  // Update the index of the minimum element
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Method for descending order selection sort
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;

        // Outer loop for each element of the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the current position has the maximum value
            int maxIndex = i;

            // Inner loop to find the largest element in the remaining unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;  // Update the index of the maximum element
                }
            }

            // Swap the found maximum element with the first element of the unsorted part
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
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

        // Perform selection sort in ascending order
        selectionSortAscending(arr);
        System.out.println("Sorted Array in Ascending Order:");
        printArray(arr);

        // Asking for a new array to sort in descending order
        System.out.println("\nRe-enter the elements of the array for descending order sorting:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Perform selection sort in descending order
        selectionSortDescending(arr);
        System.out.println("Sorted Array in Descending Order:");
        printArray(arr);

        sc.close();
    }
}
