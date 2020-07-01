package com.samim.algorithms.sorting;

public class ArrayGlobal {
    public static void printArray(String message, int[] array){
        String arrayValue = "{";
        for(int i = 0; i< array.length; i++){
            arrayValue+=array[i]+", ";
        }
        arrayValue+="}";
        System.out.println(message+arrayValue);
    }
    public static void printArray(int[] array){
        String arrayValue = "{";
        for(int i = 0; i< array.length; i++){
            arrayValue+=array[i]+", ";
        }
        arrayValue+="}";
        System.out.println(arrayValue);
    }
}
