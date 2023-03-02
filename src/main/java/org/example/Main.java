package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Enter Something: ");
        String userInput = user.nextLine();

        System.out.println("You Entered: \"" + userInput + "\"");
        if (StringUtils.isNumeric(userInput)) {
            System.out.println("\"" + userInput + "\" is a number");
        } else {
            System.out.println("\"" + userInput + "\" is not a number");
        }

        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }
}