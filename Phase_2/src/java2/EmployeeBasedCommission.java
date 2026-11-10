package java2;

import java.time.LocalDate;

public class EmployeeBasedCommission extends CommissionEmployee {

	private double baseSalary;

	public EmployeeBasedCommission(double baseSalary, double totalSales, double price, String empNo, String departmentName, String First_Name, String Last_Name,LocalDate Date_of_Birth, String Mobile_Number,
	        String Personal_Email, String Work_Email, String Company_Name) {
		super(baseSalary, totalSales, empNo, departmentName, First_Name, Last_Name, Date_of_Birth, Mobile_Number, Personal_Email, Work_Email, Company_Name);
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
