package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_dowm {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps");
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).submit();
        System.out.println(driver.getTitle());
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sreenath");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
        WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select obj = new Select(findElement);
        obj.selectByIndex(4);
        
        
        WebElement findElement2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select obj1 = new Select(findElement2);
        obj1.selectByVisibleText("Automobile");
        
        WebElement findElement3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select obj2 = new Select(findElement3);
        obj2.selectByValue("OWN_CCORP");
        
        driver.findElement(By.className("smallSubmit")).submit();
	}

	}


