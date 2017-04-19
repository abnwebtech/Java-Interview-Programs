package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Press\n"+"1 for In-build Method"+"\n2 for Stack"+"\n3 for Custom Method");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println("Enter Integer");
        int num = sc.nextInt();
        switch (c){

            case 1:
                System.out.println("Binary Representation:");
                System.out.println(Integer.toBinaryString(num));
                break;

            case 2:
                Stack<Integer> st = new Stack<>();
                while (num!=0){
                    int d = num%2;
                    st.push(d);
                    num /=2;
                }
                System.out.println("Binary Representation:");
                while (!(st.isEmpty())){
                    System.out.print(st.pop());
                }
                break;

            case 3:
                int [] binary = new int[40];
                int index=0;
                while (num>0){
                    binary[index++]=num%2;
                    num /=2;
                }
                System.out.println("Binary Representation:");
                for (int i=index-1;i>=0;i--){
                    System.out.print(binary[i]);
                }
                break;
        }
    }
}
