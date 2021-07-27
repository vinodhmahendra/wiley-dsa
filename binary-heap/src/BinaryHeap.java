
public class BinaryHeap {
	
	int arr[];
	int sizeOfTree;
	
	public BinaryHeap (int size) {
		arr = new int [size+1];
		this.sizeOfTree =0 ;
		System.out.println("binary heap has been created");
	}

	public boolean  isEmpty() { // O(1)
		if (sizeOfTree == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public Integer peek() {
		if (isEmpty()) {
			System.out.println("Binary Heap Is Empty");
			return null;
		}
		return arr[1]; // return root element
	}

	public int sizeOfBH() {
		return sizeOfTree;
	}
	
	
	public void levelOrder() {
		for (int i = 1; i <= sizeOfTree ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}
}


