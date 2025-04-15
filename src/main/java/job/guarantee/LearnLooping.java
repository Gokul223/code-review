package job.guarantee;

public class LearnLooping {

	public static void main(String[] args) {
		
		// i++ / ++i -> i=i+1 , i++ -> it will use the variable first then increment
		//++i --> it will increment first and then it will use
		//for(initalize; condition; increment/decrement){}
		for(int i=0; i<8; i++) {
			
		}
		
		int i = 0;
		while(i<8) {
			System.out.println(++i);
		}
		byte a = -128;// -128 to 127
		char b =65;
		System.out.println(b);
		a= (byte) (a-1);
		System.out.println(a);
	}
	
	
}
