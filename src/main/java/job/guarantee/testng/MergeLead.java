package job.guarantee.testng;

import org.testng.annotations.Test;

public class MergeLead extends BaseMethods{

	@Test(groups = {"Lead"})
	public void runMergeLead() {
		System.out.println("Merge Lead");
	}
	
}
