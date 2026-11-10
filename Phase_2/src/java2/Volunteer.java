package java2;

import java.time.LocalDate;

public class Volunteer extends StaffMember{
	private String associationName;

	public Volunteer(String associationName, String First_Name, String Last_Name, LocalDate Date_of_Birth,
            String Mobile_Number, String Personal_Email, String Work_Email, String Company_Name) {
		super(First_Name, Last_Name, Date_of_Birth, Mobile_Number, Personal_Email, Work_Email, Company_Name);

		setAssociationName(associationName);
	}

	public void setAssociationName(String associationName) {
		this.associationName = associationName;
	}

	public String getAssociationName() {
		return associationName;
	}

	public double pay() {
		return 0;
	}

	public String toString() {
		return ("Association name is : " + associationName);
	}
}
