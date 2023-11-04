package org.example;
import java.util.Random;

class BubbleSort{

    // An optimized version of Bubble Sort
    static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    // Function to print an array
    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        long tiempo_inicial = System.currentTimeMillis();
        int size = 10; // Specify the size of the array
        int arr[] = new int[size];
        Random random = new Random();

        // Populate the array with random numbers between 1 and 100
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100) + 1;
        }

        bubbleSort(arr, size);

        System.out.println("Sorted array: ");
        printArray(arr, size);
        System.out.println(System.currentTimeMillis() - tiempo_inicial);
    }
}
/*
cita
This code is contributed by Nikita Tiwari.
https://www.geeksforgeeks.org/bubble-sort/
 */
