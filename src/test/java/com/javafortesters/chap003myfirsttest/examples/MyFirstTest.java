/**
 * Created by kmalviya on 5/18/2016.
 */

package com.javafortesters.chap003myfirsttest.examples;


import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2=4",4,answer);

    }

    @Test
    public void cansubtract(){
        int answer = 5-2;
        assertEquals("5-2=3",3,answer);
    }

    @Test
    public void candivide(){
        int answer = 4/2;
        assertEquals("4/2=2",2,answer);
    }

    @Test
    public void canmultiply(){
        int answer = 2*2;
        assertEquals("2*2=4",4,answer);
    }
}


