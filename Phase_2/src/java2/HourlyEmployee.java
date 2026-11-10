package java2;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
	private short hours;
	private float rate;

	public HourlyEmployee(short hours, float rate, String empNo, String departmentName, String First_Name, String Last_Name, LocalDate Date_of_Birth,
            String Mobile_Number, String Personal_Email, String Work_Email, String Company_Name) {
		super(empNo, departmentName, First_Name, Last_Name, Date_of_Birth, Mobile_Number, Personal_Email, Work_Email, Company_Name);
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
	public double getPay(){
		return pay();
	}
}
