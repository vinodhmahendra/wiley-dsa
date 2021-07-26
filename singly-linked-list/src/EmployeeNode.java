
public class EmployeeNode {
	
	//data
	private Employee employee;
	
	//reference (link)
	private EmployeeNode next;
	
	public EmployeeNode(Employee employee) {
		this.employee = employee;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public EmployeeNode getNext() {
		return next;
	}
	public void setNext(EmployeeNode next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return employee.toString();
	}

}
