package com.java;

public class ExceptionExamples {

    public static void main(String[] args) {

        handlerArithmeticExecption(100);
        hadleNullPointerException(null);
    }

    private static void handlerArithmeticExecption(int number) {
        try {
            int a = number / 0;

        }

        catch (ArithmeticException exception){
            exception.printStackTrace();

        }
    }
    private static void hadleNullPointerException(String s){
        try{
            System.out.println(s.length());
        }
        catch (NullPointerException ex){
            ex.printStackTrace();
        }
    }
}
