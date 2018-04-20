package com.runkevich8.gmail.test;


import junit.framework.Assert;

public class MyTest {

    @org.junit.Test
    public void test(){

        int a = 2 + 2;

        Assert.assertEquals(a,4);

    }

    private int plus(int a , int b){
        return a+b;
    }

}
