package java2;

import java.time.LocalDate;

public class WeeklyEmployee extends Employee{
	private byte noOfWeeks;
	private float wagePerWeek;

	public WeeklyEmployee(byte noOfWeeks, float wagePerWeek, String empNo, String departmentName, String First_Name, String Last_Name, LocalDate Date_of_Birth,
            String Mobile_Number, String Personal_Email, String Work_Email, String Company_Name) {
		super(empNo, departmentName, First_Name, Last_Name, Date_of_Birth, Mobile_Number, Personal_Email, Work_Email, Company_Name);
		setNoOfWeeks(noOfWeeks);
		setWagePerWeek(wagePerWeek);
	}

	public byte getNoOfWeeks() {
		return noOfWeeks;
	}

	public void setNoOfWeeks(byte noOfWeeks) {
		if (noOfWeeks >= 1 && noOfWeeks <= 4) {
			this.noOfWeeks = noOfWeeks;
		} else {
			System.out.println("is not valide");
		}
	}

	public float getWagePerWeek() {
		return wagePerWeek;
	}

	public void setWagePerWeek(float wagePerWeek) {
		if (wagePerWeek >= 300 && wagePerWeek <= 700) {
			this.wagePerWeek = wagePerWeek;
		} else {
			System.out.println("is not valide");
		}
	}

	public double pay(double monthlySalary) {
		return monthlySalary = noOfWeeks * wagePerWeek;
	}

	public String toString() {
		return "no of week is : " + noOfWeeks + "\nwage per week is : " + wagePerWeek;
	}
	public double getPay(){
		return pay();
	}
}
