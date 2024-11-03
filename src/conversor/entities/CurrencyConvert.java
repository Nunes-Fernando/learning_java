package conversor.entities;

public class CurrencyConvert {
	
	private static final double IOF = 6;
	
	public static double dollarInReais(double howMany, double dollarPrice) {
		double calc = dollarPrice * howMany;
		return calc + (calc * 6 / 100);
	}
}
