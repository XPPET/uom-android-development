// Country class replacement in TaxRevenue project

import java.util.HashMap;
import java.util.Map;

public class Country {

    private Map<String, TaxOffice> taxOffices = new HashMap<>();

    public void addTaxOffice(String location) {
        taxOffices.put(location, new TaxOffice(location));
    }

    public void addTaxPayer(String location, TaxPayer taxPayer) {
        taxOffices.get(location).addTaxPayer(taxPayer);
    }

    public void printTaxesPerTaxOffice() {
        for (Map.Entry<String, TaxOffice> taxOffice : taxOffices.entrySet())
            System.out.println("Location: " + taxOffice.getKey() + ", Tax Revenue: " + taxOffice.getValue().calculateTotalTax());
    }

    public void calcCountryIncomeFromTaxes() {
        double totalTax = 0;
        for (TaxOffice taxOffice : taxOffices.values())
            totalTax += taxOffice.calculateTotalTax();
        System.out.println("Total Tax Revenue: " + totalTax);
    }
}