package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Setup {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://github.com/");

	}

}
