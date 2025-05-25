package progrmapackage;

import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "listen";
		String s2 = "silent";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		
		
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		if(c1.length != c2.length) {
			System.out.println("Not anagrams");
			return;
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not anagrams");
		}
		

	}

}
