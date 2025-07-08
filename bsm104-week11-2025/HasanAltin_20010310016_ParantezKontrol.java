import java.util.Stack; 

public class HasanAltin_20010310016_ParantezKontrol {
	
	public static void main(String[] args) { 
		String expr = " "; 
		if (d�zenliMi (expr)) { 
			System.out.println("D�zenli ifade"); 
		} 
		else { 
			System.out.println("D�zenli ifade degil"); 
		} 
	}
	public static boolean d�zenliMi (String expr) { 
		Stack<Character> stack = new Stack<Character>(); 
		for (int i = 0; i < expr.length(); i++) { 
			char x = expr.charAt(i); 
			if (x == '(' || x == '{' || x == '[') { 
				stack.push(x); 
				continue; 
			} 
			if (stack.isEmpty()) { 
				return false; 
			} 
			char check; 
			switch (x) { 
			case ')': 
				check = stack.pop(); 
				if (check == '[' || check == '{') 
					return false; 
				break; 
			case ']': 
				check = stack.pop(); 
				if (check == '(' || check == '{') 
					return false; 
				break; 
			case '}': 
				check = stack.pop(); 
				if (check == '('|| check == '[') 
					return false; 
				break; 
			} 
		} 
		return stack.isEmpty();
		}
	}

