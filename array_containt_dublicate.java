package arraydsa;

public class array_containt_dublicate {
	void dublicate(int array[]) {
		for(int i=1;i<array.length-1;i++) {
			for(int j=0;j<array.length;j++) {
				if(i != j)
				if(array[i]==array[j]) {
					System.out.println("dublicate element is : "+ array[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int array1[] = {73,34,65,34};
		array_containt_dublicate ob = new array_containt_dublicate();
		ob.dublicate(array1);
	}
}
