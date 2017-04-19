package com.company;

import java.util.Arrays;

/**
 * Created by Ajinkya on 4/15/2017.
 */
public class Arr {
    public static void main(String[] args) {
        int[] a = {2, 7};
        int[] b = {9, 1};
        int[][] c = new int[a.length][2];
        for (int i = 0; i < a.length; i++) {
            c[i][0] = a[i];
            c[i][1] = b[i];
        }
        System.out.println(Arrays.deepToString(c));
    }
}
