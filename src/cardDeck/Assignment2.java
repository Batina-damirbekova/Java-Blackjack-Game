package cardDeck;

import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Assignment2 {

	public static void main(String[] args) {
		
		// created a deck and shuffled it
		Deck deck = new Deck(true);
		deck.shuffle();
		
	// created four hands
	Set<Card> hand1 = new HashSet<>();
	Set<Card> hand2 = new HashSet<>();
	Set<Card> hand3 = new HashSet<>();
	Set<Card> hand4 = new HashSet<>();
	
	//created a map
	 Map<String, Set<Card>> game = new HashMap<>();
	
	         // put each player and hand into the Map
	         game.put("Player 1", hand1);
	         game.put("Player 2", hand2);
	         game.put("Player 3", hand3);
	         game.put("Player 4", hand4);
	         
	 // dealt 7 card for every player     
		for (int i = 0; i < 7; i++) {
		    game.get("Player 1").add(deck.takeCard());
		    game.get("Player 2").add(deck.takeCard());
		    game.get("Player 3").add(deck.takeCard());
		    game.get("Player 4").add(deck.takeCard());
		}
	
	Set<Rank> commonRanks = new HashSet<>();
	
	for (Card card : game.get("Player 1")) {
	    commonRanks.add(card.getRank());
	}
	
	Set<Rank> player2Ranks = new HashSet<>();

	for (Card card : game.get("Player 2")) {
		player2Ranks.add(card.getRank());
	}
	commonRanks.retainAll(player2Ranks);
	
	Set<Rank> player3Ranks = new HashSet<>();

	for (Card card : game.get("Player 3")) {
		player3Ranks.add(card.getRank());
	}

	commonRanks.retainAll(player3Ranks);
	Set<Rank> player4Ranks = new HashSet<>();

	for (Card card : game.get("Player 4")) {
		player4Ranks.add(card.getRank());
	}

	commonRanks.retainAll(player4Ranks);
	
	System.out.println("Common ranks: " + commonRanks);

	Set<Suit> commonSuits = new HashSet<>();

	for (Card card : game.get("Player 1")) {
	    commonSuits.add(card.getSuit());
	}
	

	Set<Suit> player2Suits = new HashSet<>();

	for (Card card : game.get("Player 2")) {
	    player2Suits.add(card.getSuit());
	}

	commonSuits.retainAll(player2Suits);

	Set<Suit> player3Suits = new HashSet<>();

	for (Card card : game.get("Player 3")) {
	    player3Suits.add(card.getSuit());
	}

	commonSuits.retainAll(player3Suits);

	Set<Suit> player4Suits = new HashSet<>();

	for (Card card : game.get("Player 4")) {
	    player4Suits.add(card.getSuit());
	}

	commonSuits.retainAll(player4Suits);

	System.out.println("Common suits: " + commonSuits);
	
	for (Card card : deck.getCards()) {
		if (!game.get("Player 1").contains(card) &&
			    !game.get("Player 2").contains(card) &&
			    !game.get("Player 3").contains(card) &&
			    !game.get("Player 4").contains(card)) {
			
	        System.out.println("A card not in any hand: " + card);
	        break;
	    }
	}
	Card searchCard = new Card(Suit.HEART, Rank.ACE);

	if (game.get("Player 1").contains(searchCard)) {
	    System.out.println("Player 1 has " + searchCard);
	} else {
	    System.out.println("Player 1 does not have " + searchCard);
	}
	int total1 = 0;
	for (Card card : game.get("Player 1")) {
	    total1 += card.getValue();
	}

	int total2 = 0;
	for (Card card : game.get("Player 2")) {
	    total2 += card.getValue();
	}

	int total3 = 0;
	for (Card card : game.get("Player 3")) {
	    total3 += card.getValue();
	}

	int total4 = 0;
	for (Card card : game.get("Player 4")) {
	    total4 += card.getValue();
	}
	System.out.println("Player 1 total: " + total1);
	System.out.println("Player 2 total: " + total2);
	System.out.println("Player 3 total: " + total3);
	System.out.println("Player 4 total: " + total4);
	
	int lowest = total1;
	String lowestPlayer = "Player 1";

	if (total2 < lowest) {
	    lowest = total2;
	    lowestPlayer = "Player 2";
	}

	if (total3 < lowest) {
	    lowest = total3;
	    lowestPlayer = "Player 3";
	}

	if (total4 < lowest) {
	    lowest = total4;
	    lowestPlayer = "Player 4";
	}
	int highest = total1;
	String highestPlayer = "Player 1";

	if (total2 > highest) {
	    highest = total2;
	    highestPlayer = "Player 2";
	}

	if (total3 > highest) {
	    highest = total3;
	    highestPlayer = "Player 3";
	}

	if (total4 > highest) {
	    highest = total4;
	    highestPlayer = "Player 4";
	}
	System.out.println("Lowest hand: " + lowestPlayer + " with " + lowest);
	System.out.println("Highest hand: " + highestPlayer + " with " + highest);
	
	    System.out.println("Player 1: " + hand1);
	    System.out.println("Player 2: " + hand2);
	    System.out.println("Player 3: " + hand3);
	    System.out.println("Player 4: " + hand4);
	}
}
