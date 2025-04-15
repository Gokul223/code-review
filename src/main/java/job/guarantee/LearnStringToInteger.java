package job.guarantee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnStringToInteger {

	public static void main(String[] args) {
		String price = "$ 23,000";
		price = price.replaceAll("[^0-9]", "");
		System.out.println(price);
		int priceInInt = Integer.parseInt(price);
		System.out.println(priceInInt);
		
		String[] prices = {"2,000", "500", "1750", "25"};
		Arrays.sort(prices);
		String string = Arrays.toString(prices);
		System.out.println(string);
		
		List<Integer> pricesInNumber = new ArrayList<Integer>();
		for(int i=0; i< prices.length; i++) {
			String priceStr = prices[i].replaceAll("[^0-9]", "");
			int priceInNumber = Integer.parseInt(priceStr);
			pricesInNumber.add(priceInNumber);
		}
		
		System.out.println("Before sort : "+pricesInNumber);
		
		Collections.sort(pricesInNumber);
		
		System.out.println("After sort : "+pricesInNumber);
		
	}

}
