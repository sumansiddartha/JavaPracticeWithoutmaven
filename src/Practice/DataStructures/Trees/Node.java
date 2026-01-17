package Practice.DataStructures.Trees;

public class Node {
	int data;
	Node rightNode;
	Node leftNode;
	
	
	
	public Node(int data) {
		super();
		this.data = data;
		rightNode=null;
		leftNode=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getRightNode() {
		return rightNode;
	}
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	public Node getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
	
	
	

}
