/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubbolesort;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Bubbolesort {
    // Method to implement bubble sort in descending order
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Modify the comparison to sort in descending order
                if (array[j] < array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];

        // Ask the user to enter 8 numbers
        System.out.println("Enter 8 numbers:");
        for (int i = 0; i < 8; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array in descending order
        bubbleSort(numbers);

        // Print the sorted array
        System.out.println("Sorted array in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
 }
    }

}
