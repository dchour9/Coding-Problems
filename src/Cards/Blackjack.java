package Cards;
import java.util.*;
public class Blackjack {
	public Deck deck;
	public int dealerWins = 0;
	public int playerWins = 0;
	public Player dealer;
	public Player player;
	
	public void initialize(){
		dealer = new Player("The Dealer");
		System.out.print("Input your name : ");
		Scanner in = new Scanner(System.in);
		String playerName = in.nextLine();
		in.close();
		player = new Player(playerName);
		createDeck();
	}
	
	public void createDeck(){
		deck = new Deck();
		deck.fillDeck();
		deck.shuffle();
	}
	
	public void dealFirstHand(){
		dealer.addToHand(deck.draw());
		dealer.addToHand(deck.draw());
		player.addToHand(deck.draw());
		player.addToHand(deck.draw());
		if(player.handTotal() == 21){
			//drawToFinish(dealer);
		}
	}
	
	public void start(){
		initialize();
	}
}
