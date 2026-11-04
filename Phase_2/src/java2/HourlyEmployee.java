package java2;

public class HourlyEmployee {
	private short hours;
	private float rate;

	public HourlyEmployee(short hours, float rate) {
		setHours(hours);
		setRate(rate);
	}

	public short getHours() {
		return hours;
	}

	public void setHours(short hours) {
		if (hours >= 1 && hours <= 288) {
			this.hours = hours;
		} else {
			System.out.println("is not valide");
		}
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		if (rate >= 8 && rate <= 30) {
			this.rate = rate;
		} else {
			System.out.println("is not valide");
		}
	}

	public String toString() {
		return "hours is : " + hours + "\nrate is : " + rate;
	}

	public double pay(double Salary) {
		if (hours <= 120) {
			Salary = rate * hours;
		} else {
			double extra = hours - 120;
			extra = extra * 1.5;

			Salary = rate * (hours + extra);
		}
		return Salary;
	}
}
