package com.BridgeLabz.sort;

public class MergeSort extends QuickNMergeSort implements Runnable
{
    int array[];
    int tempMergeArray[];
    int length;

    public void sort(int inputArray[])
    {
        this.array = inputArray;
        this.length = inputArray.length;
        this.tempMergeArray = new int[length];
        divideArray(0, length-1);
    }

    //METHOD TO DIVIDE ARRAY
    public void divideArray(int lowerIndex, int higherIndex)
    {
        if(lowerIndex < higherIndex)
        {
            int middle = lowerIndex+(higherIndex - lowerIndex)/2;

            //IT WILL SORT LEFT SIDE OF ARRAY
            divideArray(lowerIndex, middle);

            //IT WILL SORT RIGHT SIDE OF ARRAY
            divideArray(middle + 1, higherIndex);

            mergeArray(lowerIndex, middle, higherIndex);

        }
    }

    //METHOD TO MERGE SORTED ARRAY
    public void mergeArray(int lowerIndex, int middle, int higherIndex)
    {
        for (int index = lowerIndex;index <= higherIndex;index++)
            tempMergeArray[index] = array[index];
        int lower = lowerIndex;
        int middle1 = middle+1;
        int lower1 = lowerIndex;

        while (lower <= middle && middle1 <= higherIndex)
        {
            if (tempMergeArray[lower] <= tempMergeArray[middle1])
            {
                array[lower1] = tempMergeArray[lower];
                lower++;
            }
            else
            {
                array[lower1] = tempMergeArray[middle1];
                middle1++;
            }
            lower1++;
        }
        while (lower <= middle)
        {
            array[lower1] = tempMergeArray[lower];
            lower1++;
            lower++;
        }
    }

    //METHOD TO PRINT ARRAY
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
