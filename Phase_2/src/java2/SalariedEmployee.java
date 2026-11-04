package java2;

public class SalariedEmployee {
	private double annualSalary;

	public SalariedEmployee(double annualSalary) {
		setAnnualSalary(annualSalary);

	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		if (annualSalary >= 21600 && annualSalary <= 120000) {
			this.annualSalary = annualSalary;
		} else {
			System.out.println("is not valide");
		}
	}

	public double pay(double monthlySalary) {
		return monthlySalary = annualSalary / 12;
	}

	public String toString() {
		return "annoalSalary is : " + annualSalary;
	}

}
