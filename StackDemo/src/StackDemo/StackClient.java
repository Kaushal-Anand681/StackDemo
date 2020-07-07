package StackDemo;

public class StackClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.peek();
		stack.display();
		stack.pop();
		stack.pop();
		stack.display();

	}

}
