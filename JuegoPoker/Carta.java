public class Carta {
	private int value;
	private String palo;
	private String color;
	
	public Carta(int value, String palo) {
		this.value = value;
		this.palo = palo;
		if (this.palo.equals("Corazones") || this.palo.equals("Diamantes")) {
			this.color = "Rojo";
		}
		if (this.palo.equals("Treboles") || this.palo.equals("Espadas")) {
			this.color = "Negro";
		}
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String getPalo() {
		return this.palo;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String convertValueToName() {
		switch(this.value) {
			case 1: return "As";
			case 2: return "Dos";
			case 3: return "Tres";
			case 4: return "Cuatro";
			case 5: return "Cinco";
			case 6: return "Seis";
			case 7: return "Siete";
			case 8: return "Ocho";
			case 9: return "Nueve";
			case 10: return "Diez";
			case 11: return "Jota";
			case 12: return "Reina";
			case 13: return "Rey";
			case 14: return "As";
			default: return "Valor no válido";
		}
	}
	
	public String toString() {
		return (convertValueToName() + " de " + this.palo + " color: " + this.color);
	}

}