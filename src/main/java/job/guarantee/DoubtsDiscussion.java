package job.guarantee;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubtsDiscussion {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement tryItBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//		tryItBtn.click();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
		WebElement leadsTab = driver.findElement(By.xpath("//span[text()='Leads']/parent::a"));
		driver.executeScript("arguments[0].click();", leadsTab);
		driver.findElement(By.xpath("//a[@title='New']")).click();
		
		// click on the dropdown and open the list/option to view
		driver.findElement(By.xpath("//button[@aria-label='Salutation']")).click();
		//choose/click the option from the dropdown list/option
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Mr.']")).click();
		
	}
	
	
}
