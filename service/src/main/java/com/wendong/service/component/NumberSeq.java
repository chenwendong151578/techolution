package com.wendong.service.component;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberSeq {

    public NumberSeqResult numberSeq(int[] input) {
        NumberSeqResult numResult=new NumberSeqResult();
        int[] result=new int[input.length];
        int countOdd=0;
        int countEven=0;
        for(int i=0;i<input.length;i++) {
            if(input[i]%2!=0) {
                result[countOdd]=input[i];
                countOdd++;
            }else if(input[i]%2==0) {
                result[input.length-1-countEven]=input[i];
                countEven++;
            }
        }
        numResult.setResult(result);
        return numResult;
    }


}
