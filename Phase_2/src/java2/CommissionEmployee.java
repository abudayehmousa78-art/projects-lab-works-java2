package java2;

public class CommissionEmployee {

	private double totalSales;
	private double price;

	public CommissionEmployee(double totalSales, double price) {
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
