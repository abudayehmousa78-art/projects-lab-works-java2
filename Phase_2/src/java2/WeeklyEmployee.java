package java2;

public class WeeklyEmployee {
	private byte noOfWeeks;
	private float wagePerWeek;

	public WeeklyEmployee(byte noOfWeeks, float wagePerWeek) {
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
}
