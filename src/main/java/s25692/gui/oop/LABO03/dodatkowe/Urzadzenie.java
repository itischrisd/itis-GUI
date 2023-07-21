package s25692.gui.oop.LABO03.dodatkowe;

public abstract class Urzadzenie {

	private String producent;
	protected int cena;

	public Urzadzenie(String producent, int cena) {
		this.producent = producent;
		this.cena = cena;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + producent + ", cena: " + cena;
	}

	public int getCena() {
		return cena;
	}
}
