package io.minlee;

/**
 * Created by minlee on 6/9/16.
 */
public class Converter {

    private Decoder decoder;
    private String[] splitIntoThreesArray;

    public Converter(){
        decoder = new Decoder();
    }

    public String convertToSpeak(String input){
        DigitsBreaker digitsBreaker = new DigitsBreaker(input);
        splitIntoThreesArray = digitsBreaker.getStringArray();
        if(input.equals("0"))
            decoder.decodeZero();
        else {
           solveValueNotEqualToZero();
        }
        decoder.decodeDollars();
        return decoder.toString();
    }

    private void solveValueNotEqualToZero(){
        if(splitIntoThreesArray.length == 3){
            solveThreeSetsOfDigits();
        }
        else if(splitIntoThreesArray.length == 2){
            solveTwoSetsOfDigits();;
        }
        else
            solveThreeDigits(splitIntoThreesArray[0]);
    }

    private void solveTwoSetsOfDigits(){
        solveThousands(splitIntoThreesArray[0]);
        solveThreeDigits(splitIntoThreesArray[1]);
    }

    private void solveThreeSetsOfDigits(){
        solveMillions(splitIntoThreesArray[0]);
        solveThousands(splitIntoThreesArray[1]);
        solveThreeDigits(splitIntoThreesArray[2]);
    }

    private void solveMillions(String input){
        solveThreeDigits(input);
        decoder.decodeMillion();
    }

    private void solveThousands(String input){
        if(!input.equals("000")){
            solveThreeDigits(input);
            decoder.decodeThousand();
        }
    }

    private void solveThreeDigits(String input){
        if(input.length() == 3){
            decoder.decodeHundredsPlaces(input.substring(0,1));
            decoder.decodeTensPlaces(input.substring(1,3));
        }
        else
            decoder.decodeTensPlaces(input);
    }

}
