package arraydsa;
import java.util.Scanner;
public class maxisubarray {
	void maxsubarray(int array[]) {
		int currentsum =0;
		int maxisum =0;
		
		for(int i=0;i<array.length;i++) {
			currentsum = currentsum + array[i];
			// we compare if currentsum is grather than maxisum than maxisum= currentsum
			if(currentsum>maxisum) {
				maxisum = currentsum;
			}
			// if current sum is less than zero then we do currentsum =0
			if(currentsum<0) {
				currentsum =0;
			}
		}
		System.out.println(maxisum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many values you want to take");
		int a = sc.nextInt();
		System.out.println("Enter values");
		int array[] = new int[a];
		for(int i=0;i<a;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("array is : ");
		for(int i=0;i<a;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\nmaximum subarray");
		maxisubarray ob = new maxisubarray();
		ob.maxsubarray(array);
	}

}
