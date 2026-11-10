package java2;

import java.time.LocalDate;

public class CommissionEmployee extends Employee {

	private double totalSales;
	private double price;

	public CommissionEmployee(double totalSales, double price, String empNo, String departmentName,
			String First_Name, String Last_Name,LocalDate Date_of_Birth, String Mobile_Number,
	        String Personal_Email, String Work_Email, String Company_Name) {
		
		super(empNo, departmentName, First_Name, Last_Name, Date_of_Birth, Mobile_Number, Personal_Email, Work_Email, Company_Name);
		
		setTotalSales(totalSales);
		setPrice(price);
	}

	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		if (totalSales >= 0) {
			this.totalSales = totalSales;
		} else {
			System.out.println("invalid input");
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			System.out.println("invalid input");
		}
	}

	public String toString() {
		return "totalSales is : " + totalSales + "\nprice is : " + price;
	}

	public double pay() {
		double sales = totalSales * price;
		double commission = 0;
		if (sales < 15000) {
			commission = sales * 0.015;
		} else if (sales >= 15000 && sales <= 20000) {
			commission = sales * 0.03;
		} else if (sales > 20000) {
			commission = sales * 0.05;
		}
		return commission;
	}

}
