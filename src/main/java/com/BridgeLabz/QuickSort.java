package com.BridgeLabz;

public class QuickSort extends QuickNMergeSort implements Runnable {
    int partition(int[] array, int first, int last) {
        int pivot = array[(first + last) / 2];
        while (first <= last) {
            while (array[first] < pivot)
                first++;
            while (array[last] > pivot)
                last--;
            if (first <= last) {
                int temp = array[first];
                array[first] = array[last];
                array[last] = temp;
                first++;
                last--;
            }
        }
        return first;
    }

    void quickSortRecursion(int[] array, int first, int last) {
        int newPivot = partition(array, first, last);
        if (first < newPivot - 1)
            quickSortRecursion(array, first, newPivot - 1);
        if (newPivot < last)
            quickSortRecursion(array, newPivot, last);
    }

    void printArray(int[] array) {
        for (int tempArray : array) {
            System.out.print(tempArray + " ");
        }
    }

    @Override
    public void run() {
        System.out.println("Sorted array");
    }
}