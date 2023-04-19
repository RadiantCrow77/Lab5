package Week05OOPLab;



// 1. Card Class:
//		Create a class called Card to represent a standard playing card. 
public class Card {
	//		Fields:   The Card class should have the following fields:
	// 			a. name field
	String name;
	//			b. suit field
	String suit;
	//			c. value field for comparing against other cards.
	int value;
	
	// Constructor
	Card(String name, String suit, int value){
		this.name = name; // assign to parameter that is passed in
		this.suit = suit;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	//
	//		Methods:  This class can have any useful method.
	//			a. describe() to display the card information to the Console.
	//			b. Getters & Setters 
	
	public void describe() {
		System.out.println("Name: "+this.name+" Suit: "+this.suit+" Value: "+this.value);
	}
	
}
