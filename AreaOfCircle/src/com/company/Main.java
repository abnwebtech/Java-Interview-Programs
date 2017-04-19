package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the Radius of a circle:");
        Scanner sc= new Scanner(System.in);
        double radius = sc.nextDouble();
        sc.close();
        double area, perimeter;

        area = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;

        System.out.println("Area of circle is :" +area);
        System.out.println("Perimeter of circle is :"+perimeter);

    }
}
