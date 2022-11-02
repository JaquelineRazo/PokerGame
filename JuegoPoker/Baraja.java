import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
	private ArrayList<Carta> deck = new ArrayList<Carta>();
	
	public Baraja() {
		Deck();
		despligue();
		shuffleDeck();
		despligue();
	}
	
	public void Deck() {

		System.out.println("\n\nCreando Baraja de Poker!\n\n");
		for (int i = 2; i < 15; i++) {
			deck.add(new Carta(i,"Corazones"));
		}
		
		// Palo de diamantes
		for (int j = 2; j < 15; j++) {
			deck.add(new Carta(j,"Diamantes"));
		}
		
		// Palo de espadas
		for (int k = 2; k < 15; k++) {
			deck.add(new Carta(k,"Espadas"));
		}
		
		// Palo de tréboles
		for (int l = 2; l < 15; l++) {
			deck.add(new Carta(l,"Treboles"));
		}
	}
	
	public void despligue(){
		for (Carta iBaraja: deck){
			System.out.println(iBaraja.toString()+" ");
		}
	}

	public void shuffleDeck() {
		System.out.println("\n\nSe mezclo! \n\n");
		Collections.shuffle(deck);
	}

	public Carta getNextCard() {
		return this.deck.remove(this.deck.size()-1);
	}
	
	public int getRemainingCardCount() {
		return this.deck.size();
	}
	

}