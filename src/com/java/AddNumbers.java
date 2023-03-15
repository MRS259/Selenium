package com.java;

import java.sql.SQLOutput;

public class AddNumbers {
    public static void main(String[] args) {
       int result = addnumbers(9,5);
       int output = result +5;
        System.out.println("Increment the output:" +output);

    }
    public static int  addnumbers(int num1, int num2){
//        int num1 = 6;
//        int num2 = 7;
        int result = num1+num2;
        System.out.println("add 2 numbers: " +result);
        return  result;

    }

}