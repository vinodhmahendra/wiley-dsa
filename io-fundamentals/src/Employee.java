import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	private int id;
	private String name;
	private double salary;
	private transient Date birthDate;
	
	public Employee(int id, String name, double salary, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.birthDate = birthDate;
	}

	public Employee(int id, String name, double salary) {
		this(id,name,salary,null);
	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, salary=%s, birthDate=%s]", id, name, salary, birthDate);
	}

	
	
	

	
	
}
