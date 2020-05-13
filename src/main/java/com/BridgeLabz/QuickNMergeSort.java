package com.BridgeLabz;

public class QuickNMergeSort {
    public static void main(String[] args) {
        int[] quickSortArray = {15, 9, 7, 13, 12, 16, 4, 18, 11};
        int length1 = quickSortArray.length;
        QuickSort quickSort = new QuickSort();
        Thread thread = new Thread(quickSort);
        thread.start();
        quickSort.quickSortRecursion(quickSortArray, 0, length1 - 1);
        quickSort.printArray(quickSortArray);
    }
}