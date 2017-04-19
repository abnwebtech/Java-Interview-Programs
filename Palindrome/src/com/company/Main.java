package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:\t");
        String s = sc.nextLine();
        String r="";
        for (int i=s.length()-1;i>=0;i--){
            r += s.charAt(i);
        }
        if (s.equalsIgnoreCase(r)){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not Palindrome");
        }
    }
}
