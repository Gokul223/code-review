package job.guarantee.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseMethods {

	@BeforeMethod
	@Parameters({"wait", "browser"})
	public void preCondition(@Optional("30") String wait, @Optional("Safari") String browserName) {
		System.out.println("Execute in "+ browserName+" browser");
	}
	
	public void postCondition() {
		
	}
	
}
