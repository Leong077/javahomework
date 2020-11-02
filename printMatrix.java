package printMatrix;
import java.util.Scanner;

public class printMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
	    System.out.print("Enter: ");
	    int n=input.nextInt();
	    printMatrix(n);
	}
	
	public static void printMatrix(int n) {
		for (int i=0; i<n*n; i++) {
			int num=(int)(Math.random() * (1+1));
			if ((i+1)% n ==0)
				System.out.println(num+" ");
			else
				System.out.print(num+" ");
		}
	}
}
