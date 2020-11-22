package com.sundogsoftware.spark;

import java.math.BigInteger;

public class MyJavaCustom {

    public static void main(String args[])throws Exception{

        BigInteger first =BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;
        Long count =2L;
        while(count <= 2000)
        {
            BigInteger third = first.add(second);
            System.out.println("Count: "+count+"\t"+" "+third);
            first = second;
            second = third;
            count++;
           // Thread.sleep(500);
        }

    }
}
