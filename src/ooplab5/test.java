package ooplab5;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    private static final int MAX = 20;
    private static int number[] = new int[MAX];


    public static void main(String[] args) {
        inputData(number, number.length);
        showData(number,number.length);
        sortingData(number);

    }//main

    private static void sortingData(int[] number) {
        System.out.print("Ascending order: ");
        Arrays.sort(number);
        showData(number, number.length);
    }//sorting data

    private static void showData(int[] number, int length) {
        double total = 0;
        for(int i=0;i<length;i++) {
            System.out.print(number[i] + " ");


        }
        System.out.println();
    }


    private static void inputData(int[] number, int length) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<length;i++) {
            System.out.print("Enter an integer ["+i+"]: ");
            number[i] = scanner.nextInt();
        }
    }//user in put data
}//class


