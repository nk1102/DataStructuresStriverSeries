package Recursion;

import java.util.Scanner;

/**
 * Write a program to print the series in the decreasing order from N to 1
 */
public class Ques3 {
    public static void decreasingOrder( int i , int n){
            if( i < 1)
                return;
        System.out.println(i);
        decreasingOrder(i-1,n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from where you have to print from to 1");
        int n = scanner.nextInt();
        decreasingOrder(n,n);
    }
}
