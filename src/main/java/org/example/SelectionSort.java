package org.example;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Iterar a través de todos los elementos del arreglo
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del elemento mínimo en el arreglo no ordenado
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercambiar el elemento mínimo encontrado con el primer elemento no ordenado
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Arreglo original:");
        printArray(arr);

        // Aplicar Selection Sort
        selectionSort(arr);

        System.out.println("\nArreglo ordenado usando Selection Sort:");
        printArray(arr);
    }

    // Función para imprimir un arreglo
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
