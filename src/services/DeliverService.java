package services;

public class DeliverService {
	
	public double fee(String state) {
		
		// "SP" == state
		if("SP".equalsIgnoreCase(state)) {
			return 10;
		}
		
		
		return 20;
	}
}
