package java2;

public class EmployeeBasedCommission extends CommissionEmployee {

	private double baseSalary;

	public EmployeeBasedCommission(double baseSalary, double totalSales, double price) {
		super(totalSales, price);
		setBaseSalary(baseSalary);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary >= 0) {
			this.baseSalary = baseSalary;
		}else {
			System.out.println("invalid number");
		}
	}

	public double pay() {
		return baseSalary + super.pay();
	}

	public String toString() {
		return super.toString() + "\nbase salary is : " + baseSalary;
	}

}
