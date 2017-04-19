package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class SumOfElements {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int l1=0, l2=0, x=0;
        int [] a;
        int [] b;
        for (int k=0;k<t;k++) {

            l1 = sc.nextInt();

            l2 = sc.nextInt();

            x = sc.nextInt();

            a = new int[l1];
            b = new int[l2];

            for (int i = 0; i < l1; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < l1; i++) {
                b[i] = sc.nextInt();
            }


                HashSet<Integer> h = new HashSet<>();

                for (int i =0; i<l1;i++) {
                    a = new int[l1];
                    h.add(a[i]);
                }
                for (int i =0;i<l2;i++){
                    b= new int[l2];
                    if(h.contains(x-b[i])){
                        System.out.print(b[i]+" "+ (x-b[i]+" "));
                    }
                }
        }
    }
}