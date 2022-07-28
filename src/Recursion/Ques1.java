package Recursion;

import java.util.Scanner;

/**
 * write a  program to print the name N times using recursion
 */
public class Ques1 {
    public static void nameString(int i , int n){
        if( i > n )
            return;
        System.out.println("Hello Nikunj !!");
        nameString(i+1,n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of times the name has to be printed !! ");
        int n = scanner.nextInt();
        nameString(0,n);
    }
}
