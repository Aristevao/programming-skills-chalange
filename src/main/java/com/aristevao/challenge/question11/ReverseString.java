package com.aristevao.challenge.question11;

import java.util.Scanner;

public class ReverseString {

    private static String reverseString(String str) {
        String reversedString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }

        return reversedString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();


        System.out.println("Reversed string: " + reverseString(inputString));

        scanner.close();
    }
}
