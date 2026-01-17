package Practice.Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

import javax.sound.midi.Soundbank;

public class DqueuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] srray=new int[10];
		srray[0]=10;
		srray[1]=0;
		System.out.println(srray);
		System.out.println(srray[0]);
		System.out.println(srray[1]);
		Deque<String> stack = new ArrayDeque<>();
		stack.push("first");
	    stack.push("second");
	    System.out.println(stack);
	    
	    System.out.println("=================================");
	    
	    System.out.println(stack.offer("tenth"));
	    System.out.println(stack);
	    System.out.println(stack.poll());
	    System.out.println(stack);
	    System.out.println(stack.getFirst().equals("second"));
	    System.out.println(stack.pop().equals("second"));
	    System.out.println(stack);
	    Stack<String> stackDs=new Stack<>();
	    stackDs.push("suman");
	    stackDs.push("Nikhil");
	    stackDs.push("subash");
	    stackDs.push("srinivas");
	    stackDs.insertElementAt("suman1", 3);
	    System.out.println("======"+stackDs);
	    System.out.println(stackDs.pop());
	    System.out.println("======"+stackDs);
	    System.out.println(stackDs.peek());
	    System.out.println("======"+stackDs);
	    System.out.println(stackDs.search("Nikhil"));
	    System.out.println(stackDs);
	    
	   
	    
	    
	    
	    
	    
	    Deque<String> queue = new ArrayDeque<>();
	    queue.offer("first111");
	    queue.offer("first");
	    queue.offer("second");
	    System.out.println("This is queue::"+queue);
	    System.out.println(queue.poll());
	    StringBuilder string=new StringBuilder();
	    string.append(queue);
	    System.out.println("This is newely formed string "+string);
	    
	   
	    
	}

}
