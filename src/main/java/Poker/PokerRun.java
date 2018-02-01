package Poker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PokerRun {
	
	//main function
	public static void main(String args[]) {
		//Interface
		
		//Construct Poker Cards
		PokerCards PC = new PokerCards();
		String choice = "";
		choice = catchInput();
		
		//Function 
		while(!choice.equals("3")){
			if(choice.equals("1")){
				PC.shuffle();
				PC.printallcards();
				choice = catchInput();
			}
			else if(choice.equals("2")){
				Card card = PC.dealOneCard();
				PC.printonecard(card);
				choice = catchInput();
			}
			else{
				System.out.println("Wrong Command!");
				choice = catchInput();
			}
		}
		
		
	}
	//Ask user to input
	public static String catchInput(){
		
		System.out.println("Menu:");
		System.out.println("1.Shuffle");
		System.out.println("2.DealOneCard");
		System.out.println("3.Quit");
		String choice = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {choice = in.readLine();}
		catch(Exception e) {
			System.out.println("Caught an exception!"); 
		}
		return choice;
	}

}
