import java.util.Random;

public class Example5 {

	public static void main(String[] args) {
		String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		//example how to combine rank and suit in a card
//		String card1 = rank[0] + " of " + suit[0];
//		System.out.println(card1);
		
		//OK, now we know how to make cards from rank and suit
		
		//Task 1: create the full deck of cards
		String[] deck = new String[rank.length * suit.length];
		// using loops fill in deck
		//work here ...
		int k = 0;
		for(int i = 0; i <rank.length;i++) {
			//System.out.println(rank[i]);
			for(int j = 0; j < suit.length; j++) {
				//System.out.println( " of " + suit[j]);
				String card = rank[i] + " of " + suit[j];
				//System.out.println(card);
				//store card in deck
				deck[k] = card;
				k++;
			}
		}
		

		//once you're done uncomment below to see the content of that deck
//		for(String card : deck)
//			System.out.println(card);
		
		//Task 2: draw a hand of five cards from deck, or using rank and suit
		String[] hand = new String[5];
		//work here ...
		Random rand = new Random();

		for(int i = 0; i < hand.length; i++) {
			int r = rand.nextInt(deck.length);
			String card  =  deck[r];
			
			boolean alreadyThere = false;
			for(String handCard : hand)
				if(card.equals(handCard))
					alreadyThere = true;
			if(!alreadyThere)
				hand[i] = card;
			else
				i--; //this pass doesn't count
			//System.out.println(card);
		}
		//once you're done uncomment below to see the content of that hand
//		for(String card : hand)
//			System.out.println(card);
		
		//Task 3: shuffle the deck of card
		//work here ....
		
		for(int swap = 0; swap < 50; swap++) { //swap multiple times
			int i1 = rand.nextInt(deck.length);
			int i2 = rand.nextInt(deck.length);
			//swap
			String temp = deck[i1];
			deck[i1] = deck[i2];
			deck[i2] = temp;
		}
		//once you're done uncomment below to see the content of that deck
//		for(String card : deck)
//			System.out.println(card);
		
		//Task 4: reverse the hand
		for(int i = 0; i < hand.length / 2; i++) {
			String temp = hand[i];
			hand[i] = hand[hand.length - (i + 1)];
			hand[hand.length - (i + 1)] = temp;
		}
		
		//once you're done uncomment below to see the content of that hand
//		for(String card : hand)
//			System.out.println(card);
		
		//Task 5: play poker in the weekend ....  just kidding
		

	}

}
