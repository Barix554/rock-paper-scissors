# Advent of Code 2022 - Day 2: Rock Paper Scissors

This project is a solution for the Advent of Code 2022, Day 2 challenge.

## Description

The Elves are playing a Rock Paper Scissors tournament. The first column in the input file indicates the opponent's move (`A` = Rock, `B` = Paper, `C` = Scissors), and the second column indicates the player's move (`X` = Rock, `Y` = Paper, `Z` = Scissors). The score for each round is the sum of:

* Shape score: Rock = 1, Paper = 2, Scissors = 3
* Outcome score: Win = 6, Draw = 3, Lose = 0

The total score is the sum of all round scores.

## Project Structure

```
Rock_Paper_Scissors/
├── pom.xml
├── input.txt
└── src/
    ├── main/java/org/example/
    │   ├── Main.java
    │   ├── Move.java
    │   └── RockPaperScissors.java
    └── test/java/org/example/
        └── RockPaperScissorsTest.java
```

## How to Run

1. Ensure Java 17 and Maven are installed.
2. Place your input file as `Rock_Paper_Scissors/input.txt`.
3. Compile and run using Maven:

```
mvn compile
mvn exec:java -Dexec.mainClass="org.example.Main"
```

4. Run tests:

```
mvn test
```

## Author

Bartosz Kowalski
