package Practice.DataStructures.Stacks;

public class StackPracticeMain {
	static int top=-1;
	
	
	static void push(int stack[],int element,int size) {
		if(top==size-1) {
			System.out.println("Stack is full");
			return;
		}
		top=top+1;
		stack[top]=element;
	}
	static int size ( )
    {
        return top + 1;
    }
	static boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	static int topElement(int stack[]) {
		return stack[top];
	}
	static int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty cannot remove any element");
			return -1;
		}
		return top=top-1;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int stack[]=new int[3];
		 push(stack , 5 , stack.length ) ;
		 System.out.println(stack[0]);
		 System.out.println("This is size::::"+size());
		 push(stack , 10 , stack.length ) ;
		 push(stack , 15 , stack.length ) ;
		 System.out.println("This is size::::"+size());
		 push(stack , 11 , stack.length ) ;
		 
		 System.out.println("::This is top element in stack:::"+topElement(stack));
		 System.out.println("::This is top element in stack:::"+pop());
		 System.out.println("::This is pop element in stack:::"+pop());
		 System.out.println("This is size::::"+size());
		
	}
	
	
}
