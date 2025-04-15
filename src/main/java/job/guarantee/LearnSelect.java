package job.guarantee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelect {

	
	public static void main(String[] args) {
		//datatype variable = value;
		ChromeDriver driver = new ChromeDriver();
		WebElement element = driver.findElement(By.tagName("select"));
		Select dd = new Select(element);
		dd.selectByIndex(0);
		dd.getOptions();
		
	}
	
}
