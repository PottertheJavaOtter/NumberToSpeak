package io.minlee;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by minlee on 6/9/16.
 */
public class DigitsBreaker {

    String[] strings;

    public DigitsBreaker(String input){
        input = getNumberFormat(input);
        strings = splitNumberByGroupsOfThree(input);

    }


    private String getNumberFormat(String input){
        NumberFormat numberFormat =  NumberFormat.getNumberInstance(Locale.US);
        return numberFormat.format(Integer.parseInt(input));
    }

    private static String[] splitNumberByGroupsOfThree(String input){
        return input.split(",");
    }

    public String[] getStringArray(){
        return strings;
    }
}
