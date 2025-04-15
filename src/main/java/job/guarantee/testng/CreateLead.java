package job.guarantee.testng;

import org.testng.annotations.Test;

public class CreateLead extends BaseMethods{

	@Test(priority = -1, groups = {"Lead"})
	public void runCreateLead() {
		System.out.println("Create Lead");
//		throw new RuntimeException("Test validation for depends on methods");
	}
	
}
