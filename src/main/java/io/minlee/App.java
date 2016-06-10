package io.minlee;


public class App {

    public static void main(String[] args) {

        String s = InputOutput.takeInput();
        Converter converter = new Converter();
        InputOutput.printToScreen(converter.convertToSpeak(s));
    }

}
