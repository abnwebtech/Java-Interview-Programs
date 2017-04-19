package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length:\t");
        int len = sc.nextInt();
        int arr[] = new int[len];

        System.out.println("Enter "+len+" array elements:\t");

        for(int i=0; i<len; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Element without Loops:\t");

        System.out.println(Arrays.toString(arr));
    }
}
