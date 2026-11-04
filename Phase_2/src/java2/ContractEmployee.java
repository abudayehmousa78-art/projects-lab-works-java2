package java2;

public class ContractEmployee {
	private double contractRate;
	private byte numberOfMonths;

	public ContractEmployee(double contractRate, byte numberOfMonths) {
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

	public String toString() {
		return "contractRate : " + contractRate + "\nnumberOmonth : " + numberOfMonths;
	}

}
