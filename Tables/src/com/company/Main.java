package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:\t");
        int num = sc.nextInt();
        System.out.println("Table for "+num +":\t");
        for(int i=1;i<=10;i++){
            int product = num * i;
            System.out.println(num+" x " + i+" = "+product);
        }
    }
}
