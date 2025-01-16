package job.guarantee;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		//declare the number to check prime
		 int num =13;
		 
		 //declare boolean value --> false
		 boolean flag = false;
		 
		 //iterate from 2 to less than the number
		 for(int i=2; i<num; i++){
			// check the number is not divisible other than 1 and itself 
				if(num%i == 0){
				// if it is divisible the change the boolean value as true and break the loop
					flag = true;
					break;
					}
			}	
		// if the boolean is equal to false then the number is prime number
			if(flag==false){
			System.out.println("The number "+num+" is prime");
			}else{
			System.out.println("The number "+num+" is not prime");
			}
	}

}
