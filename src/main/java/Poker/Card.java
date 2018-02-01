package Poker;

public class Card {

	//Main Variable
	 private static String[] suits = { "hearts", "spades", "diamonds", "clubs" };
	 private static String[] ranks  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	 private short rank, suit;
	 
	 //Constructor
	 Card(short suit, short rank){
		 this.suit = suit;
		 this.rank = rank;
	 }
	 
	 //Functions
	 public static String rankToString(int _rank){
		 return ranks[_rank];
	 }
	 
	 public @Override String toString(){
		 return ranks[rank] + " of " + suits[suit]; 
	 }
	 
	 public short getRank(){
		 return rank;
	 }
	 
	 public short getSuit(){
		 return suit;
	 }
	 
}
