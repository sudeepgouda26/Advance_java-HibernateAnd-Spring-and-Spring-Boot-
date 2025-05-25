package progrmapackage;

public class Program3 {
	public static void main(String[] args) {
		String s1 ="aabcccccaaa";
		char[] c = s1.toCharArray();
	
	   

        int count = 1; 
        for (int i = 1; i <= c.length; i++) {
            if (i < c.length && c[i] == c[i - 1]) {
                count++; 
            } else {
                System.out.print(c[i - 1] + "=" + count + " "); 
                count = 1; 
            }
        }
	}
}
