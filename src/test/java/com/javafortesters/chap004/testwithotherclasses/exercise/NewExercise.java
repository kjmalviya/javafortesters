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

        Integer ten = new Integer(10);
        assertEquals("10 becomes a", "a", ten.toHexString(10));

        Integer three = 3;
        assertEquals("3 becomes 3", "3", three.toHexString(3));

        Integer twentyone = 21;
        assertEquals("21 becomes 15", "15", twentyone.toHexString(21));
   }
}
