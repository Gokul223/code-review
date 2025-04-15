package job.guarantee;

public class LearnStatic {
	static int y =10;
	int x = 0;
	final int b =15;
	
	public static void main(String[] args) {
		LearnStatic mahaventhan = new LearnStatic();
		LearnStatic gokul = new LearnStatic();
		mahaventhan.y =7;
//		System.out.println(y);
		System.out.println(gokul.y);
		System.out.println(gokul.b);
//		gokul.getValue();
	}
	
	
	public void getValue() {
		System.out.println(x);
		System.out.println(y);
//		b= 17;
		throw new RuntimeException("test");
	}
	
}
