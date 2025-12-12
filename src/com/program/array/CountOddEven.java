package com.program.array;

public class CountOddEven {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int oddCount = 0, evenCount = 0;

        for (int i=0; i<array.length;i++) {
            if (array[i] % 2== 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(evenCount);

        System.out.println(oddCount);

    }
}
