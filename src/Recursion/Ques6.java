package Recursion;

import java.util.Scanner;

/**
 * Write a program to print the sum of first N numbers using parameterised way
 */

public class Ques6 {
    public static void SumOfFirstNNumbers(int i , int sum ){
        if(i<1){
            System.out.println(sum);
            return;
        }
        SumOfFirstNNumbers(i-1,sum+i);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number till which you have to find the sum ");
        int n = scanner.nextInt();
        SumOfFirstNNumbers(n,0);
    }
}
