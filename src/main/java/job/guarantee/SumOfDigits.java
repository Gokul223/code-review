package job.guarantee;

public class SumOfDigits {

	public static void main(String[] args){
		//initialze the variable input , output
		int input = 5671, output=0, expectedOutput=18;
		
		 // iterate the number
		 for(int i=input; i>0; i=i/10){
		 // get the last number 
		 int rem = i%10;
		 // add the last number and  output, then store it into output
		 output = output+rem;
		 }
		 // verify the output
		 if(expectedOutput == output){
			System.out.println("The Sum of Digits for input "+input+" is verified as expected");
		 }else{
			System.out.println("The Sum of Digits for input "+input+" is failed to verified as expected");
		 }
	
	}
	
}
