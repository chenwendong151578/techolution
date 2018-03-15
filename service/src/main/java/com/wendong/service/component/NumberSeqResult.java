package com.wendong.service.component;

import java.io.Serializable;


public class NumberSeqResult implements Serializable{
    public int[] getResult() {
        return result;
    }

    public void setResult(int[] result) {
        this.result = result;
    }

    private int[] result;

}
