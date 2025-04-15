package job.guarantee;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnNavigation {

	
	public static void main(String[] args) {
		
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
//		driver.navigate().to("https://login.salesforce.com");
//		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
//		driver.findElement(By.id("password")).sendKeys("Leaf@123");
//		driver.findElement(By.id("Login")).click();
//		driver.navigate().back();
//		
//		Select dd = new Select (driver.findElement(By.tagName("Select")));
//		List<WebElement> options = dd.getOptions();
		
		WebElement loginForm = driver.findElement(By.id("content"));
		
		loginForm.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com","test", Keys.ENTER);
		loginForm.findElement(By.id("password")).sendKeys();
		loginForm.findElement(By.id("Login")).click();
	}
	
	
}
