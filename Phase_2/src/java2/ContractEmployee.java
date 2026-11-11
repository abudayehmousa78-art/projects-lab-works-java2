package java2;

import java.time.LocalDate;

public class ContractEmployee extends Employee{
	private double contractRate;
	private byte numberOfMonths;

	public ContractEmployee(double contractRate, byte numberOfMonths, String empNo, String departmentName, String First_Name, String Last_Name,LocalDate Date_of_Birth, String Mobile_Number,
	        String Personal_Email, String Work_Email, String Company_Name, Address[] address) {
		super(empNo, departmentName, First_Name, Last_Name, Date_of_Birth, Mobile_Number, Personal_Email, Work_Email, Company_Name, address);

		setContractRate(contractRate);
		setNumberOfMonths(numberOfMonths);
	}

	public double getContractRate() {
		return contractRate;
	}

	public void setContractRate(double contractRate) {
		if (contractRate <= 10000 && contractRate > 0) {
			this.contractRate = contractRate;
		} else {
			System.out.println("not valid");
		}
	}

	public byte getNumberOfMonths() {
		return numberOfMonths;
	}

	public void setNumberOfMonths(byte numberOfMonths) {
		if (numberOfMonths > 0) {
			this.numberOfMonths = numberOfMonths;
		} else {
			System.out.println("invalid number");
		}
	}

	public double pay() {
		double monthlySalary = contractRate / numberOfMonths;
		return monthlySalary;
	}

	@Override
	public String toString() {
		return super.toString() + "ContractEmployee [contractRate=" + contractRate + ", numberOfMonths=" + numberOfMonths + ", payment = " +pay()+ "]";
	}

	

	

}
