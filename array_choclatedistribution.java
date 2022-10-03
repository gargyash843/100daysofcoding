package arraydsa;

import java.util.Arrays;

public class array_choclatedistribution {
	void chocolate(int array[],int n, int m) {
		int min = Integer.MAX_VALUE;
		Arrays.sort(array);
		for(int i=0;i+m-1<n;i++) {
			int diff = array[i+m-1]-array[i];
			if(diff<min) {
				min =diff;
			}
		}
		System.out.println(min);
		
	}
	public static void main(String[] args) {
	  int array[] = {12,7,4,3,9,2,56}; 
	  int n = array.length;
	  int m=3; // number of students for chocolate distribution
	  array_choclatedistribution ob = new array_choclatedistribution();
	  ob.chocolate(array, n, m);
	}
}
