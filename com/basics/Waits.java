package com.basics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebElement options= driver.findElement(By.
		xpath("//select[@id='fruits']"));
		
		Select selectobj = new Select(options);
		
		selectobj.selectByVisibleText("Apple");*/
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='fruits']")));
element.click();
	}

}
