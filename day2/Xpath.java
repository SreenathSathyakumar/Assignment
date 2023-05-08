package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
        driver.findElement(By.xpath("//a[contains(text(),CRM)]")).click();
        driver.findElement(By.xpath("//a[text()='Leads']")).click();

	}

}
