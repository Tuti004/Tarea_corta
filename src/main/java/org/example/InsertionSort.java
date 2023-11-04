package org.example;
import java.util.Random;

public class InsertionSort {
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        long tiempo_inicial = System.currentTimeMillis();
        int size = 10;

        int arr[] = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; ++i) {
            arr[i] = random.nextInt(100) + 1; // Generates random number between 1 and 100
        }

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        printArray(arr);
        System.out.println(System.currentTimeMillis() - tiempo_inicial);
    }
}
/*
cita
This code is contributed by Rajat Mishra.
https://www.geeksforgeeks.org/insertion-sort/
 */


