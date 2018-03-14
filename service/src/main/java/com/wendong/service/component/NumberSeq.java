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
        ArrayList<ArrayList<Integer>> oddCom=new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> evenCom=new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> resultCom=new ArrayList<ArrayList<Integer>>();

        getCombination(Arrays.copyOfRange(result,0,countOdd),0,oddCom);
        getCombination(Arrays.copyOfRange(result,countOdd,result.length),0,evenCom);

        for(ArrayList<Integer> odd:oddCom){
            for(ArrayList<Integer> even:evenCom){
                ArrayList<Integer> temp=new ArrayList<Integer>();
                temp.addAll(odd);
                temp.addAll(even);
                resultCom.add(temp);
            }
        }
        numResult.setResult(resultCom);
        return numResult;
    }

    private void getCombination(int[] a, int k, ArrayList<ArrayList<Integer>> result){
        if (k == a.length) {
            ArrayList<Integer> temp=new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
                temp.add(a[i]);
            }
            result.add(temp);
        } else {
            for (int i = k; i < a.length; i++) {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;

                getCombination(a, k + 1,result);

                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }

}
