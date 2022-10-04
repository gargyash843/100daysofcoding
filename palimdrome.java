package arraydsa;
import java.util.*;
import java.lang.*;
public class palimdrome {
// check given array is palindrome or not 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements in array");
		int n = sc.nextInt();
		System.out.println("enter values");
		int array[] = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("array is : ");
		for(int i=0;i<n;i++) {
			System.out.print(array[i] + " ");
		}
		int flag =0;
		for(int i=0;i<n/2;i++) {
			if(array[i] != array[n-1-i]) {
				flag =1;
				break;
			}
		}
		if(flag ==1) {
			System.out.println("\nthis is not palindrome");
		}
		else {
			System.out.println("\nthis is palindrome");
		}
	}

}
