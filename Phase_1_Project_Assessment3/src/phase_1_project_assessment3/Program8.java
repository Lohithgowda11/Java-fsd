package phase_1_project_assessment3;

public class Program8 {
	private static final int MAX_SIZE = 3;
	private int[] stackArray;
	private int top;

	public Program8() {
		stackArray = new int[MAX_SIZE];
		top = -1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == MAX_SIZE - 1);
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack overflow! Cannot push " + data + " into the stack.");
		} else {
			stackArray[++top] = data;
			System.out.println(data + " pushed into the stack.");
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow! Cannot pop element from the stack.");
			return -1;
		} else {
			int poppedElement = stackArray[top--];
			System.out.println(poppedElement + " popped from the stack.");
			return poppedElement;
		}
	}


	public static void main(String[] args) {
		Program8 stack = new Program8();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		

	}

}

