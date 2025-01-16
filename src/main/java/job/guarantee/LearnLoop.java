package job.guarantee;

public class LearnLoop {

	public static void main(String[] args) {
		boolean flag = true;
		for(int i=0; flag; i++) {
			if(i>5) {
				flag = false;
			}
			System.out.println("For loop");
		}
		
		flag = true;
		int x =0;
		while(flag) {
			x++;
			if(x==2) {
				flag = false;
			}
			System.out.println("while");
		}
		
	}

}
