import java.util.Scanner;

public class InsertionSort {

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
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Perform insertion sort in ascending order
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

        // Display the sorted array in ascending order
        System.out.println("Sorted Array in Ascending Order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Reverse the sorted array to get descending order
        for (int i = 0; i < n / 2; i++) {
            // Swap elements to reverse the array
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        // Display the sorted array in descending order
        System.out.println("Sorted Array in Descending Order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
