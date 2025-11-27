package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DashboardPage {
    WebDriver driver;

    By pimMenu = By.xpath("//span[text()='PIM']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPIM() {
        WebElement pim = driver.findElement(pimMenu);
        new Actions(driver).moveToElement(pim).click().perform();
    }
}
