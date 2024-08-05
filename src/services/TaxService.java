package services;

public class TaxService {
	
	public static final double taxPattern = 0.1;
	
	public double tax(Double value) {
		
		return value * taxPattern;
	}
}
