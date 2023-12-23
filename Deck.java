package com.promineotech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards; //List to store the cards
	//Constructor- initializing all the cards list by creating and adding 52 card object to it, using 2 arrays to create all possible combinations
	//of suits and names, creating a standard deck
	public Deck() {
		cards = new ArrayList<>();
		String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};		
	//used a nested for loop to iterate through each card name and suit
		for(String suit : suits) {
			for(int i = 0; i < names.length; i++) {
				cards.add(new Card(i + 2, names[i] + " of " + suit));
			}
		}
	}	
	//Shuffle deck method is shuffling the cards in the deck using the collections.shuffle method
	public void shuffle() {
		Collections.shuffle(cards);
	}	
	//Draw top card method is removing and returning the top card from the deck. It is removing the card at the first index(top of deck) and returning it
	public Card draw() {
		return cards.remove(0);
	}
}
