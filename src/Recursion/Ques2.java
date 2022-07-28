package Recursion;

import java.util.Scanner;

/**
 * Write a program to print the  numbers from 1 to N linearly using recursion
 */
public class Ques2 {
    public static void linearlyNumberPrint(int i , int n){
        if(i>n)
            return;
        System.out.println(i);
        linearlyNumberPrint(i+1,n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers till where you have to print the numbers !");
        int n = scanner.nextInt();
        linearlyNumberPrint(1,n);
    }
}
