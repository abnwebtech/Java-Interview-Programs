package com.company;
import java.util.Scanner;

public class NewPrime {
    public static void main(String[] args) {
        // write your code here

        NewPrime object = new NewPrime();
        object.prime1();
    }

    private void prime1(){
    Scanner sc= new Scanner(System.in);

    int flag=0;
        System.out.println("Enter a positive number:\t");
                int n = sc.nextInt();
                sc.close();

                for(int j=2; j<=n/2;j++) {
                    if (n % j == 0) {
                        flag = 1;
                    }
                }
                if(flag==0){
                System.out.println(n + " is a prime number");
                }
                else{
                System.out.println(n+ " is not a prime number");
                }
}
}