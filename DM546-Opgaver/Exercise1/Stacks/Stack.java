package Exercise1.Stacks;

import java.util.ArrayList;

public class Stack<E> implements IStack<E>{

	private final ArrayList<E> stack;
	public Stack() {
		stack = new ArrayList<E>();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public int size() {
		return stack.size();
	}

	public void push(E item) {
		stack.add(item);
	}

	public E top() {
		return stack.getLast();
	}

	public void pop() {
		stack.removeLast();
	}
}
