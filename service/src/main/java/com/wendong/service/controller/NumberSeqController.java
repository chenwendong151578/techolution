package com.wendong.service.controller;


import com.wendong.service.component.NumberSeq;
import com.wendong.service.component.NumberSeqResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;

@RestController
@RequestMapping(value="api/v1/")
public class NumberSeqController {

    private NumberSeq numSeq;

    //constructor injection
    public NumberSeqController(NumberSeq numSeq){
        this.numSeq=numSeq;
    }

    @RequestMapping(value = "numseq",method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<NumberSeqResult> getResponse(@RequestParam("input")String input){
        int[] in = Arrays.asList(input.split("-")).stream().mapToInt(Integer::parseInt).toArray();
        return new ResponseEntity<>(numSeq.numberSeq(in), HttpStatus.OK);
    }
}
