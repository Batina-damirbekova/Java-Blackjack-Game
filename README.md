# Java Card Deck and Blackjack Game

A Java coursework project exploring object-oriented programming, playing cards, collections, and a graphical Blackjack interface built with Java Swing.

## Features and concepts

- Models cards, ranks, and suits with separate classes and enums
- Builds and shuffles a deck of cards
- Organizes cards into hands and models players and the dealer
- Uses Java collections such as `ArrayList`, `HashSet`, and `Map`
- Includes a Swing-based Blackjack game interface
- Includes `Assignment2`, which demonstrates working with card hands and collections

## Project structure

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

## Compile

From the project root, run:

```bash
javac -d out src/cardDeck/*.java
```

## Run

Run the collection/card assignment:

```bash
java -cp out cardDeck.Assignment2
```

Run the Blackjack GUI:

```bash
java -cp out cardDeck.Main
```

## Card image assets

The Blackjack GUI references image files under `img/cards/` (including `CardDown.png`). Those image assets were not included in the source archive used to prepare this repository. The Java source can compile without them, but the GUI may not display card images until the assets are added in the expected folder.

## Notes

This is a learning project, not production game software. It is based on coursework and is intended to demonstrate Java programming concepts.
