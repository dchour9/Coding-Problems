package Cards;
import java.util.*;
public class Player {
	public ArrayList<Card> hand;
	public String name;
	
	public Player(String n){
		hand = new ArrayList<Card>();
		name = n;
	}
	
	public void addToHand(Card c){
		hand.add(c);
	}
	
	public void clearHand(){
		hand.clear();
	}
	
	public int handTotal(){
		int sum = 0;
		for(Card c: hand){
			sum += c.value;
		}
		return sum;
	}
	

}
