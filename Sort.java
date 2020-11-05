package Arraylist;

import java.util.ArrayList;

public class Sort {
	ArrayList<Number> list=new ArrayList<>();
	
	public Sort() {}
	public Sort(ArrayList<Number> list) {
		this.list=list;
	}
	public static void sort(ArrayList<Number> list) {

		for (int i=list.size()-1; i>=0; i--) {
			for (int j=0;j<i;j++) {
				if (list.get(j).doubleValue()<list.get(j+1).doubleValue()) {
					int index=j;
					Number temp=list.get(j);
					list.set(index, list.get(j+1));
					list.set(j+1, temp);		
				}
			}
		}	
	}
}
