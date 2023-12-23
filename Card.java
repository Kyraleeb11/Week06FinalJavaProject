package com.promineotech;
//defined a public class called Card which represents a playing card
public class Card {

	private int value; //Value of the card(2-14)
	private String name; //Name of card(Example: Ace of Diamonds)

	//Constructor that initializes the value and name of the card when a new card object is created
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}	
	//Getters and Setter methods, allowing other classes to retrieve and modify the values of these variables
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	//Method to print card information:
	public void describe() {
		System.out.println(name);
	}
}
