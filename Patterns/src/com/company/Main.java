package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("First Pattern ");
        for(int i = 0;i<5;i++){
            for (int j=1; j<=i; j++){
                System.out.print(" "+i+" ");
            }
            System.out.print("\n");
        }

        System.out.println("Second Pattern ");
        for(int i = 5;i>=1;i--){
            for (int j=1; j<=i; j++){
                System.out.print(" "+i+" ");
            }
            System.out.print("\n");
        }

    }
}
