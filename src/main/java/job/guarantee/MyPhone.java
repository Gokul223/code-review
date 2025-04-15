package job.guarantee;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyPhone {

	public static void main(String[] args) {
		Iphone16 ph = new Iphone16();
		ph.makeCall();
		ph.sendMsg();
		ph.playMusic();
		ph.openApp("whatsapp");
		System.out.println("---------------------------");
		
		Iphone phone = new Iphone16();
		phone.makeCall();
		phone.sendMsg();
//		phone.playMusic();
//		List<Integer> nums = new
		RemoteWebDriver driver = new ChromeDriver();
//		driver.getS
		long num = 5;
		
	}
	
}
