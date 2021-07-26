
public class EmployeeNode {
	
	//data
	private Employee employee;
	
	//field (link)
	private EmployeeNode next;
	
	
	//field (link)
	private EmployeeNode previous;
	
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
	
	public EmployeeNode getPrevious() {
		return previous;
	}
	public void setPrevious(EmployeeNode previous) {
		this.previous = previous;
	}
	@Override
	public String toString() {
		return employee.toString();
	}

}
