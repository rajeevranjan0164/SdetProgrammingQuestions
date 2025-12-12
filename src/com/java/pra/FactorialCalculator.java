package com.java.pra;


/*
    This program calculates the factorial of a given number n.

    Steps:
    1. Input: The user inputs the number n for which the factorial is to be calculated.
    2. Negative Number Check: If the input n is negative, the program will print a message stating that factorials are not defined for negative numbers and will stop execution.
    3. Initialization: A variable `factorial` is initialized to 1. This is because the factorial of 0 is 1, and multiplying by 1 does not change the value.
    4. Iteration: A loop runs from 1 to n, and in each iteration, the current value of `factorial` is multiplied by the loop index i. This calculates the factorial.
    5. Output: After the loop finishes, the program prints the calculated factorial.

    Example:
    - Input: n = 5
    - Iteration:
        i = 1: factorial = 1 * 1 = 1
        i = 2: factorial = 1 * 2 = 2
        i = 3: factorial = 2 * 3 = 6
        i = 4: factorial = 6 * 4 = 24
        i = 5: factorial = 24 * 5 = 120
    - Output: "Factorial of 5 is: 120"
*/

public class FactorialCalculator {

    public static void main(String[] args) {

        int n = 5;

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
