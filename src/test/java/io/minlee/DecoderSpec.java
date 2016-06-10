package io.minlee;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by minlee on 6/9/16.
 */
public class DecoderSpec {

    Decoder decoder;

    @Before
    public void initialize(){
        decoder = new Decoder();
    }

    @Test
    public void decodeTensPlacesTest(){
        decoder.decodeTensPlaces("99");
        String expectedValue = "NinetyNine";
        String actualValue = decoder.toString();
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void decodeHundredsPlacesTest(){
        decoder.decodeHundredsPlaces("9");
        String expectedValue = "NineHundred";
        String actualValue = decoder.toString();
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void decodeDollarsTest(){
        decoder.decodeTensPlaces("1");
        decoder.decodeDollars();
        String expectedValue = "OneDollar";
        String actualValue = decoder.toString();
        assertEquals(expectedValue,actualValue);
        decoder.decodeTensPlaces("2");
        decoder.decodeDollars();
        expectedValue = "OneDollarTwoDollars";
        actualValue = decoder.toString();
        assertEquals(expectedValue,actualValue);

    }
    @Test
    public void decodeThousandTest(){
        decoder.decodeThousand();
        String expectedValue = "Thousand";
        String actualValue = decoder.toString();
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void decodeMillionTest(){
        decoder.decodeMillion();
        String expectedValue = "Million";
        String actualValue = decoder.toString();
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void decodeZeroTest(){
        decoder.decodeZero();
        String expectedValue = "Zero";
        String actualValue = decoder.toString();
        assertEquals(expectedValue,actualValue);
    }
}
