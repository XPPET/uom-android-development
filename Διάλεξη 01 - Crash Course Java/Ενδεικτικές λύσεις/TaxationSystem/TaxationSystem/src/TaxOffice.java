import java.util.ArrayList;

public class TaxOffice {
	String city;
	ArrayList<TaxPayer> tpList = new ArrayList<TaxPayer>();
	
	public TaxOffice(String c) {
		city = c;
	}

	public boolean isInCity(String c) {
		return city.equals(c);
	}

	public void addTaxPayer(TaxPayer tp) {
		tpList.add(tp);		
	}

	public void printTaxes() {		
		//double sum = 0;
		//for (int i=0; i<tpList.size(); i++) {
		//	sum += tpList.get(i).calcTax();
		//}		
		System.out.println("From " + city + " you get " + calcTaxes() + " taxes");		
	}

	public double calcTaxes() {
		double sum = 0;
		for (int i=0; i<tpList.size(); i++) {
			sum += tpList.get(i).calcTax();
		}		
		return sum;
	}
	
}
