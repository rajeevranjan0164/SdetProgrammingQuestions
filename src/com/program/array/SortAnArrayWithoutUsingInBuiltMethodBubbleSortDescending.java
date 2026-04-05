package com.program.array;

public class SortAnArrayWithoutUsingInBuiltMethodBubbleSortDescending {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 5, 6};

        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i]>arr[j]) {
                    int tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
