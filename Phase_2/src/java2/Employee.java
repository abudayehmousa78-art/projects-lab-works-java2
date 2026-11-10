package java2;

import java.time.LocalDate;


public class Employee extends StaffMember{
	private String empNo;
	private String departmentName;

	public Employee(String empNo, String departmentName, String First_Name, String Last_Name, LocalDate Date_of_Birth,
            String Mobile_Number, String Personal_Email, String Work_Email, String Company_Name) {

		super(First_Name, Last_Name, Date_of_Birth, Mobile_Number, Personal_Email, Work_Email, Company_Name);
		setEmpNo(empNo);
		setDepartmentName(departmentName);
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public double pay() {
		return 0;
	}


}
