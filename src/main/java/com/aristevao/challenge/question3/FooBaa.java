package com.aristevao.challenge.question3;

public class FooBaa {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String output = (i % 3 == 0 ? "Foo" : "") + (i % 5 == 0 ? "Baa" : "");
            System.out.println(output.isEmpty() ? i : output);
        }
    }
}