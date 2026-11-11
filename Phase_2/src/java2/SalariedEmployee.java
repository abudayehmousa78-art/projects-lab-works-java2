package java2;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{
	private double annualSalary;

	public SalariedEmployee(double annualSalary, String empNo, String departmentName, String First_Name, String Last_Name, LocalDate Date_of_Birth,
            String Mobile_Number, String Personal_Email, String Work_Email, String Company_Name, Address[] address) {
		super(empNo, departmentName, First_Name, Last_Name, Date_of_Birth, Mobile_Number, Personal_Email, Work_Email, Company_Name, address);
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
