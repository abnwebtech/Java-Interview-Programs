package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();
        int len=0,len1=0,x=0, i=0,j=0,k=0;

        for (k=0;k<t;k++) {

            len = sc.nextInt();

            len1 = sc.nextInt();
            int[] a = new int[len];
            int[] b = new int[len1];


            x = sc.nextInt();

            for (i = 0; i < len; i++) {
                a[i] = sc.nextInt();
            }

            for (j = 0; j < len1; j++) {
                b[j] = sc.nextInt();
            }
            String str = "";
            for (i = 0; i < len; i++) {
                for (j = 0; j < len1; j++) {
                    if (a[i] + b[j] == x) {
                        str = str + a[i] +" "+b[j]+", ";
                    }
                }
            }
            if(str.equals(""))
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(str.substring(0,str.length()-2));
            }
        }
    }
}
