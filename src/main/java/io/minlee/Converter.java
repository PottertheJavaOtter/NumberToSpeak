package io.minlee;

/**
 * Created by minlee on 6/9/16.
 */
public class Converter {

    static String[] twentyAndUnderStrings= {"","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve","Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen", "Twenty"};
    static String[] tensStrings = {"", "","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convertToSpeak(String input){
        if(input.length() >= 7)
            return convertMillions(input);
        else if((input.length() <= 6) && (input.length() >= 4))
            return convertThousands(input);
        else if(input.length() == 3)
            return convertHundreds(input);
        else
            return convertTens(input);
    }
    public static String convertMillions(String input) {
        StringBuilder result = new StringBuilder();
        if(input.length() == 9){
            result.append(convertHundreds(input.substring(0,3))+"Million");
            result.append(convertThousands(input.substring(3,9)));
        }
        else if(input.length() == 8){
            result.append(convertTens(input.substring(0,2))+"Million");
            result.append(convertThousands(input.substring(2,8)));

        }
        else {
            result.append(twentyAndUnderStrings[Integer.parseInt(input.substring(0, 1))] + "Million");
            result.append(convertThousands(input.substring(1, 7)));
        }
        return result.toString();
    }
    public static String convertThousands(String input) {
        StringBuilder result = new StringBuilder();
        if(input.length() == 6){
            if(!(convertHundreds(input.substring(0,3)).equals("")))
                result.append(convertHundreds(input.substring(0,3))+"Thousand");
            result.append(convertHundreds(input.substring(3,6)));
        }
        else if(input.length() == 5){
            result.append(convertTens(input.substring(0,2))+"Thousand");
            result.append(convertHundreds(input.substring(2,5)));

        }
        else {
            result.append(twentyAndUnderStrings[Integer.parseInt(input.substring(0, 1))] + "Thousand");
            result.append(convertHundreds(input.substring(1, 4)));
        }
        return result.toString();
    }
    public static String convertHundreds(String input) {
        StringBuilder result = new StringBuilder();
        int hundredDigit =  Integer.parseInt(input.substring(0,1));
        result.append(twentyAndUnderStrings[hundredDigit]);
        if(!(hundredDigit == 0))
            result.append("Hundred");
        result.append(convertTens(input.substring(1,3)));
        return result.toString();
    }


    public static String convertTens(String input){
        StringBuilder result = new StringBuilder();
        int tensDigit =  Integer.parseInt(input.substring(0,1));
        int onesDigit =  Integer.parseInt(input.substring(1,2));
        if(tensDigit > 1){
            result.append(tensStrings[tensDigit]);
            result.append(twentyAndUnderStrings[onesDigit]);
        }
        else
            result.append(twentyAndUnderStrings[tensDigit*10+onesDigit]);
        return result.toString();
    }


}
