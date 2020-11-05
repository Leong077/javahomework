package getDate;
import java.util.Date;

public class getDate {

	public static void main(String[] args) {
		long t = 10000; //设置流逝时间
		java.util.Date date=new java.util.Date(t);
		for (int i=0;i<8;i++) {
			date.setTime(t);
			printDate(t,date);
			t*=10;	
		}
	}
	
	public static void printDate(long t,Date date) {	
		System.out.println(t + " : " +date.toString());
	}
}
