
public class MainClass {

	public static void main(String[] args) {
		Country myCountry = new Country();

		myCountry.addTaxOffice("Thessaloniki");
		myCountry.addTaxOffice("Athens");

		myCountry.addTaxPayer("Thessaloniki", new Freelancer("Papadopoulos", 15000));
		myCountry.addTaxPayer("Thessaloniki", new Employee("Antoniou", 20000));
		myCountry.addTaxPayer("Athens", new Freelancer("Karagianni", 30000));
		myCountry.addTaxPayer("Athens", new Employee("Iakovidou", 36000));

		myCountry.printTaxesPerTaxOffice();
		myCountry.calcCountryIncomeFromTaxes();

	}

}
