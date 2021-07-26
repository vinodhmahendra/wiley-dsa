
public class EmployeeLinkedList {
	
	private EmployeeNode head;
	private int size;
	
	public boolean isEmpty() {
		// head is holding a null value
		return head == null;
	}
	
	public int getSize() {
		return size;
	}
	
	public  void addToFront(Employee employee) {
		// create a node
		EmployeeNode node = new EmployeeNode(employee);
		
		//set the next to head
		node.setNext(head);

		//assign head --- > node
		head = node;
		
		size ++;
	}
	
	public EmployeeNode removeFromFront() {
		if ( isEmpty() ) {
			return null;
		}
		
		//temporary variable
		EmployeeNode removedNode = head;
		head = head.getNext();
		size --;
		removedNode.setNext(null);
		return removedNode;
	}
	
	
	public void printList() {
		EmployeeNode current  = head;
		System.out.println("HEAD --- >");
		while (current != null) {
			System.out.println(current);
			System.out.print( " -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

}
