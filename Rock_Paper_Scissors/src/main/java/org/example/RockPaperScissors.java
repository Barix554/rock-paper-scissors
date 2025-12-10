package org.example;


import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;


public class RockPaperScissors {


    public static Move parseOpponent(char c) {
        return switch (c) {
            case 'A' -> Move.ROCK;
            case 'B' -> Move.PAPER;
            case 'C' -> Move.SCISSORS;
            default -> throw new IllegalArgumentException("Invalid opponent move: " + c);
        };
    }


    public static Move parsePlayer(char c) {
        return switch (c) {
            case 'X' -> Move.ROCK;
            case 'Y' -> Move.PAPER;
            case 'Z' -> Move.SCISSORS;
            default -> throw new IllegalArgumentException("Invalid player move: " + c);
        };
    }


    public static int outcomeScore(Move opponent, Move player) {
        if (opponent == player) return 3;
        if ((player == Move.ROCK && opponent == Move.SCISSORS) ||
                (player == Move.PAPER && opponent == Move.ROCK) ||
                (player == Move.SCISSORS && opponent == Move.PAPER)) {
            return 6;
        }
        return 0;
    }


    public static int roundScore(Move opponent, Move player) {
        return player.getScore() + outcomeScore(opponent, player);
    }


    public static int totalScore(List<String> lines) {
        int total = 0;
        for (String line : lines) {
            if (line.isBlank()) continue;
            String[] parts = line.split(" ");
            Move opponent = parseOpponent(parts[0].charAt(0));
            Move player = parsePlayer(parts[1].charAt(0));
            total += roundScore(opponent, player);
        }
        return total;
    }


    public static int calculateFromFile(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(filename));
        return totalScore(lines);
    }
}