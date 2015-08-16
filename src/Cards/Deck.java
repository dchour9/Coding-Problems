package Cards;
import java.util.*;
public class Deck {
	public String [] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	//public Card[] cards;
	public ArrayList<Card> cards = new ArrayList<Card>();
	int NUM_CARDS = 52;
	int top = 0;
	public Card draw(){
		if(top == 52){
			System.out.println("No cards left in deck");
			return null;
		}
		Card c = cards.get(top);
		cards.remove(top);
		top++;
		return c;
	}
	
	public void fillDeck(){
		cards = new ArrayList<Card>();
		for(int i = 0; i < NUM_CARDS; i++){
			Card c = createCard(i + 1);
			cards.add(c);
		}
	}
	
	public void shuffle(){
		Random rgen = new Random();
		for(int i = 0; i < NUM_CARDS; i++){
			int randomPos = rgen.nextInt(NUM_CARDS);
			Card temp = cards.get(i);
			cards.set(i, cards.get(randomPos));
			cards.set(randomPos, temp);
		}
	}
	
	public Card createCard(int i){
		Card card = new Card();
		int value = i % 13;
		if(value == 0)
			value = 13;
		card.setValue(value);
		
		if(i <= 13)
			card.setSuit(suits[0]);
		else if(i <= 26)
			card.setSuit(suits[1]);
		else if(i <= 39)
			card.setSuit(suits[2]);
		else
			card.setSuit(suits[3]);
		
		/*if(card.suit == "Diamonds" || card.suit == "Hearts")
			card.setColor("Red");
		else
			card.setColor("Black");*/
		
		return card;
	}
	
	public static void main(String [] args){
		Deck deck = new Deck();
		deck.fillDeck();
		//deck.shuffle();
		for(Card c: deck.cards){
			System.out.println(c.value + " of " + c.suit);
		}
	
		
	}
}
