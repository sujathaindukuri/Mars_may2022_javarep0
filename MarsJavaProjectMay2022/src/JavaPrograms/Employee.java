package JavaPrograms;

public class Employee {
	
	private String EmpName;
	private String Department;
		private int EmpId;
	private int EmpSal;
	public String getEmpName() {
		return this.EmpName;
	}
	public void setEmpName(String empName) {
		this.EmpName = empName;
	}
	public String getDepartment() {
		return this.Department;
	}
	public void setDepartment(String department) {
		this.Department = department;
	}
	public int getEmpId() {
		return this.EmpId;
	}
	public void setEmpId(int empId) {
		this.EmpId = empId;
	}
	public int getEmpSal() {
		return this.EmpSal;
	}
	public void setEmpSal(int empSal) {
		this.EmpSal = empSal;
	}
	public String getEmpInfo()
	{
		return("\n"+EmpName+" is an Employee with id "+EmpId+" in department "+Department+" with salary "+EmpSal);
	}

}
