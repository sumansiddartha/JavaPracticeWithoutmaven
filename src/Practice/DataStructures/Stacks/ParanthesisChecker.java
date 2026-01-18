package Practice.DataStructures.Stacks;

import java.util.Stack;

public class ParanthesisChecker {
	public static boolean isExpressionBalanced(String expression) {
		Stack<Character> stack=new Stack();
		for(int i=0;i<expression.length();i++) {
			char ch=expression.charAt(i);
			if(ch=='{'||ch=='['||ch=='(') {
				
				stack.push(ch);
			}
			else if(ch=='}'||ch==']'||ch==')') {
				System.out.println(stack);
			
				if(stack.isEmpty()) {
					return true;
				}
				char top=(char)stack.pop();
				if(!isMatching(top,ch)) {
					return false;
				}
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static boolean isMatching(char open,char close) {
		if(open=='{'&&close=='}') {
			return true;
		}
		else if(open=='['&&close==']') {
			return true;
		}
		else if(open=='('&&close==')') {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		String exp="{hadfssk[]9()}{jhjdfsa}";
		System.out.println(isExpressionBalanced(exp));
		
	}

}
