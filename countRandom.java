package countRandom;

public class countRandom {

	public static void main(String[] args) {
		int[] list=new int[100];
		int[] counts=new int[10];
		
		for (int i=0; i<100; i++) {
			list[i]=(int)(Math.random() * (9+1));
		}
		
		for (int i:list) {
			counts[i]++;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "出现了：" + counts[i]+ "次。");
		}
	}
}