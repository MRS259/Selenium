package com.java;

import java.util.Scanner;

public class DiceGameWhileLoop {
    public static void main(String[] args) {
//        System.out.println("Enter Your Number: ");
        Scanner sc =new Scanner (System.in);
        int number = sc.nextInt();

        while(number<10){
            if(number>6){
                System.out.println("You won the game");
            }
            else{
                System.out.println("you lost the game");
            }
        }
    }
}
