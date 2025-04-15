package job.guarantee;

public class Iphone16 implements Iphone{

	
	public void makeCall() {
		System.out.println("Hey siri make a call ......");
	}
	
	public void sendMsg() {
		System.out.println("Hey siri send a msg.......");
	}
	
	public void playMusic() {
		System.out.println("Hey siri play some music");
	}
	
	public void openApp(String appName) {
		System.out.println("Hey siri open "+appName);
	}

}
