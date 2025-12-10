package org.example;


import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        int total = RockPaperScissors.calculateFromFile("input.txt");
        System.out.println("Total score: " + total);
    }
}