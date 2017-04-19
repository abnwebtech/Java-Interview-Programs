package com.company;
import java.io.*;
import java.util.*;
/**
 * Created by Ajinkya on 4/16/2017.
 */
public class Arr2 {

    public static void main(String args[])throws IOException{

        int arr1[] = {1, 0, -4, 7, 6, 4};
        int arr2[] = {0 ,2, 4, -3, 2, 1};
        int x = 8;
        int n = (arr1).length;
        int m = arr2.length;
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i = 0; i<n ; i++)
            h.add(arr1[i]);

        for(int i = 0 ; i < m ; i++){

            if(h.contains(x-arr2[i])){

                System.out.print(arr2[i]+" "+ (x-arr2[i]+" "));

            }
        }

    }

}
