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
	    int rev=0; //初始化反转后的整数
	    //每次对输入整数取余，并且除以10进入循环
	    while (number!=0) {
	    	int endn=number%10;
	    	number=number/10;
	    	rev=rev*10+endn; 	
	    }   
	    System.out.println(rev);
	}
}