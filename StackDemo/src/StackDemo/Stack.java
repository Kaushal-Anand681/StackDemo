package StackDemo;

public class Stack {
	protected int[] data;
	protected int tos;

	public Stack() {
		this.data = new int[5];
		tos = -1;
	}

	public Stack(int cap) {
		this.data = new int[cap];
		tos = -1;
	}

	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Stack is Full");
		}
		tos++;
		data[tos] = item;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int temp = data[tos];
		data[tos] = 0;
		tos--;
		return temp;
	}

	public void peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		System.out.println(data[tos]);
	}

	private int size() {
		return tos + 1;
	}

	private boolean isEmpty() {
		return size()==0;
	}

	private boolean isFull() {
		return size() == data.length;
	}

	public void display() {
		for (int i = 0; i <= tos; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}
