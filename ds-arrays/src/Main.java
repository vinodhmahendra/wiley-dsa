
public class Main {

	public static void main(String[] args) {
		int[] numbers = { 20, 35,-15,7,55,1,-22};
		
		int index = -1;
				
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 7) {
				index = i;
				break;
			}
		}
		
		System.out.println("index = " + index);
	}
}
