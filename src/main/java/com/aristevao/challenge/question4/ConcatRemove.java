package com.aristevao.challenge.question4;

import java.util.Scanner;

public class ConcatRemove {

    public static String concatRemove(String s, String t, int k) {
        int commonLength = 0;

        while (commonLength < s.length() && commonLength < t.length() && s.charAt(commonLength) == t.charAt(commonLength)) {
            commonLength++;
        }

        int removalsNeeded = s.length() - commonLength;
        int additionsNeeded = t.length() - commonLength;
        int totalOperations = removalsNeeded + additionsNeeded;

        if (k == totalOperations || (k > totalOperations && (k - totalOperations) % 2 == 0) || k >= s.length() + t.length()) {
            return "yes";
        }

        return "no";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int k = scanner.nextInt();

        System.out.println(concatRemove(s, t, k));

        scanner.close();
    }
}
