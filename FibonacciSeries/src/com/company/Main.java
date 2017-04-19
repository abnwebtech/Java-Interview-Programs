package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
        System.out.println("Enter UpperLimit:\t");
        int lim=sc.nextInt();
        int f1,f2=0,f3=1;
        System.out.println("Fibonacci Series\n");
        System.out.print(f2+" "+f3+" ");
        for(int i=0; i<lim; i++){
            f1=f2;
            f2=f3;
            f3=f1 + f2;
            System.out.print(f3+" ");
        }
    }
}
