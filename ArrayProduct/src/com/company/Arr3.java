package com.company;
import java.util.*;
import java.lang.*;

public class Arr3 {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = 0,
                numElementArrayOne=0,
                numElementArrayTwo=0,
                sumToBeCompared=0,
                i=0,j=0,k=0,sum=0;

        testCases = in.nextInt();
        for(i=0; i<testCases; i++)
        {
            String str = "";
            numElementArrayOne = in.nextInt();
            numElementArrayTwo = in.nextInt();
            sumToBeCompared = in.nextInt();
            int arA[] = new int[numElementArrayOne];
            int arB[] = new int[numElementArrayTwo];

            for(j=0;j<numElementArrayOne;j++)
            {
                arA[j]= in.nextInt();
            }

            for(j=0;j<numElementArrayTwo;j++)
            {
                arB[j]= in.nextInt();
            }

            Arrays.sort(arA);

            for(j=0;j<numElementArrayOne;j++)
            {
                for(k=0;k<numElementArrayTwo;k++)
                {
                    sum = arA[j]+arB[k];
                    if(sum==sumToBeCompared)
                    {
                        str = str + arA[j]+" "+arB[k]+", ";
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
        //code
    }
}