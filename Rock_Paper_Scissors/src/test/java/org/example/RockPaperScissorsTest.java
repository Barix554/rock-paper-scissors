package org.example;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class RockPaperScissorsTest {


    @Test
    void testParseOpponent() {
        assertEquals(Move.ROCK, RockPaperScissors.parseOpponent('A'));
        assertEquals(Move.PAPER, RockPaperScissors.parseOpponent('B'));
        assertEquals(Move.SCISSORS, RockPaperScissors.parseOpponent('C'));
    }


    @Test
    void testParsePlayer() {
        assertEquals(Move.ROCK, RockPaperScissors.parsePlayer('X'));
        assertEquals(Move.PAPER, RockPaperScissors.parsePlayer('Y'));
        assertEquals(Move.SCISSORS, RockPaperScissors.parsePlayer('Z'));
    }


    @Test
    void testOutcomeScore() {
        assertEquals(6, RockPaperScissors.outcomeScore(Move.ROCK, Move.PAPER)); // win
        assertEquals(3, RockPaperScissors.outcomeScore(Move.ROCK, Move.ROCK)); // draw
        assertEquals(0, RockPaperScissors.outcomeScore(Move.PAPER, Move.ROCK)); // lose
    }


    @Test
    void testRoundScore() {
        assertEquals(8, RockPaperScissors.roundScore(Move.ROCK, Move.PAPER));
    }


    @Test
    void testTotalScoreExample() {
        List<String> input = List.of("A Y", "B X", "C Z");
        assertEquals(15, RockPaperScissors.totalScore(input));
    }
}