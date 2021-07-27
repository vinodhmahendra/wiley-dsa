public class ProgramInsert {

	public static void main(String[] args) {
		
		
		BinaryTreeLinkedList binaryTree = new BinaryTreeLinkedList();
		binaryTree.insert("N1");
		binaryTree.insert("N2");
		binaryTree.insert("N3");
		binaryTree.insert("N4");
		binaryTree.insert("N5");
		binaryTree.insert("N6");
//		binaryTree.insert("N7");
//		binaryTree.insert("N8");
//		binaryTree.insert("N9");
		binaryTree.levelOrder();
		System.out.println();
		//System.out.println(" the deeepest node in a  tree " +binaryTree.getDeepestNode().value);
		binaryTree.deleteNode("N3");
		binaryTree.levelOrder();
	}

}
