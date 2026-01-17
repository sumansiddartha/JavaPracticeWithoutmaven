package Practice.DataStructures.Trees;

public class TreeTester {

	public static void main(String[] args) {
		Node root=new Node(1);
		root.leftNode=new Node(2);
		root.rightNode=new Node(3);
		root.rightNode.leftNode = new Node(5);
   System.out.println(root);
	}

}
