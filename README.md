# PokerGame

This project simulate Poker game by achieveing two functions:shuffle and deal one card.

## Getting Started

Based on the requirement, everytime user call shuffle, simulator will rearrange the order of cards that are currently in the deck.
If user call dealOneCard, this function will return one card as long as there are still cards in the deck.

### Prerequisites

I used Eclipse as development IDE, and Gradle as development tool kit. I chose Java as the development language.

### Installing

First, I create a class called Card which represent one card in the deck, each card contains two variables, rank and suit.
In the end, each card that returned as a string will be like:

```
King of hearts
```

In class Card,I implement some simple functions such as convert Card object into a string, etc.

Then, I design another class called PokerCards, which represent a deck of cards. In this class, I used an ArrayList as a container
to contain all cards. Everytime the constructor was called, this container will be intiate and filled with integers. So far, each
card is represent by two shorts (which is rank and suit in Card class), rather than a string.

I also add a class called PokerRun which is a simple interface that allow users to call shuffle() and dealOneCard() by themsevles.

```
Menu:
1.Shuffle
2.DealOneCard
3.Quit

```
When user run main function in PokerRun, this menu will continuously pop out until user input "3".

Moreover, I also write a Junit test file called Test_Poker.java, In that file, I called shuffle and dealOneCard recursively.

## Running the tests

In the test, I called shuffle and dealOneCard 52 times, and used a hashmap to store all returned cards. Then I used
assertEquals() to judge if any card repeat. The result is false, so the test passed.

Then I called these two functions again, since all cards in Arraylist has been removed, it should return NullPointerException,
so I used try-catch, and catch the exception, so this test passed as well.

```
 try{
		   PC.shuffle();
		   String temp = PC.dealOneCard().toString();
		   //Test the 53rd calls
	   }catch(NullPointerException e){
		   System.out.print("NullPointerException caught");
	   }

```

## Authors

* **Yihang Tang** 
