
public class Employee extends TaxPayer {

	public Employee(String name, int income) {
		super(name, income);
	}

	@Override
	public double calcTax() {
		if (income > 35000)
			return income * 0.28;
		else
			return income * 0.22;
	}

}
