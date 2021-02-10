import java.util.Stack;

public class BalancedBrackets {
	public static void balanced(String str) {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			// if the character is { or ( or [ push into stack
			if (c == '{' || c == '(' || c == '[') {
				st.push(c);
			} else {
				// if stack is empty
				if (st.isEmpty()) {
					System.out.println("not balanced");
				} else {
					// check if character is any closing bracket and top element in stack is
					// other pair of it then it is balanced bracket
					char popele = st.pop();
					if (c == '}' && popele == '{') {
						// System.out.println(" balanced");
					} else if (c == ')' && popele == '(') {
						// System.out.println("balanced");
					} else if (c == ']' && popele == '[') {
						// System.out.println("balanced");
					}
				}
			}

		}
		if (st.isEmpty()) {
			System.out.println("balanced");

		} else {
			System.out.println("not balanced");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{[()]}";
		balanced(s);
	}

}
