package s25692.gui.oop.LABO04.dod3;

import java.util.HashMap;
import java.util.Map;

public class Calc {

	private final Map<String, Calculable> calcMap;

	public Calc() {
		this.calcMap = new HashMap<>();
		calcMap.put("+", Integer::sum);
		calcMap.put("-", (a, b) -> a - b);
		calcMap.put("/", (a, b) -> (double) a / b);
		calcMap.put("*", (a, b) -> a * b);
	}

	public String doCalc(String input) {
		String[] inputTable = input.split(" ");
		int numA = Integer.parseInt(inputTable[0]);
		int numB = Integer.parseInt(inputTable[2]);
		String operation = inputTable[1];
		return String.valueOf(calcMap.get(operation).calculate(numA, numB));
	}
}
