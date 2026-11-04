package java2;

public class Volunteer {
	private String associationName;

	public Volunteer(String associationName) {
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
