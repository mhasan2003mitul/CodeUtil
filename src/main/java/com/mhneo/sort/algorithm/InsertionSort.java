package com.mhneo.sort.algorithm;

import java.util.Scanner;

/**
 * Created by Md. Mainul Hasan Patwary on 05-Aug-16.
 * email: mhasan_mitul@yahoo.com
 * skype: mhasan_mitul
 */
public class InsertionSort {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.print("Insert number of element: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int val[] = new int[n];
        System.out.print("Insert element: ");
        for(int i=0; i < n; i++){
            val[i] = scan.nextInt();
        }
        System.out.print("Sorted Output: ");
        for(int i = 0; i< insertionSort(val).length;i++){
            System.out.print(val[i]+" ");
        }
    }

    private static int[] insertionSort(int []val){
        for(int i = 0; i<val.length;i++){
            int a = val[i];
            int position = i;
            while(position > 0 && val[position - 1 ] > a){
                val[position] = val[position - 1];
                position --;
            }
            val[position] = a;
        }
        return val;
    }
}
