package job.guarantee;

public class FibonacciSeries {

	public static void main(String[] args) {
		// declare range as 8
		int range = 8;

		// declare initial two value , firstNum = 0, secondNum = 1
		int firstNum = 0, secondNum = 1, thirdNum;
		System.out.println(firstNum + "\n" + secondNum);
		// iterate by using for loop with range
		for (int i = 2; i < range; i++) {
			// add the firstNum and secondNum and store into thirdNum
			thirdNum = firstNum + secondNum;
			System.out.println(thirdNum);
			// swap the secondNum into firstNum and thirdNum into secondNum
			firstNum = secondNum;
			secondNum = thirdNum;

		}
	}

}
