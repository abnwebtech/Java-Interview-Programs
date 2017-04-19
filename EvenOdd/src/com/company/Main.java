package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:\t");
        int num = sc.nextInt();

        if((num&1)==0){
            System.out.println(num+" is Even Number");
        }
        else{
            System.out.println(num+" is Odd Number");
        }
    }
}
