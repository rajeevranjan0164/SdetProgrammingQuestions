package com.java.pra;

/*
    This program generates and prints the Fibonacci series up to a given number n.

    Steps:
    1. Input: The user provides the number n, which determines how many Fibonacci numbers to print.
    2. Initialization: The first two numbers of the Fibonacci series are initialized as `first = 0` and `second = 1`.
    3. Printing the First Two Numbers: These two numbers are printed immediately outside the loop.
    4. Iteration: A loop runs from 2 to n (exclusive) to calculate the next Fibonacci number in the series.
        - In each iteration, the next Fibonacci number is calculated by adding `first` and `second`, and the result is printed.
        - The values of `first` and `second` are updated for the next iteration.
    5. Output: The program prints the Fibonacci series up to the nth number.

    Example:
    - Input: n = 10
    - Output: "Fibonacci series up to 10: 0 1 1 2 3 5 8 13 21 34"
*/
public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 10;
        int first = 0;
        int sec = 1;

        System.out.print(" "+first +" "+sec);

        for (int i =2; i<n; i++) {
            int next = first + sec;
            System.out.print(" " + next); // Print Fibonacci number // 0 1 1 2 3 5 8 13 21 34
            first = sec;
            sec = next;
            
        }
    }
}
