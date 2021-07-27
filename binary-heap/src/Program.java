
public class Program {

	public static void main(String[] args) {
		
		BinaryHeap newBH = new BinaryHeap(5);
//		newBH.insert(10, "Min");
//		newBH.insert(5, "Min");
//		newBH.insert(15, "Min");
//		newBH.insert(1, "Min");
//		newBH.levelOrder();
//		newBH.extractHeadOfBH("Min");
//		newBH.levelOrder();
		
		
		newBH.insert(10, "Max");
		newBH.insert(5, "Max");
		newBH.insert(15, "Max");
		newBH.insert(1, "Max");
		newBH.levelOrder();
		newBH.deleteBH();
		newBH.levelOrder();
	}

}
