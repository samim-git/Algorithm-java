package com.samim.algorithms;

import com.samim.algorithms.sorting.ArrayGlobal;
import com.samim.algorithms.sorting.ArraySort;

public class Main {

    public static void main(String[] args) {
        int[] array = {8,12,5,14,3,1,10};
        ArraySort arraySort = new ArraySort();
        ArrayGlobal.printArray("Before sort: ",array);
//        arraySort.bubbleSort(array);
//        arraySort.selectionSort(array);
        arraySort.insertionSort(array);
        ArrayGlobal.printArray("After Sort: ",array);
    }
}
