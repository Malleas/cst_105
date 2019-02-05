package CST105.Week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * All work is created by Matt Sievers on 02-04-2019 for use in CST-105
 */
public class RandomCard {

  public static void cardPicker(int cardsNeeded) {
    int[] deck = new int[52];
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] suits = {"Hearts", "Diamonds", "Spade", "Club"};
    for (int i = 0; i < deck.length; i++)
      deck[i] = i;
    for (int i = 0; i < deck.length; i++) {
      int index = (int) (Math.random() * deck.length);
      int temp = deck[i];
      deck[i] = deck[index];
      deck[index] = temp;
    }
    for (int i = 0; i < cardsNeeded; i++) {
      String suit = suits[deck[i] / 13];
      String rank = ranks[deck[i] % 13];
      System.out.println(rank + " of " + suit);
    }

  }

  public void createCards(){
    int[] cardArray = new int[52];
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < cardArray.length; i++) {
      cardArray[i] = i;
      list.add(i);
    }
    Collections.shuffle(list);
    int firstCard = list.get(0);
    int secondCard = list.get(1);
    int thirdCard = list.get(2);
    String firstFile = ("CST105/Week7/DeckOfCardsFiles/" + firstCard + ".png");
    String secondFile = ("CST105/Week7/DeckOfCardsFiles/" + secondCard + ".png");
    String thirdFile = ("CST105/Week7/DeckOfCardsFiles/" + thirdCard + ".png");
    ArrayList<String> fileList = new ArrayList<>();
    fileList.add(firstFile);
    fileList.add(secondFile);
    fileList.add(thirdFile);
    System.out.println(list);
    System.out.println(firstCard + " " + secondCard + " " + thirdCard);
    System.out.println(firstFile + " " + secondFile + " " + thirdFile);
    System.out.println(fileList.get(0));
  }


}


