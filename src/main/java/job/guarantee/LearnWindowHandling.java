package job.guarantee;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {
	static ChromeDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.name("j_idt88:j_idt93")).click();
		swtichWindow("Alert");
		/*
		 * List<String> windows = new ArrayList<String>(windowHandles);
		 * System.out.println(driver.getWindowHandle());
		 * System.out.println(windowHandles); driver.switchTo().window(windows.get(3));
		 */
		
		
		

		System.out.println(driver.getTitle());

	
		
		driver.quit();
	}
	
	private static void swtichWindow(String windowHandle) {
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windowAddress: windowHandles ) {
			driver.switchTo().window(windowAddress);
			if(driver.getTitle().contains(windowHandle)) {
				break;
			}
			
		}
	}
	
	private void click(WebElement element) {
		if((element.isDisplayed())&&(element.isEnabled())) {
			element.click();
		}else {
		driver.executeScript("arguments[0].click()", element);
		}
	}
	
}
