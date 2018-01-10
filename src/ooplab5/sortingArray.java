package ooplab5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class sortingArray {
    private static final int MAX = 10;
    private static int number[] = new int[MAX];
    public static void main(String[] args) {
        inputData(number, number.length);

        showData(number,number.length);
        findMaxData(number);
        findMinData(number);
        System.out.println("Before sorting: ");
        //ascending order
        sortingData(number);
//

    }//main

//    private static void sortingDataDesending(int[] number) {
//        System.out.print("Desending order: ");
//        Arrays.sort(number, Collections.reverseOrder());
//        showData(number, number.length);
//    }//Sorting data Desending



    private static void sortingData(int[] number) {
        System.out.print("Ascending order: ");
        Arrays.sort(number);
        showData(number, number.length);
    }//sorting data

    private static void findMinData(int[] number) {
        int min = number[0];
        for (int i=0;i>number.length;i++) {
            if (min >= number[i])
                min = number[i];

        }
        System.out.println("The min data: "+min);
    }//mindata

    private static void findMaxData(int[] number) {
        int max = number[0];
        for (int i=0;i<number.length;i++) {
            if (max <= number[i])
                max = number[i];

        }
        System.out.println("The maximum data: "+max);
    }//maxdata


    private static void showData(int[] number, int length) {
        double total = 0;
        for(int i=0;i<length;i++) {
            System.out.print(number[i] + " ");
            total += number[i];

        }
        System.out.println();
        System.out.println("Total is in array " + total);
        System.out.println("The average data in array:"+(total/length));

    }


    private static void inputData(int[] number, int length) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<length;i++) {
            System.out.print("Enter an integer ["+i+"]: ");
            number[i] = scanner.nextInt();
        }
    }//user in put data
}//class