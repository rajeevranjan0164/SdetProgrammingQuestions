package com.java.pra;

import java.util.Scanner;

/*
We define a method checkPrime that takes an integer n as input and returns a boolean indicating whether n is prime or not.
We first handle the cases where n is less than or equal to 1, as 1 and numbers less than 1 are not prime.
We then iterate from 2 up to n / 2 using a loop.
In each iteration, we check if n is divisible by the current number i. If it is divisible, we return false, indicating that n is not prime.
If the loop completes without finding any divisor other than 1 and n itself, we return true, indicating that n is prime.We define a method checkPrime that takes an integer n as input and returns a boolean indicating whether n is prime or not.
We first handle the cases where n is less than or equal to 1, as 1 and numbers less than 1 are not prime.
We then iterate from 2 up to n / 2 using a loop.
In each iteration, we check if n is divisible by the current number i. If it is divisible, we return false, indicating that n is not prime.
If the loop completes without finding any divisor other than 1 and n itself, we return true, indicating that n is prime.
 */
public class SimplePrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close(); // Close the scanner
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Not prime
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; // Not prime
            }
        }
        return true; // Is prime
    }
}
