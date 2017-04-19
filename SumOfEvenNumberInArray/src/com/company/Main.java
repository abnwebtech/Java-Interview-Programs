package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:\t");
        int len = sc.nextInt();
        int [] arr = new int[len];
        int sum = 0;
        System.out.println("Enter "+len+" elements");
        for (int i = 0; i<len; i++){
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i<len; i++){
            if(arr[i]%2==0){
                sum +=arr[i];
            }
        }
        System.out.println("Sum of Even Numbers in the given array is equal to "+sum);
    }
}
