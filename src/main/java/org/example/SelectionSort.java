package org.example;
import java.util.Random;

// Java program for implementation
// of Selection Sort

// Driver Class
class SelectionSort {

    void sort(int[] arr)
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // main function
    public static void main(String[] args)
    {
        long tiempo_inicial = System.currentTimeMillis();
        SelectionSort ob = new SelectionSort();

        // Generate a random array with a specified size
        int size = 10; // Change this to the desired size of your array
        int[] arr = new int[size];
        Random random = new Random();

        // Fill the array with random numbers from 1 to 100
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100) + 1; // Generates random number from 1 to 100
        }
        ob.sort(arr);
        System.out.println("Sorted array:");
        ob.printArray(arr);

        System.out.println(System.currentTimeMillis() - tiempo_inicial);
    }
}
/*
cita
https://www.geeksforgeeks.org/java-program-for-selection-sort/
 */

