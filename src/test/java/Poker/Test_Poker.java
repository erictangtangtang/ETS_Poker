package Poker;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class Test_Poker {

	PokerCards PC = new PokerCards();
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	@Test
	public void test() {
		while(map.size() > 0){
			PC.shuffle();
			String s = PC.dealOneCard().toString();
			try{
				assertEquals(map.get(s),null);
				map.put(s, 0);
			}catch(IllegalArgumentException e){
				
			}
		}
		/* 
	    recursively call shuffle and dealOneCard 52 times, 
		and each time it should return a new card
		*/
	   try{
		   PC.shuffle();
		   String temp = PC.dealOneCard().toString();
		   //Test the 53rd calls
	   }catch(NullPointerException e){
		   System.out.print("NullPointerException caught");
	   }
	}

}
