package com.samim.algorithms.sorting;

public class ArraySort {
    public void bubbleSort(int[] myArray){
        for(int i = 1; i< myArray.length;i++){
            for(int j= 0;j<myArray.length-i;j++){
                if(myArray[j] > myArray[j+1]){
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }
    }

    public void selectionSort(int[] myArray){
        for(int i = 0; i< myArray.length;i++){
            //we consider the first element as smallest element
            int smallestIndex = i;
            //search from second element to the end to find if it is smaller than the first
            for(int j=i+1;j<myArray.length-1;j++){
                if(myArray[j] < myArray[smallestIndex] ){
                    smallestIndex = j;
                }
            }
            int temp = myArray[i];
            myArray[i] = myArray[smallestIndex];
            myArray[smallestIndex] = temp;
        }
    }

    public void insertionSort(int[] mArray){
        for(int i = 1;i < mArray.length;i++){
            int temp = mArray[i];
            int backIndex = i;
            while (backIndex > 0 && temp < mArray[backIndex-1]){
                mArray[backIndex] = mArray[backIndex-1];
                backIndex--;
            }
            mArray[backIndex] = temp;
        }
    }
}
