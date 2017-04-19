package com.company;
import java.util.Arrays;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows and columns");
        int rows=sc.nextInt();
        int cols = sc.nextInt();
        int first[][]= new int[rows][cols];
        int second[][]= new int[rows][cols];
        int product[][]= new int[rows][cols];

        System.out.println("Enter Elements of first matrix:\t");
        for (int i=0;i<rows;i++){
            for (int j =0;j<cols;j++){
                first[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Elements of second matrix:\t");
        for (int i=0;i<rows;i++){
            for (int j =0;j<cols;j++){
                second[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<rows;i++){
            for (int j =0;j<cols;j++){
                product[i][j]=first[i][j] * second[i][j];
            }
        }
        System.out.println("Product of Matrices:\t");
        System.out.println(Arrays.deepToString(product));
    }
}
