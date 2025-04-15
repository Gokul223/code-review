package job.guarantee;

public class CheckPrime {

	public static void main(String[] args) {
		CheckPrime  cp = new CheckPrime();
		cp.checkPrimeNumber(123);
		cp.checkPrimeNumber(23);
		cp.checkPrimeNumber(13);
		cp.checkPrimeNumber(17);
		cp.checkPrimeFromRange(10, 30);
}
	
	public void checkPrimeNumber(int input) {
		// declare input to check the prime number
//				int input = 54312;
				// boolean to check the number is prime false
				boolean output = false;
				// iterate from 2 to input-1
				for (int i = 2; i < input; i++) {
					// check the reminder as zero for input by iterated number
					if (input % i == 0) {
						// if reminder as zero change boolean as true and use break to stop iteration
						output = true;
						break;
					}
				}
				// if boolean is false then the number is prime
				if (!output) {
					System.out.println("The number " + input + " is prime number");
				} else {
					System.out.println("The number " + input + " is not a prime number");
				}
			
	}
	
	
	public void checkPrimeFromRange(int startRange, int endRange) {
		
		for (int i = startRange; i <=endRange; i++) {
			checkPrimeNumber(i);
		}
		
	}
	
}
