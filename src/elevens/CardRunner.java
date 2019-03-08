package elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.awt.Color;

public class CardRunner
{
	public static void main( String args[] )
	{
		
		Card one = new Card("SPADES", 9);
		out.println(one.getSuit());
		out.println(one.getFace());

		Card two = new Card("DIAMONDS", 1);
		out.println(two);
		two.setFace(3);
		out.println(two);

		Card three = new Card("CLUBS", 4);
		three.setCard("HEARTS",11);
                out.println(three);
                
		Card four = new Card("SPADES", 12);
		out.println(four);

		Card five = new Card("HEARTS", 12);
		out.println(five);
                
                Deck six=new Deck();
                
                for(int i=0;i<10;i++){
                    out.println(six.dealCard(i));
                }
            		
	}
}