package Exercise1.Stacks;

import java.util.HashMap;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		HashMap<Character, Character> brackets = new HashMap<>();
		brackets.put(')', '(');
		brackets.put('}', '{');
		brackets.put(']', '[');

		Stack<Character> stack = new Stack<>();

		String expression = "({[(a+b)]}*c)";
		for (char c : expression.toCharArray()) {
			if (brackets.containsValue(c)) {
				stack.push(c);
			} else if (brackets.containsKey(c)) {
				if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
					System.out.println("Unbalanced");
					return;
				}
			}
		}

		if (!stack.isEmpty()) {
			System.out.println("Unbalanced");
		} else {
			System.out.println("Balanced");
		}
	}
}