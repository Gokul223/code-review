package job.guarantee;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] nums = {2,1,4,3,7,10,9};
		Arrays.sort(nums); //[1,2,3,4,7,9,10]
		int j=0;
		for(int i=0; i<nums.length; i++){
			if(!(nums[i]== (i+nums[j]) )){
				System.out.println((i+nums[j]));
				i--;
				j++;
			}
		}

	
	}

}
