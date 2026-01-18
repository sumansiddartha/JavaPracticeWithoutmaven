package Practice.BinaryTree;

import java.io.PrintStream;

public class BinaryTreePrinter {
	

	private BinaryTreeModel tree;
	
	public BinaryTreePrinter(BinaryTreeModel tree) {
		super();
		this.tree = tree;
	}
	
	
	public void traversePreOrder(StringBuilder sb,String padding,String pointer,BinaryTreeModel node) {
		if(node!=null) {
			sb.append(padding);
			sb.append(pointer);
			sb.append(node.getValue());
			sb.append("\n");
			StringBuilder paddingBuilder=new StringBuilder(padding);
			paddingBuilder.append("| ");
			 String paddingForBoth = paddingBuilder.toString();
			 String pointerforLeft="|--";
			 String pointerForRight=(node.getRight()!=null)?"└──®":"|--";
			traversePreOrder(sb, paddingForBoth,pointerforLeft,node.getLeft());
			traversePreOrder(sb, paddingForBoth,pointerForRight,node.getRight());
		}
		
	}
	public void print(PrintStream os) {
	    StringBuilder sb = new StringBuilder();
	    traversePreOrder(sb,"","", this.tree);
	    os.print(sb.toString());
	}
	
	public static void main(String[] args) {
		BinaryTreeModel root=new BinaryTreeModel("root");
		BinaryTreeModel node1=new BinaryTreeModel("node1");
		BinaryTreeModel node2=new BinaryTreeModel("node2");
		root.setLeft(node1);
		root.setRight(node2);
		BinaryTreeModel node3=new BinaryTreeModel("node3");
		BinaryTreeModel node4=new BinaryTreeModel("node4");
		node1.setLeft(node3);
		node1.setRight(node4);
		BinaryTreeModel node5=new BinaryTreeModel("node5");
		BinaryTreeModel node6=new BinaryTreeModel("node6");
		node2.setLeft(node5);
		node2.setRight(node6);
		BinaryTreeModel node7 = new BinaryTreeModel("node7");
		node3.setLeft(node7);
		node7.setLeft(new BinaryTreeModel("node8"));
		node7.setRight(new BinaryTreeModel("node9"));
		
		new BinaryTreePrinter(root).print(System.out);
		
	}
}
