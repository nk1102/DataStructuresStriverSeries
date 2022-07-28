package Recursion;

import java.util.Scanner;

/**
 *  Write a Program to print from N to 1 using backtracking method !!
 */
public class Ques5 {
    public static void BacktrackingLinearPrint(int i , int n ){
        if( i < 1)
            return ;
        BacktrackingLinearPrint(i-1,n+1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to print from that number to 1 !!");
        int n = scanner.nextInt();
        BacktrackingLinearPrint(n,1);
    }
}
