package progrmapackage;

public class Program2 {
	static boolean isBalanced(String s) {
		boolean isBalanced = true;
		char[] c = s.toCharArray();
		int start =0;
		int end =c.length-1;
		
		while(start<end) {
			
		if(c[start] == '{' && c[end] == '}') {
				start++;
				end--;
			} else if(c[start] == '[' && c[end] == ']') {
				start++;
				end--;
			} else if(c[start] == '(' && c[end] == ')') {
				start++;
				end--;
			} else {
				isBalanced = false;
				break;
			}
		}
		return isBalanced;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "{[()]}";
		String s2 = "{[(])}";
               System.out.println(isBalanced(s1));
               System.out.println(isBalanced(s2));
    			
	}

}
