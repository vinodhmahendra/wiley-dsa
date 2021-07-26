
public class FactorialNumber {

	public static void main(String[] args) {
		FactorialNumber recursion = new FactorialNumber();
		var  rec =recursion.factorial(10);
		System.out.println(rec);

	}

	// 0! = 1 , 1! = 1
	public int factorial(int n) {
		if ( n  < 1) {
			return -1;
		}
		if ( n== 0 || n == 1) {
			return 1;
		}
		return n* factorial(n-1);
	}
}
