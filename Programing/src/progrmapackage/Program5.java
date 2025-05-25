package progrmapackage;

import java.util.Arrays;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1,3,7,5,2}
		;
		int count =0;
		
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					count++;
				}
			}
			
			
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);

	}

}
