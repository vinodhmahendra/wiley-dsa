
public class Program {

	public static void main(String[] args) {
		//create a binary search tree object
		BinarySearchTree newBST = new BinarySearchTree();
		newBST.insert(70);
		newBST.insert(50);
		newBST.insert(90);
		newBST.insert(30);
		newBST.insert(60);
		newBST.insert(80);
		newBST.insert(85);
		newBST.insert(100);
		newBST.insert(20);
		newBST.insert(40);
		newBST.levelOrder();
		newBST.deleteNode(newBST.root, 70);
		System.out.println();
		newBST.levelOrder();
		
//		newBST.deleteBST();
//		newBST.levelOrder();
	}

}
