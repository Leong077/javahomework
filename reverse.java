package reversenumber;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
	    System.out.print("Enter an integer: ");
	    int number=input.nextInt();
		reverse(number);
	}
	
	public static void reverse (int number) {
	    int rev=0; //��ʼ����ת�������
	    //ÿ�ζ���������ȡ�࣬���ҳ���10����ѭ��
	    while (number!=0) {
	    	int endn=number%10;
	    	number=number/10;
	    	rev=rev*10+endn; 	
	    }   
	    System.out.println(rev);
	}
}