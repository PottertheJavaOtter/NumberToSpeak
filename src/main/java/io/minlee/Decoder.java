package io.minlee;

/**
 * Created by minlee on 6/9/16.
 */
public class Decoder {

    private final static String[] underTwentyStrings = {"","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve","Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"};
    private final static String[] tensStrings = {"", "","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    StringBuilder result;

    public Decoder(){
        result = new StringBuilder();
    }

    public void decodeMillion(){
        result.append("Million");
    }

    public void decodeThousand(){
        result.append("Thousand");

    }
    public void decodeHundredsPlaces(String input){
        if(!(input.charAt(0) == '0')){
            result.append(underTwentyStrings[Integer.parseInt(input)]);
            result.append("Hundred");
        }
    }

    public void decodeTensPlaces(String input){
        int numValue = Integer.parseInt(input);
        if(numValue > 19){
            result.append(tensStrings[Integer.parseInt(input.substring(0,1))]);
            result.append(underTwentyStrings[Integer.parseInt(input.substring(1,2))]);
        }
        else {
            result.append(underTwentyStrings[Integer.parseInt(input)]);
        }
    }

    public void decodeZero(){
        result.append("Zero");
    }

    public void decodeDollars(){
        if(result.toString().equals("One"))
            result.append("Dollar");
        else
            result.append("Dollars");
    }

    public String toString(){
        return result.toString();
    }

}
