package com.wendong.service.component;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Random;

import static org.junit.Assert.*;

public class NumberSeqTest {
    private NumberSeq numberSeq;
    @Before
    public void setUp() throws Exception {
        numberSeq=new NumberSeq();
    }

    @Test
    public void numberSeq() {
        //generate radom six number between 1-100
        int[] input=IntStream.generate(()->{
            Random r = new Random();
            return  r.nextInt(100-1) + 1;
        }).limit(6).toArray();

        int[] result=numberSeq.numberSeq(input).getResult();
        boolean hasEven=false;
        for(int res:result){
            if(res%2==0) hasEven=true;
            else{
                //if found any odd number after even, test fail
                if (hasEven)fail("Odd number cannot be after even number");
            }
        }

    }
}