public class Main {

	public static void main(String[] args) {
		EmployeeLinkedList list = new EmployeeLinkedList();

		Employee vinodh = new Employee(101, "vinodh", "kumar");
		Employee shivam = new Employee(102, "shivam", "gupta");
		Employee usha = new Employee(103, "usha", "gottapu");
		Employee soumya = new Employee(104, "soumya", "shrivastava");
		System.out.println(list.isEmpty());

		// add employee (data ) to a list
		list.addToFront(vinodh);
		list.addToFront(shivam);
		list.addToFront(usha);
		list.addToFront(soumya);

		System.out.println(list.getSize());

		list.printList();

		list.removeFromFront();

		System.out.println(list.getSize());

		list.printList();

	}

}
