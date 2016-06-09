package io.minlee;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by minlee on 6/9/16.
 */
public class AppTests {

    @Test
    public void test113(){
        String test = "113";
        String expectedValue = "OneHundredThirteen";
        String actualValue = Converter.convertToSpeak(test);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void test103(){
        String test = "103";
        String expectedValue = "OneHundredThree";
        String actualValue = Converter.convertToSpeak(test);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void test990(){
        String test = "990";
        String expectedValue = "NineHundredNinety";
        String actualValue = Converter.convertToSpeak(test);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void test716(){
        String test = "716";
        String expectedValue = "SevenHundredSixteen";
        String actualValue = Converter.convertToSpeak(test);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void test20(){
        String test = "20";
        String expectedValue = "Twenty";
        String actualValue = Converter.convertToSpeak(test);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void test1000(){
        String test = "1000";
        String expectedValue = "OneThousand";
        String actualValue = Converter.convertToSpeak(test);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void test99999(){
        String test = "999999";
        String expectedValue = "NineHundredNinetyNineThousandNineHundredNinetyNine";
        String actualValue = Converter.convertToSpeak(test);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void test99000(){
        String test = "99000";
        String expectedValue = "NinetyNineThousand";
        String actualValue = Converter.convertToSpeak(test);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void test90010(){
        String test = "99010";
        String expectedValue = "NinetyNineThousandTen";
        String actualValue = Converter.convertToSpeak(test);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void test999999999(){
        String test = "999999999";
        String expectedValue = "NineHundredNinetyNineMillionNineHundredNinetyNineThousandNineHundredNinetyNine";
        String actualValue = Converter.convertToSpeak(test);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void test101000010(){
        String test = "101000010";
        String expectedValue = "OneHundredOneMillionTen";
        String actualValue = Converter.convertToSpeak(test);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void test113013013(){
        String test = "113013013";
        String expectedValue = "OneHundredThirteenMillionThirteenThousandThirteen";
        String actualValue = Converter.convertToSpeak(test);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void test204239312(){
        String test = "204239312";
        String expectedValue = "TwoHundredFourMillionTwoHundredThirtyNineThousandThreeHundredTwelve";
        String actualValue = Converter.convertToSpeak(test);
        assertEquals(expectedValue,actualValue);
    }
}
