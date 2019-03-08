package elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card{
	public static final String FACES[] = {"ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		//String suit
		//int face
        private String suit;
        private int face;
  	//constructors
        public Card(String s, int f){
            suit=s;
            face=f;
            
        }
        public void setCard(String s, int f){
            suit=s;
            face=f;
        }
        public void setFace(int f){
            face=f;
        }
        public void setSuit(String s){
            suit=s;
        }
        public String getSuit(){
           return suit;
        }
        public int getFace(){
            return face;
        }
	public String toString(){
            return face+" of "+suit;
        }

 }