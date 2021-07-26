import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLinkedList {

	BinaryNode root;

	public BinaryTreeLinkedList() {
		this.root = null; // time complexity ------0(1) ,space complexity ---- > 0(1)
	}

	// PreOrder Traversal
	// Total Time Complexity --- > O (N)
	// Total Space Complexity --- > 0 (N)
	void preOrder(BinaryNode node) {
		if (node == null) { // --------------------- > O(1)
			return; // ------------------------> 0(1)
		}
		System.out.print(node.value + " "); // ----------> O(1)
		preOrder(node.left); // -------- > 0 (N/2)
		preOrder(node.right); // ----- 0 (N/2)
	}

	// InOrder Traversal
	// Total Time Complexity --- > O (N)
	// Total Space Complexity --- > 0 (N)
	void inOrder(BinaryNode node) {
		if (node == null) { // ----------------- O (1)
			return; // ------------------- O (1)
		}
		// left subtree
		inOrder(node.left); // .................... O (N/2)
		System.out.print(node.value + " "); // ------------------- O (1)
		// right subtree
		inOrder(node.right); // ------------------------- O (N/2)
	}

	// Post Order Traversal
	// Total Time Complexity --- > O (N)
	// Total Space Complexity --- > 0 (N)
	void postOrder(BinaryNode node) {
		if (node == null) { // ------------------ O (1)
			return; // ------------------------- O (1)
		}
		postOrder(node.left); // --------------------- O (N/2)
		postOrder(node.right); // ---------------------O (N/2)
		System.out.print(node.value + " "); // ------------ O(1)
	}

	// Level Order
	void levelOrder() {
		// create the Queue
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>(); // ----- O(1)

		// insert root node to the queue
		queue.add(root); // --------------- O(1)

		while (!queue.isEmpty()) { // ------------------------ O (N)
			BinaryNode presentNode = queue.remove(); // ---- O(1)
			System.out.print(presentNode.value + " "); // --- O (1)
			if (presentNode.left != null) { // ............ O(1)
				queue.add(presentNode.left);
			}
			if (presentNode.right != null) { // ............ O(1)
				queue.add(presentNode.right);
			}
		}

	}

	// Search Method
	public void search(String value) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();// O(1)
		queue.add(root); // O(1)
		while (!queue.isEmpty()) { // 0 (N)
			BinaryNode presentNode = queue.remove(); // O (1)
			if (presentNode.value == value) {
				System.out.println("The value = " + value + " is found in Tree"); // O(1)
				return;
			} else {
				if (presentNode.left != null) {
					queue.add(presentNode.left); // O (1)
				}
				if (presentNode.right != null) { // O (1)
					queue.add(presentNode.right);
				}

			}
		}
		System.out.println("The value = " + value + " is not found in Tree"); // O (1)
	}

	// Insert Method
//	void insert(String value) {
//		BinaryNode newNode = new BinaryNode();
//		newNode.value = value;
//		if (root == null) {
//			root = newNode;
//			System.out.println("Inserted new node at root");
//			return;
//		}
//		
//		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
//		queue.add(root);
//		
//		while(!queue.isEmpty()) {
//			BinaryNode presentNode = queue.remove();
//			
//			System.out.println(  " the present node "+ presentNode.value);
//			
//			if (presentNode.left == null) {
//				presentNode.left = newNode;
//				System.out.println("Successfully Inserted (Left)");
//				break;
//			}
//			else {
//				queue.add(presentNode.left);
//			}
//			 if (presentNode.right == null) {
//				presentNode.right = newNode;
//				System.out.println("Successfully Inserted (Right)");
//				break;
//			}else {
//			//	queue.add(presentNode.left);
//				queue.add(presentNode.right);
//			}
//		}

	void insert(String value) {
		BinaryNode newNode = new BinaryNode();
		newNode.value = value;
		if (root == null) {
			root = newNode;
			System.out.println("Inserted new node at root");
			return;
		}

		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);

		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();

			System.out.println(" the present node " + presentNode.value);

			if (presentNode.left == null) {
				presentNode.left = newNode;
				System.out.println("Successfully Inserted (Left)" + presentNode.value);
				break;
			} else if (presentNode.right == null) {
				presentNode.right = newNode;
				System.out.println("Successfully Inserted Right" + presentNode.value);
				break;
			} else {
				System.out.println(" I Have reached to this zone");
				queue.add(presentNode.left);
				queue.add(presentNode.right);
			}
		}
	}
	
	// get deepest node
	public BinaryNode getDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode presentNode = null;
		while (!queue.isEmpty()) {
			presentNode = queue.remove();
			
			if (presentNode.left!= null) {
				queue.add(presentNode.left);
			}
			if(presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
		return presentNode;
	}
	
	public void  deleteDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		
		BinaryNode previousNode,presentNode = null;
		while (!queue.isEmpty()) {
			previousNode = presentNode;
			presentNode = queue.remove();
			
			if (presentNode.left == null) {
				previousNode.right = null;
				return;
			}else if (presentNode.right == null) {
				presentNode.left = null;
				return;
			}
			queue.add(presentNode.left);
			queue.add(presentNode.right);
		}
	}
	
	// delete given node
	void deleteNode(String value) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			
			if (presentNode.value == value) {
				presentNode.value = getDeepestNode().value;
				deleteDeepestNode();
				System.out.println("The node is deleted!");
				return;
			}else {
				if ( presentNode.left != null) queue.add(presentNode.left);
				if ( presentNode.right != null) queue.add(presentNode.right);
			}
		}
		
		System.out.println("The node does not exist in the binary tree");
	}
}
