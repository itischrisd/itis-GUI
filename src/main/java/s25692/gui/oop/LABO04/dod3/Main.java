package s25692.gui.oop.LABO04.dod3;

public class Main {

	public static void main(String[] args) {

		Calc c = new  Calc();
		String wynik;
		try {
			wynik = c.doCalc("10 + 2");
			System.out.println(wynik);
		} catch (Exception e) {
			System.out.println("Podaj prawidłowe działanie arytmetyczne do wykonania");
		}
	}
}
