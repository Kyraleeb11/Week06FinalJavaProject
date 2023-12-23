package com.promineotech;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck(); //instantiated a new deck
		deck.shuffle(); //calling the shuffling method the deck
		
//instantiated 2 players using an array to store player names and iterate through them
		String[] playerNames = {"Player 1", "Player 2"};	
		Player player1 = new Player(playerNames[0]);
		Player player2 = new Player(playerNames[1]);
		
//Distributing the cards to the players using the traditional for loop iterating 52 times calling the draw method for each player
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			} 
		}
//Play the game, used a traditional for loop iterating 26 times and calling the flip method for each player and the result of each round is printed
		for(int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			System.out.println(player1.getName() + " flips: " + card1.getName());
			System.out.println(player2.getName() + " flips: " + card2.getName());

//comparng the value of each card and incremented the score accordingly
			if(card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " wins the round!");
			} else if(card2.getValue() > card1.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " wins the round!");
			} else {
				System.out.println("This round is a tie! No points alloted");
			}
		}
		
//Displaying the final score for each player, determining the final winner based on the total score. Prints result.	
		
			System.out.println("Final Score: " + player1.getName() + ": " + player1.getScore() + ", " + player2.getName() + ": " + player2.getScore());
			if(player1.getScore() > player2.getScore()) {
				System.out.println(player1.getName() + " winner!");
			} else if(player2.getScore() > player1.getScore()) {
				System.out.println(player2.getName() + " winner!");
			}else {
				System.out.println("The game is a draw.");
			}
		
	}
}
