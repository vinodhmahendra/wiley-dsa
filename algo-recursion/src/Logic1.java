
public class Logic1 {

	public static void main(String[] args) {
		firstMethod();
	}

	private static void firstMethod() {
		secondMethod();
		System.out.println("I'm First Method");
	}

	private static void secondMethod() {
		thirdMethod();
		System.out.println("I'm Second Method");
		
	}

	private static void thirdMethod() {
		fourthMethod();
		System.out.println("I'm Third Method");
		
	}

	private static void fourthMethod() {
		System.out.println("I'm Fourth Method");
//		return;
	}
}
