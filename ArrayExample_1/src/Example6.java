import java.util.Random;

public class Example6 {

	public static void main(String[] args) {
		String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		//example how to combine rank and suit in a card
		String card1 = rank[0] + " of " + suit[0];
//		System.out.println(card1);
		
		//OK, now we know how to make cards from rank and suit
		
		//Task 1: create the full deck of cards
		String[] deck = new String[rank.length * suit.length];
		// using loops fill in deck
		//work here ...
		int count = 0;
		for(int i = 0; i < rank.length; i++)
			for(int j = 0; j < suit.length; j++)
				deck[count++] = rank[i] + " of " + suit[j];
		//once you're done uncomment below to see the content of that deck
//		for(String card : deck)
//			System.out.println(card);
		
		//Task 2: draw a hand of five papers from deck, or using rank and suit
		String[] hand = new String[5];
		Random rand = new Random(60);
		for(int i = 0; i < hand.length; ) {
			int k = rand.nextInt(deck.length);
			String card = deck[k];

			boolean alreadyThere = false;
			for(String c : hand)
				if(card.equals(c))
					alreadyThere=true; //try again, card already there
			if(!alreadyThere) {
				hand[i] = card;
				i++;
			}
		}
			
		//once you're done uncomment below to see the content of that hand
		for(String card : hand)
			System.out.println(card);
		
		//Task 3: shuffle the deck of card
		//work here ....
		int swaps = 30;
		for(int i = 0; i < swaps; i++) {
			int k1 = rand.nextInt(deck.length);
			int k2 = rand.nextInt(deck.length);
			String temp = deck[k1];
			deck[k1] = deck[k2];
			deck[k2] = temp;
		}
		//once you're done uncomment below to see the content of that deck
//		for(String card : deck)
//			System.out.println(card);
		
		
		//Task 4: reverse the hand
		for(int i = 0; i < hand.length / 2; i++) {
			String temp = hand[i];
			hand[i] = hand[hand.length - i - 1];
			hand[hand.length - i - 1] = temp;
		}
		//once you're done uncomment below to see the content of that hand
		for(String card : hand)
			System.out.println(card);
		
		//Task 5: play poker in the weekend ....  just kidding
		

	}

}
