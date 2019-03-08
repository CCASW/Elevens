package elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck{
    public static final int NUMCARDS = 52;
    public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
    private List<Card> cards; 
    
    private int top;
    public Deck(){
        String temp="";
        for(int i=0;i<13;i++){
            for(int j=0;j<=3;j++){
                if(j==0) temp="CLUBS";
                if(j==1) temp="HEARTS";
                if(j==2) temp="DIAMONDS";
                if(j==3) temp="SPADES";
                cards.set(i,new Card(temp,i));
            }
        }
        top=51;
    }
		//add a new TwentyOneCard to the deck
    public Card dealCard(){
        if(top==0) top=52;
        return cards.get(--top);
    }
    public Card dealCard(int a){
        return cards.get(a);
    }
   
   //make a dealCard() method that returns the top card
   public void shuffle(){
        top=51;
        
   }
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
}