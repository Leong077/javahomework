import java.util.Scanner;

public class IndexOfSmallestElement {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in); 
	    System.out.print("Enter 10 numbers: ");
	    double[] Array=new double[10];
	    
	    for (int i=0;i<10;i++)
	    	Array[i]=input.nextDouble();
	    
	    System.out.println("��СԪ�ص��±�Ϊ��"+indexOfSmallestElement(Array));
	    
	}
	
	public static int indexOfSmallestElement(double[] array) {
		//�ҳ���Сֵ
		double min=array[0];
		for (int i=0;i<10;i++) {
			if (array[i]<min)
				min=array[i];
		}
		//����Сֵ����
		int minindex=0;
	    for (int i=0; i<10;i++) {
	    	if (array[i]<array[minindex])
	    		minindex=i;
	    }
	    return minindex;
	}
}
