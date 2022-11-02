public class JuegoPoker {
    public static void main(String[] args) {
	
        Baraja sd = new Baraja();
            
        System.out.println("\n\nArreglo de cartas al azar");
        System.out.println(sd.getNextCard());
        System.out.println(sd.getNextCard());
        System.out.println(sd.getNextCard());
        System.out.println(sd.getNextCard());
        System.out.println(sd.getNextCard());
    
        System.out.println("\n\nTe quedan: ");
        System.out.println(sd.getRemainingCardCount());

	}
}
