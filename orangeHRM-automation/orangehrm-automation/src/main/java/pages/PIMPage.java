package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage {
    WebDriver driver;

    By addEmployeeBtn = By.xpath("//a[text()='Add Employee']");
    By employeeList = By.xpath("//a[text()='Employee List']");

    public PIMPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddEmployee() {
        driver.findElement(addEmployeeBtn).click();
    }

    public void goToEmployeeList() {
        driver.findElement(employeeList).click();
    }
}
