import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeEmployee {
	
	public SerializeEmployee() {
		
		Employee employee = new Employee(101, "vinodh", 15000, new Date());
		try {
			FileOutputStream f = new FileOutputStream("employee.ser");
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(employee);
			o.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SerializeEmployee();
	}

}
