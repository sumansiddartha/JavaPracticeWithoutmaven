package Practice.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeMain {
public static Node root;

private static Node addRecursive(Node current,int value) {
	
	if(current==null) {
		return new Node(value);
	}
	if(value<current.value) {
		current.left=addRecursive(current.left, value);
	}else if(value>current.value) {
		current.right=addRecursive(current.right, value);
	}else {
		return current;
	}
	
	
	return current;
}
public static void add(int value) {
	
	root=addRecursive(root, value);
	
	
}

private static BinaryTreeMain createBinaryTree() {
	BinaryTreeMain bt=new BinaryTreeMain();
	bt.add(6);
	bt.add(4);
	bt.add(8);
	bt.add(3);
	bt.add(5);
	bt.add(7);
	bt.add(9);
	
	return bt;
}
private static boolean containsNodeRecursive(Node current,int value) {
	if(current==null) {
		return false;
	}
	if(value==current.value) {
		return true;
	}
	return value<current.value?containsNodeRecursive(current.left, value):containsNodeRecursive(current.right, value);
}
public static boolean containsNode(int value) {
	return containsNodeRecursive(root, value);
}


private static Node deleteRecursive(Node current,int value) {
	if(current==null) {
		return null;
	}
	if(value==current.value) {
		if(current.left==null && current.right==null) {
			return null;
		}
		if(current.left==null) {
			return current.left;
		}
		if(current.right==null) {
			return current.right;
		}
		int smallestValue=smallestValue(current.right);
		 current.value = smallestValue;
         current.right = deleteRecursive(current.right, smallestValue);
         return current;
	}
	if(value<current.value) {
		current.left=deleteRecursive(current.left, value);
		return current;
	}
	current.right=deleteRecursive(current.right, value);
	return current;
}
public static void delete(int value) {
	root=deleteRecursive(root, value);
}
private static int smallestValue(Node root) {
	return root.left==null?root.value:smallestValue(root.left);
}


private static void printInOrder(Node node) {
    if (node != null) {
        printInOrder(node.left);
        System.out.print(node.value + " ");
        printInOrder(node.right);
    }
}

public static void traverseLevelOrder() {
	if(root==null) {
		return;
	}
	Queue<Node> nodes=new LinkedList<>();
	nodes.add(root);
	while(!nodes.isEmpty()) {
		Node node=nodes.remove();
		System.out.print(node.value + " "); 
		if(node.left!=null) {
			nodes.add(node.left);
		}
		if(node.right!=null) {
			nodes.add(node.right);
		}
	}
}
public static void main(String[] args) {
	BinaryTreeMain createBinaryTree = createBinaryTree();
//	System.out.println(createBinaryTree.containsNode(9));
//	createBinaryTree.delete(9);
//	System.out.println(createBinaryTree.containsNode(9));
	createBinaryTree.traverseLevelOrder();
	
}
}
