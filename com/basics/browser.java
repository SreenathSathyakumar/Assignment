package com.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://letcode.in/dropdowns");

WebElement options= driver.findElement(By.
		xpath("//select[@id='fruits']"));
		
		Select selectobj = new Select(options);
		
		selectobj.selectByVisibleText("Apple");

   List<WebElement>  listobj =  selectobj.getOptions();
for(WebElement list : listobj) {
	System.out.println(list.getText());
}
	}

}
