package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		Sort s = new Sort();

	/*	Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int number = input.nextInt();
		input.close();
		while (number != 0) { // �趨0Ϊ��������
			s.list.add(number);// ���ν�Ԫ�ط���ArrayList��
			}
		Sort.sort(s.list);
		System.out.println("The sorted list is: " + s.list);
		} ʹ�����ַ����ᱨ��*/
		
		s.list.add(8);
		s.list.add(5);
		s.list.add(4);
		s.list.add(7);
		s.list.add(1);
		Sort.sort(s.list);
		for (Number m:s.list) {
			System.out.print(m);
		}
	}		
}
