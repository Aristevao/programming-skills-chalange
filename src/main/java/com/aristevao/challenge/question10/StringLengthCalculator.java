package com.aristevao.challenge.question10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLengthCalculator {

    public static int calculateStringLength(String inputString) {
        Matcher m = Pattern.compile("$").matcher(inputString);
        m.find();
        return m.end();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("The length of the string is: " + calculateStringLength(inputString));

        scanner.close();
    }
}
