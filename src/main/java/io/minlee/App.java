package io.minlee;

import java.util.Scanner;

/**
 * Created by minlee on 6/9/16.
 */
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        String s = scan.nextLine();
        System.out.println(Converter.convertToSpeak(s));


    }

}
