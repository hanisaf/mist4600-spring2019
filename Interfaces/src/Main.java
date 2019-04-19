
public class Main {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.setIdentifier("F123455");
		v.setModel("Ford Focus");
		v.setPrice(15000.0);
		v.setYear(2018);
		v.setSalesTaxRate(0.07);
		
		
		House h = new House();
		h.setCity("Athens");
		h.setStreetNumber(1234);
		h.setStreetName("Horton St");
		h.setValue(350000);
		h.setPropertyTaxRate(0.01);
		
		
		Accounting ac = new Accounting();
		double vtax = ac.calculateTax(v);
		System.out.println(v);
		System.out.println(vtax);
		
		double htax = ac.calculateTax(h);
		System.out.println(h);
		System.out.println(htax);

	}

}
