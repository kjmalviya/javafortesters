package com.javafortesters.chap004.testwithotherclasses.exercise;

import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kunal on 5/27/16.
 */
public class NewExercise {

    @Test
    public void hexString(){
        Integer eleven = 11;
        assertEquals("11 becomes b","b", eleven.toHexString(11));
   }
}
