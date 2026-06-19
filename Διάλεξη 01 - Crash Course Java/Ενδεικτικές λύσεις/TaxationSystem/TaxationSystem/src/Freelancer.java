
public class Freelancer extends TaxPayer {

	public Freelancer(String name, int income) {
		super(name, income);
	}

	@Override
	public double calcTax() {
		if (income > 25000)
			return income * 0.35;
		else
			return income * 0.26;
	}
}
