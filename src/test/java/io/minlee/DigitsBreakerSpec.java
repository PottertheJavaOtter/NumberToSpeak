package io.minlee;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by minlee on 6/9/16.
 */
public class DigitsBreakerSpec {

    @Test
    public void testMillion(){
        DigitsBreaker digitsBreaker = new DigitsBreaker("100100100");
        String[] expectedArray = {"100","100","100"};
        String[] actualArray = digitsBreaker.getStringArray();
        assertArrayEquals(expectedArray,actualArray);
    }

    @Test
    public void testThousand(){
        DigitsBreaker digitsBreaker = new DigitsBreaker("1000");
        String[] expectedArray = {"1","000"};
        String[] actualArray = digitsBreaker.getStringArray();
        assertArrayEquals(expectedArray,actualArray);
    }

    @Test
    public void testHundred(){
        DigitsBreaker digitsBreaker = new DigitsBreaker("100");
        String[] expectedArray = {"100"};
        String[] actualArray = digitsBreaker.getStringArray();
        assertArrayEquals(expectedArray,actualArray);
    }
}
