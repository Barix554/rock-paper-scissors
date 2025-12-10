package org.example;


import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        int total = RockPaperScissors.calculateFromFile("Rock_Paper_Scissors/input.txt");
        System.out.println("Total score: " + total);
    }
}