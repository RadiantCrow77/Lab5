package Week05OOPLab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Week05OOPLab {
	
	// This Lab will give you a basic look at creating an Object Oriented Card Game.  
	//		The idea here is to prepare you for your Week 6 Unit Final Project.
	//		There are many ways to implement this Lab, please use the tools that you know,
	//		and go from there.
	// These exercises are intended to be coded in order 1 through 5.
	
	public static void main(String[] args) {
	
		// A standard deck of playing cards has 52 cards as specified below 
				//		i. There are 4 suits:  Clubs, Diamonds, Hearts, & Spades
				//				
				//	   ii. Each suit has 13 cards:  Two, Three, Four, Five, Six, Seven, 
				//									 Eight, Nine, Ten, Jack, Queen, King & Ace
				//
				//	  iii. Comparing Cards:  When comparing two cards, Ace is high and Two is low.
				//							 to make this easy, a Two will have a value of 2, a
				//							 Three will have a value of 3, ... and an Ace will have
				//							 a value of 14.

	
				System.out.println("\nQuestion 1: Card Class");
				// Add your code here to instantiate a Card
				
				
				// Call the describe method on the newly instantiated card.
				Card card = new Card("Seven","Hearts",7);
				card.describe();
				
				
				

				System.out.println("\nQuestion 2: Deck Class");
			    // Add your code here to instantiate a Deck	
			    Deck deck = new Deck();
			    
			    // Call the describe method on the newly instantiated deck.
			    deck.describe();
			    
			    
			    
				
				
				// 3. Deck shuffle() Method:
				//		Add a shuffle method within the Deck Class
				System.out.println("\nQuestion 3: Deck shuffle() method");
				// Test your method here
				deck.shuffle();
				
				
				// Call the describe method on the newly shuffled deck.
				deck.describe();
				
				
				
				// 4. Deck draw() Method:
				//		Add a draw method within the Deck Class
				System.out.println("\nQuestion 4: Deck draw() method");
				// Test your method here
				Card drawnCard = deck.draw();
				drawnCard.describe();
				
				
				
				
				
				
				
				// 5. Create Game Board:
				//		Create and test a method that takes an int as a parameter (representing the
				// 			number of players for a game) and returns a Map<String, List<Card>>
				// 			that represents each player (i.e. "Player 1", "Player 2", etc..) 
				//			and their cards.
				//
				// 			The method should create a new instance of Deck, shuffle it,
				// 			and deal the cards out to the "players" in the Map.
				System.out.println("\nQuestion 5: Create Game");
				// Call your method here

				
				int numPlayers = 4;
				Map<String, List<Card>> gameBoard = new HashMap<>();
				gameBoard =createGame(numPlayers);
				
				System.out.println("====================");
				for (int i = 1; i <= numPlayers; i++) {
					String playerName = "Player "+i;
					System.out.println(playerName + "\n--------");
					List<Card> playerList = gameBoard.get(playerName);
					for(Card handCard : playerList) {
						handCard.describe();
					}
					System.out.println("====================");
				}
				
	} // end main

	private static Map<String, List<Card>> createGame(int numPlayers) {
		Map<String, List<Card>> finalGameMap = new HashMap<>();
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println("Deck has " + deck.getCards().size() + " cards!");
		
		// Create the entries in the Map with the Player Name and an empty List
		for (int i = 1; i <= numPlayers; i++) {
			List<Card> playerList = new ArrayList<>();
			String playerName = "Player " + i;
			finalGameMap.put(playerName, playerList);
		}
		// Deal the deck:  draw a card, add the new card to a players hand, and store
		for (int i = 0; i < 52/numPlayers; i++) {
			for (int j = 1; j <= numPlayers; j++) {
				String playerName = "Player " + j;
				List<Card> playerList = finalGameMap.get(playerName);
				playerList.add(deck.draw());
				finalGameMap.replace(playerName, playerList);			
			}
		}
		
		if (52 % numPlayers != 0) {
			System.out.print("With " + numPlayers + " players -- ");
			System.out.println("Cards left in deck: " + 52%numPlayers); 
		} else {
			System.out.println("All cards have been dealt");
		}
		
		return finalGameMap;
	}
}
	
	// Method 5:


