package org.example;


public enum Move {
    ROCK(1), PAPER(2), SCISSORS(3);


    private final int score;


    Move(int score) {
        this.score = score;
    }


    public int getScore() {
        return score;
    }
}