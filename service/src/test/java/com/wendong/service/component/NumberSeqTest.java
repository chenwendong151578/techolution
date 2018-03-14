package com.wendong.service.component;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberSeqTest {
    private NumberSeq numberSeq;
    @Before
    public void setUp() throws Exception {
        numberSeq=new NumberSeq();
    }

    @Test
    public void numberSeq() {
        int[] input= {2,1,1,17,42,73};
        NumberSeqResult result=numberSeq.numberSeq(input);
        assertTrue(result.contains(new int[]{1,1,17,73,2,42}));
        assertTrue(result.contains(new int[]{1,17,1,73,42,2}));
        assertTrue(result.contains(new int[]{1,17,73,1,2,42}));
        assertFalse(result.contains(new int[]{1,2,17,73,1,42}));
    }
}