package com.java;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        int arr[] = {9,4,1,8,10};
        int arr2[] = {4,5,6,2,1};
        Arrays.sort(arr);

        System.out.println("Length of the array;" +arr.length);
        System.out.println("Length of 2 array: " +arr2.length);
        System.out.println("sorted array :" + Arrays.toString(arr));

    if (arr.equals(arr2)){
        System.out.println("Array are equal");
    }
    else{
        System.out.println("array are not equal");
    }
    }
}
