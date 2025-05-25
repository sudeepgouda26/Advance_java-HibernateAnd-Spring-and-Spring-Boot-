package progrmapackage;

public class Program4 {


		// TODO Auto-generated method stub
		static int countPairs(int[] arr, int k) {
	       
		   int count = 0;

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] + arr[j] == k) {
	                    count++;
	                }
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 5, 7, 5,4,2};
	        int k = 6;
	        System.out.println("paisr" + countPairs(arr, k));

	}

}
