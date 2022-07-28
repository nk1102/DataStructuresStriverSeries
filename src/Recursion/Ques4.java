package Recursion;

import java.util.Scanner;

/**
 *  Write a program to linearly Print from 1 to N using backTracking method
 */
public class Ques4 {
    public static void BacktrackingLinearPrint(int i , int n ){
        if( i < 1)
            return;
        BacktrackingLinearPrint(i-1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to print from 1 to that number !!");
        int n = scanner.nextInt();
        BacktrackingLinearPrint(n,n);
    }
}
