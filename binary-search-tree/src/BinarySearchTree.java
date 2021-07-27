import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	BinaryNode root;
	
	public BinarySearchTree() {
		root = null; // O (1)
	}
	
	//insert method
	private BinaryNode insert(BinaryNode currentNode, int value) {
		if ( currentNode == null) { //O(1)
			BinaryNode newNode = new BinaryNode(); //root
			newNode.value = value;
			//System.out.println("the value successfully inserted");
			return newNode;
		}else if (value <= currentNode.value) {
			currentNode.left = insert(currentNode.left, value); // O(N/2)
			return currentNode;
		}else {
			currentNode.right = insert(currentNode.right, value); //O(N/2)
			return currentNode;
		}
	}
	
	void insert(int value) {
		root = insert(root,value);
	}
	
	// pre -order traversal  root-> left subtree -> right -subtree
	public void preOrder(BinaryNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	//InOrder- Traversal  LeftSubtree --> Root Node --- > Right Subtree
	public void InOrder(BinaryNode node) {
		if ( node == null) {
			return ;
		}
		InOrder(node.left);
		System.out.print(node.value + " ");
		InOrder(node.right);
	}
	
	//PostOrder -Traversal Left SubTree -- > Right Subtree --- > Root Node
	public void postOrder(BinaryNode node) {
		if  (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value + " ");
		
	}
	
	void levelOrder() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (! queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.print( presentNode.value + " ");
			if (presentNode.left != null) {
				queue.add(presentNode.left);
			}
			if (presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
	}
	
	BinaryNode search (BinaryNode node, int value) {
		if (node == null) { // O (1)
			System.out.println("value : "  + value + " not found in BST");
			return null;
		}else if (node.value == value) { // O (1)
			System.out.println("value " + value +" found in BST");
			return node;
		}else if ( value < node.value) {
			return search(node.left,value); // O (N/2)
		}else {
			return search(node.right,value); // O ( N/2)
		}
	}
	
	// find the minimum node
	public static BinaryNode miniumNode(BinaryNode root) {
		if (root.left == null) {
			return root;
		}else {
			return miniumNode(root.left);
		}
	}
	
	// delete node 
	public BinaryNode deleteNode(BinaryNode root ,int value) {
		 if ( root == null) {
			 System.out.println("value not found in BST"); // O (1)
			 return null;
		 }
		 if  ( value < root.value) {
			 root.left = deleteNode(root.left, value); // O ( N/2)  // Your  Answer O ( Log N) 
		 }else if  ( value > root.value) {
			 root.right = deleteNode(root.right, value); // O ( N/2)  //Your  Answer O ( Log N)
		 }else {
			 if ( root.left != null && root.right != null) { // O (1)
				 BinaryNode temp = root; // O (1)
				 BinaryNode minNodeForRight = miniumNode(temp.right); // O (LogN)
				 root.value = minNodeForRight.value; // O (1)
				 root.right = deleteNode(root.right, minNodeForRight.value);  // O (N/2)
			 }else if ( root.left != null) {
				 root = root.left;// O (1)
			 }else if (root.right != null) {
				 root = root.right;// O (1)
			 }else {
				 root = null; // O (1)
			 }
		 }
		 return root;
	}
	
	public void deleteBST () {
		root = null;
		System.out.println("BST has been deleted successfully");
	}
	
}
