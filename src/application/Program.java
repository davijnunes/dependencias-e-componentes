package application;

import java.util.Locale;
import services.PayService;
import services.TaxService;
import services.DeliverService;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		TaxService taxService = new TaxService();
		
		DeliverService deliverService = new DeliverService();
		
		PayService payService = new PayService(taxService,deliverService);		

		
		
		System.out.println(
				"Resultado = " + String.format("%.2f", payService.finalPrice(300.00, "SP"))
				);
		
		
	}

}
