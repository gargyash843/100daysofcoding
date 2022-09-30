package arraydsa;

public class reversearray {
	void reverse(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nreverse of array");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int array[] = {12,34,543,54,34};
		int n= array.length;
		reversearray a = new reversearray();
		a.reverse(array);
	}
}
