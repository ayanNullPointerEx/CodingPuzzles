package com.company;

public class PrintAllCombination {

    public static void main(String[] args) {
        int number = 10;
        int[] arr = new int[number];
        System.out.println("Print all combinations that adds up to - " + number);
        printCombinations(arr,number,0);
    }
    static void printCombinations(int[] output,int sum,int index) {
        if (sum == 0) {
            for (int i = 0; i < index-1; i++) {
                System.out.print(output[i]+"+");
            }
            System.out.println(output[index-1]);
        }
        int limit = index>0 ? (Math.min(output[index - 1], sum)) :sum;
        for (int i = 1; i <= limit ; i++) {
            output[index] = i;
            printCombinations(output,sum-i,index+1);
        }
    }

}

/*
Print all combinations that adds up to - 10
1+1+1+1+1+1+1+1+1+1
2+1+1+1+1+1+1+1+1
2+2+1+1+1+1+1+1
2+2+2+1+1+1+1
2+2+2+2+1+1
2+2+2+2+2
3+1+1+1+1+1+1+1
3+2+1+1+1+1+1
3+2+2+1+1+1
3+2+2+2+1
3+3+1+1+1+1
3+3+2+1+1
3+3+2+2
3+3+3+1
4+1+1+1+1+1+1
4+2+1+1+1+1
4+2+2+1+1
4+2+2+2
4+3+1+1+1
4+3+2+1
4+3+3
4+4+1+1
4+4+2
5+1+1+1+1+1
5+2+1+1+1
5+2+2+1
5+3+1+1
5+3+2
5+4+1
5+5
6+1+1+1+1
6+2+1+1
6+2+2
6+3+1
6+4
7+1+1+1
7+2+1
7+3
8+1+1
8+2
9+1
10
 */