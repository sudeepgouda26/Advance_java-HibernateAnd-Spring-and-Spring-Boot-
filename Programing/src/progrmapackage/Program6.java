package progrmapackage;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hellohowareyou";
        char[] c = str.toCharArray();
        int max = 0;

        for (int start = 0; start < c.length; start++) {
            boolean[] visited = new boolean[256]; 
            int count = 0;

            for (int end = start; end < c.length; end++) {
                if (!visited[c[end]]) {
                    visited[c[end]] = true;
                    count++;
                    max = Math.max(max, count);
                } else {
                    break; 
                }
            }
        }

        System.out.println(max);
		
		
	}
}
