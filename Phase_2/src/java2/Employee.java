package java2;

public class Employee {
	private String empNo;
	private String departmentName;

	public Employee(String empNo, String departmentName) {
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
