
public class Example5 {

	public static void main(String[] args) {
		String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		//example how to combine rank and suit in a card
		String card1 = rank[0] + " of " + suit[0];
		System.out.println(card1);
		
		//OK, now we know how to make cards from rank and suit
		
		//Task 1: create the full deck of cards
		String[] deck = new String[rank.length * suit.length];
		// using loops fill in deck
		//work here ...
		//once you're done uncomment below to see the content of that deck
//		for(String card : deck)
//			System.out.println(card);
		
		//Task 2: draw a hand of five papers from deck, or using rank and suit
		String[] hand = new String[5];
		//work here ...
		//once you're done uncomment below to see the content of that hand
//		for(String card : hand)
//			System.out.println(card);
		
		//Task 3: shuffle the deck of card
		//work here ....
		//once you're done uncomment below to see the content of that deck
//		for(String card : deck)
//			System.out.println(card);
		
		//Task 4: reverse the hand
		//once you're done uncomment below to see the content of that hand
//		for(String card : hand)
//			System.out.println(card);
		
		//Task 5: play poker in the weekend ....  just kidding
		

	}

}
