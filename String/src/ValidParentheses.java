import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args){
		String s1 = " ";
		String s2 = "(){[]}";
		String s3 = "({)[]}";
		boolean res1 = isValid(s1);
		boolean res2 = isValid(s2);
		boolean res3 = isValid(s3);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}

	public static boolean isValid(String s){
		if (s == null || s.length() % 2 == 1)
			return false;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{')
				stack.push(c);
			else{
				if (stack.isEmpty())
					return false;
				else if (c == ')' && stack.pop() != '(')
					return false;
				else if (c == ']' && stack.pop() != '[')
					return false;
				else if (c == '}' && stack.pop() != '{')
					return false;
			}
		}
		return stack.isEmpty();
	}
}
