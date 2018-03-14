package com.wendong.service.component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberSeqResult implements Serializable{
    public ArrayList<ArrayList<Integer>> getResult() {
        return result;
    }

    public void setResult(ArrayList<ArrayList<Integer>> result) {
        this.result = result;
    }

    public boolean contains(int[] compare){
        List<Integer> comList=Arrays.stream(compare).boxed().collect(Collectors.toList());
        return result.contains(comList);
    }
    private ArrayList<ArrayList<Integer>> result;

}
