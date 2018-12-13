package com.SaravananPractice.Array;

public class Main {

    public static void main(String[] args){
        int[] array = new int[10];
        for(int i=0 ; i< array.length  ; i++){
            array[i] = i * 5;
            System.out.println(array[i]);
        }
        printArray(array);
    }

    static void printArray(int[] printarray){
        for(int i = 0; i < printarray.length ; i++){
            System.out.println("Element " + i + " Values of " + printarray[i]);
        }
    }
}
