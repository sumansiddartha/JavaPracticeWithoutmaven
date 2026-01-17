package Practice.DataStructures.LinkedList;

public class LinkedList {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			
			this.data = data;
			next=null;
		}
		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
		
		
	}
	public static void push(int newData) {
//		LinkedList llist=new LinkedList();
		Node newNode=new Node(newData);
		newNode.next=head;
		head=newNode;
		
	}
	
	
	public static void insertAfter(Node previousNode,int newData) {
		if(previousNode==null) {
			System.out.println("previous node cannot be null");
			return ;
		}
		//Allocate the node and put the data
		Node new_node=new Node(newData);
		
		//make the next of previous node to next of new  node
		new_node.next=previousNode.next;
		//make the new node next of previous node
		previousNode.next=new_node;
	}
	
	public void append(int newData) {
		/*******Append a new node at the end of the linked list*************/
	//allocate the node and put the data
		Node newNode=new Node(newData);
		//If linked list is empty
		if(head==null) {
			head=newNode;
			return ;
		}
		newNode.next=null;
		Node last=head;
		while(last.next!=null) {
			last=last.next;
			last.next.next=newNode;
			return;
		}
	
	
	}
	
	public void deleteNode(int key) {
//		Store the head node
		Node temp=head;
		Node prev=null;
//		if node itself holds the key to be deleted
		if(temp!=null && temp.data==key) {
			head=temp.next;
			return ;
		}
//		Search for the key to be deleted
		while(temp!=null && temp.data!=key) {
			prev=temp;
			temp=temp.next;
		}
		if(temp==null) return;
//		unlink the node from the linked list
		prev.next=temp.next;
	}
	public void printList() {
		Node pNode=head;
		while(pNode!=null) {
			System.out.println(pNode.data+" ");
		pNode=pNode.next;
		}
	}
	@Override
	public String toString() {
		return "LinkedList [head=" + head + "]";
	}

	public static void main(String[] args) {
		LinkedList llist=new LinkedList();
//		llist.head=new Node(1);
//		 Node second=new Node(2);
//		 Node third=new Node(3);
//		 llist.head.next=second;
//		 second.next=third;
//		 third.next=null;
//		 llist.push(5);
		 llist.append(6);
		 llist.push(7);
		 llist.push(1);
		 llist.push(3);
		 llist.push(2);
//		 llist.append(4);
//		 llist.insertAfter(llist.head.next, 8);
		 llist.printList();
		 System.out.println("--------------------");
		 llist.deleteNode(3);
		 llist.printList();
		
	}

}
