package job.guarantee.testng;

import org.testng.annotations.Test;

public class EditLead extends BaseMethods{

	@Test(groups = {"editLead"} , dependsOnGroups = {"Lead"})
	public void runEditLead() {
		System.out.println("Edit Lead");
	}
	
}
