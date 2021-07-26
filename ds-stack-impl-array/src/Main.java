import java.util.Stack;

public class Main {

	public static void main(String[] args) {
//		Stack
		ArrayStack stack = new ArrayStack(10);
		
		stack.push(new Employee(101, "vinodh", "kumar"));
		stack.push(new Employee(102, "shivam", "gupta"));
		stack.push(new Employee(103, "usha", "gottapu"));
		stack.push(new Employee(104, "soumya", "shrivastava"));
		stack.push(new Employee(105, "devansh", "goyal"));
		
//		stack.printStack();
		
		System.out.println(stack.peek());
		
		System.out.println("Popped  : " + stack.pop());
		System.out.println(stack.peek());
	}

}
