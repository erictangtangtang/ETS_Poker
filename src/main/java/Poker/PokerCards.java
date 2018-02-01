/**
 * 
 */
/**
 * @author yihangtang
 *
 */
package Poker;


import java.util.ArrayList;
import java.util.Random;

public class PokerCards{
	
	 private static final int DECK_SIZE = 52;
	 
	 private ArrayList<Card> cards;
	 
	 //Constructor
	 
	 PokerCards(){
		 cards = new ArrayList<Card>();
		 Random random = new Random();
		 Card temp;
		 
		 //Construct a deck of cards in order at beginning
		 for(short i = 0; i < 4; i++){
			 for(short j = 0; j < 13; j++){
				 cards.add(new Card(i,j));
			 }
		 }
		 
		 //shuffle this deck
		 int index_1, index_2;
		 for(short i = 0; i < 1000; i++){
			 index_1 = random.nextInt(DECK_SIZE);
			 index_2 = random.nextInt(DECK_SIZE);
			 
			 temp = (Card) cards.get(index_2);
			 cards.set(index_2, cards.get(index_1));
			 cards.set(index_1, temp);
		 }
	 }


	//Main Function
	 
	 //shuffle the whole deck of cards
	public void shuffle(){
		Random random = new Random();
		 Card temp;
		 
		 //shuffle this deck
		 int index_1, index_2;
		 for(short i = 0; i < 1000; i++){
			 index_1 = random.nextInt(cards.size()-1);
			 index_2 = random.nextInt(cards.size()-1);
			 
			 temp = (Card) cards.get(index_2);
			 cards.set(index_2, cards.get(index_1));
			 cards.set(index_1, temp);
		 } // larger i = more randomness

		//return;
	}
	//print all cards
	public void printallcards(){
		for(int i = 0; i < cards.size(); i++){
			System.out.println(cards.get(i).toString());
		}
		
	}
	//print one card
	public void printonecard(Card card){
		System.out.println(card.toString());
		
	}
	//return one card
	public Card dealOneCard(){
		Card NewCard = cards.remove(cards.size()-1); 
		return NewCard;
	}
	
}