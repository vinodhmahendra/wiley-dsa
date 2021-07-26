
public class Logic3 {

	public static void main(String[] args) {
		System.out.println(powerOfTwo(4));
		System.out.println(powerOfTwoIW(4));
	}

	

	// recursive
	private static int powerOfTwo(int n) {
		if ( n == 0) {
			return 1;
		}else {
			var power = 2 * powerOfTwo(n-1);
			return power;
		}
	}
	
	//iterative
	private static int powerOfTwoIW(int n) {
		var i = 0;
		var power = 1;
		while ( i < n) {
			power = power * 2;
			i = i +1 ;
		}
		return power;
	}
	
}
