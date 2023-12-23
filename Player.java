package com.promineotech;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//fields of the player class
	private List<Card> hand; //List to store the players hand
	private int score; // players score
	private String name; //players name	

	//Constructor is initializing a player with a name and an empty hand of zero
	public Player(String name) {
		this.name = name;
		hand = new ArrayList<>();
		score = 0; //set the score to zero in the constructor 
	}
//Describing the player and calls the describe method for each card in the hand list
	public void describe() {
		System.out.println(name + "'s hand:");
		for(Card card : hand) {
			card.describe();
		}
	}
//Flip method is removing and returning the top card from the players hand using the hand.remove(0)
	public Card flip() {
		return hand.remove(0);
	}
//Draw method is taking the deck object as a parameter and adds a card drawn from the deck to the players hand using draw method and deck class
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
//Increment Score method is increasing the players score by 1
	public void incrementScore() {
		score++;
	}
//Getters methods are to retrieve the players score and name
	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
}
