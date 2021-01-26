package com.company;

public class PrintAllCombination {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Print all combinations that adds up to - " + number);
        printCombinations(new int[] {number});
    }
    static void printCombinations(int[] input) {
        int maxLimit = input[input.length-1]/2;
        for (int i = 1; i <= maxLimit; i++) {
            int[] arr = new int[input.length+1];
            for (int j = 0; j < input.length-1; j++) {
                arr[j] = input[j];
                System.out.print(arr[j]+"+");
            }
            arr[arr.length-2] = input[input.length-1] - i;
            arr[arr.length-1] = i;
            System.out.println(arr[arr.length-2]+"+"+arr[arr.length-1]);
            printCombinations(arr);
        }
    }

    static int[] copyWithOneExtraSize(int[] arr) {
        int[] out = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            out[i] = arr[i];
        }
        return out;
    }
}
