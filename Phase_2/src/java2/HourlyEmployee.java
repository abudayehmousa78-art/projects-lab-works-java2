package java2;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
	private short hours;
	private float rate;

	public HourlyEmployee(short hours, float rate, String empNo, String departmentName, String First_Name, String Last_Name, LocalDate Date_of_Birth,
            String Mobile_Number, String Personal_Email, String Work_Email, String Company_Name, Address[] address) {
		super(empNo, departmentName, First_Name, Last_Name, Date_of_Birth, Mobile_Number, Personal_Email, Work_Email, Company_Name, address);
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

	

	@Override
	public String toString() {
		
		return super.toString() + "HourlyEmployee [hours : "+hours+", rate : "+rate+", payment : "+getPay()+"] , ";
	}

	public double pay() {
		if (hours <= 120) {
			return rate * hours;
		} else {
			return (hours-120)*1.5*rate+120*rate;
	}
		}
	public double getPay(){
		return pay();
	}
}
