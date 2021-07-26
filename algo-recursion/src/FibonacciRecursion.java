
public class FibonacciRecursion {

	public static void main(String[] args) {
		FibonacciRecursion recursion = new FibonacciRecursion();
		var rec = recursion.fibonacci(-3);
		System.out.println(rec);

	}

	private int fibonacci(int n) {
		if (n < 0) {
			return -1;
		}
		
	   if (n ==0 || n ==1) {
		   return n;
	   }
		return fibonacci(n-1) + fibonacci(n -2 );
	}

}
