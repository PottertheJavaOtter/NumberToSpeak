package io.minlee;
import java.util.Scanner;

/**
 * Created by minlee on 6/10/16.
 */
public class InputOutput {

    public static void printToScreen(String output){
        System.out.println(output);
    }

    public static String takeInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        return scan.nextLine();
    }
}
