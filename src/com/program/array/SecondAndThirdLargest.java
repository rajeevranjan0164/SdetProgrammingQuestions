package com.program.array;

/**
 * PROGRAM: FIND SECOND AND THIRD LARGEST NUMBERS (THE THREE-PASS WAY)
 * 
 * --- DRY RUN (Example: {10, 30, 20}) ---
 * 
 * Pass 1 (Find First Largest):
 * - Is 10 > MIN? Yes, first = 10
 * - Is 30 > 10? Yes, first = 30
 * - Is 20 > 30? No.
 * >> Result: first = 30
 * 
 * Pass 2 (Find Second Largest - Must be < 30):
 * - Is 10 < 30 AND > MIN? Yes, second = 10
 * - Is 30 < 30? No.
 * - Is 20 < 30 AND > 10? Yes, second = 20
 * >> Result: second = 20
 * 
 * Pass 3 (Find Third Largest - Must be < 20):
 * - Is 10 < 20 AND > MIN? Yes, third = 10
 * - Is 30 < 20? No.
 * - Is 20 < 20? No.
 * >> Result: third = 10
 */
public class SecondAndThirdLargest {

    public static void main(String[] args) {
        
        // 1. Initialize our array of numbers
        int[] numbers = {12, 45, 67, 89, 23, 70};

        // --- STEP 1: FIND THE BIGGEST NUMBER ---
        // 2. Start 'first' at the smallest possible value
        int first = Integer.MIN_VALUE; 
        
        // 3. Loop through the array to find the absolute maximum
        for (int i = 0; i < numbers.length; i++) {
            // 4. If current number is bigger than our current 'first'
            if (numbers[i] > first) {
                // 5. Update 'first'
                first = numbers[i];
            }
        }

        // --- STEP 2: FIND THE SECOND BIGGEST ---
        // 6. Start 'second' at the smallest possible value
        int second = Integer.MIN_VALUE;
        
        // 7. Loop through the array again
        for (int i = 0; i < numbers.length; i++) {
            // 8. If number is smaller than 'first' AND bigger than current 'second'
            if (numbers[i] < first && numbers[i] > second) {
                // 9. Update 'second'
                second = numbers[i];
            }
        }

        // --- STEP 3: FIND THE THIRD BIGGEST ---
        // 10. Start 'third' at the smallest possible value
        int third = Integer.MIN_VALUE;
        
        // 11. Loop through the array a third time
        for (int i = 0; i < numbers.length; i++) {
            // 12. If number is smaller than 'second' AND bigger than current 'third'
            if (numbers[i] < second && numbers[i] > third) {
                // 13. Update 'third'
                third = numbers[i];
            }
        }

        // 14. Print the three results found
        System.out.println("First Largest: " + first);
        System.out.println("Second Largest: " + second);
        System.out.println("Third Largest: " + third);
        
    } // 15. End of main method
} // 16. End of class
