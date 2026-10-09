# Java Card Deck and Blackjack Game

A Java coursework project exploring object-oriented programming, playing cards, collections, and a graphical Blackjack interface built with Java Swing.

## Features and Concepts

- Models cards, ranks, and suits with separate classes and enums
- Builds and shuffles a deck of cards
- Organizes cards into hands and models players and the dealer
- Uses Java collections such as `ArrayList`, `HashSet`, and `Map`
- Includes a Swing-based Blackjack game interface
- Includes `Assignment2`, which demonstrates working with card hands and collections

## Project Structure

```text
src/
└── cardDeck/
    ├── Assignment2.java
    ├── Card.java
    ├── Dealer.java
    ├── Deck.java
    ├── Game.java
    ├── Hand.java
    ├── Main.java
    ├── Person.java
    ├── Player.java
    ├── Rank.java
    └── Suit.java
```

## Requirements

- Java Development Kit (JDK)
- A terminal or Java IDE

## Compile

From the project root, run:

```bash
javac -d out src/cardDeck/*.java
```

## Run

Run the card collections assignment:

```bash
java -cp out cardDeck.Assignment2
```

Launch the Blackjack GUI:

```bash
java -cp out cardDeck.Main
```

## Card Image Assets

The Blackjack GUI references images under `img/cards/`, including `CardDown.png`. These assets are not currently included in this repository. The Java source compiles without them, but the GUI may not display card images until the assets are added in the expected folder.

## What I Learned

This project gave me practice with object-oriented design, enums, Java collections, class relationships, and building a graphical interface with Swing.

## Note

This is a learning project based on coursework, not production game software.
