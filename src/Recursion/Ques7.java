package Recursion;

import java.util.Scanner;

/**
 * Write a program to print the sum of first N numbers using functional Recursion
 */
public class Ques7 {
    public static int  sumOfFirstNNumbersUsingFunctionalRecursion(int n){
        if( n == 0)
            return 0;
        return n+sumOfFirstNNumbersUsingFunctionalRecursion(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to print from 1 to that number !");
        int n = scanner.nextInt();
        System.out.println(sumOfFirstNNumbersUsingFunctionalRecursion(n));
    }
}
