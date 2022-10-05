import java.util.Scanner;
public class addmatrix {
	 public static void main(String args[]) {
		 int a[][] = {{12,32,32},{32,43,65}};
		 int b[][] = {{21,32,66},{2,54,78}};
		 int c[][] = new int[2][3];
		 for(int i=0;i<2;i++) {
			 for(int j=0;j<3;j++) {
				 c[i][j] = a[i][j]+b[i][j];
				 System.out.print(c[i][j] + " ");
			 }
			 System.out.println();
		 }
	 }

}
