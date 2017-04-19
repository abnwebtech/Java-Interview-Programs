package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Main object = new Main();
        object.prime();
    }

    private void prime() {

        Scanner sc = new Scanner(System.in);
        int upperLimit;

        System.out.println("Enter Upper Limit");
        upperLimit= sc.nextInt();
        sc.close();

        System.out.println("Prime numbers between 0 and "+ upperLimit +" are :");

        for(int i = 2;i<upperLimit;i++){
            int count=0;

            for(int num=i;num>1;num--){
                if(i%num==0) {
                    count++;
                }
            }
            if (count==1){
                System.out.println(i);
            }
        }

    }
}