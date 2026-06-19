
public abstract class TaxPayer {
	double income;
	String name;
	
	public TaxPayer() {
		income = 0;
		name  = "";
	}

	public TaxPayer(String n, int inc) {
		income = inc;
		name = n;
	}

	public abstract double calcTax();
	
}
