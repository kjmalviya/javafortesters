package com.javafortesters.chap004.testwithotherclasses.examples;

import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kunal on 5/27/16.
 */
public class IntegerExamplesTest {

    @Test
    public void integerExploration(){

        Integer four = new Integer(4);
        assertEquals("int value returns int 4", 4, four.intValue());

        Integer five = new Integer("5");
        assertEquals("int value returns int 5", 5, five.intValue());

        Integer six = 6;
        assertEquals("autoboxing 6", 6, six.intValue());
        

    }
}
