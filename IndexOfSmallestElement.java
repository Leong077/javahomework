import java.util.Scanner;

public class IndexOfSmallestElement {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in); 
	    System.out.print("Enter 10 numbers: ");
	    double[] Array=new double[10];
	    
	    for (int i=0;i<10;i++)
	    	Array[i]=input.nextDouble();
	    
	    System.out.println("最小元素的下标为："+indexOfSmallestElement(Array));
	    
	}
	
	public static int indexOfSmallestElement(double[] array) {
		//找出最小值
		double min=array[0];
		for (int i=0;i<10;i++) {
			if (array[i]<min)
				min=array[i];
		}
		//求最小值索引
		int minindex=0;
	    for (int i=0; i<10;i++) {
	    	if (array[i]<array[minindex])
	    		minindex=i;
	    }
	    return minindex;
	}
}
