package week2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/login");
	}

}
