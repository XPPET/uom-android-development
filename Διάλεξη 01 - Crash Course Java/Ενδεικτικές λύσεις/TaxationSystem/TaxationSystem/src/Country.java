import java.util.ArrayList;

public class Country {
	ArrayList<TaxOffice> toList = new ArrayList<TaxOffice>();

	public void addTaxOffice(String city) {
		toList.add(new TaxOffice(city));
	}
	
	public void addTaxPayer(String city, TaxPayer tp) {
		for (int i=0; i<toList.size();i++) {
			if (toList.get(i).isInCity(city)) {
				//if (toList.get(i).getCityName().equals(city)) {
				toList.get(i).addTaxPayer(tp);
				//ArrayList<TaxPayer> temp = toList.get(i).getTaxPayers();
				//temp.add(tp);
				//toList.get(i).setTaxPayers(temp);
				break;
			}
		}
	}
	
	public void printTaxesPerTaxOffice() {
		for (int i=0; i<toList.size();i++) {
			toList.get(i).printTaxes();
		}
	}

	public void calcCountryIncomeFromTaxes() {
		double sum = 0;
		for (int i=0; i<toList.size();i++) {
			sum += toList.get(i).calcTaxes();
		}		
		System.out.println("Total taxes: " + sum);
	}
}
