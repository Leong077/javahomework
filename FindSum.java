import java.util.Scanner;

public class FindSum {
	
	public static double sumMajorDiagonal(double[][] m) {
		double sum=0;
		for (int i=0;i<4;i++) 
			for (int j=0;j<4;j++) 
				if (i==j) {
					sum+=m[i][j];
				}		
		return sum;   
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a 4-by-4 matrix by row: ");
		Scanner input = new Scanner(System.in);
		double[][] M=new double[4][4];
		for(int i=0; i<M.length; i++) {
			for(int j=0; j<M.length; j++) {
				M[i][j] = input.nextDouble();
			}
		}
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(M));
		input.close();
	}
}
