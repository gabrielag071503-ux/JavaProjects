package entites;

public class CurrenceConverter {
	public static final double IOF = 0.06;
	
	public static double DollarToReal (double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);    
	}
	
	

}
