import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeEmployee {

	Employee employee = null;
	DeSerializeEmployee() {
		try {
			FileInputStream input = new FileInputStream("employee.ser");
			ObjectInputStream s = new ObjectInputStream(input);
			employee = (Employee) s.readObject();
			s.close();
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(employee);
	}
	public static void main(String[] args) {
		new DeSerializeEmployee();

	}

}
