package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.*;

import java.time.Duration;

public class OrangeHRMTest {
    WebDriver driver;
    LoginPage loginPage;
    DashboardPage dashboardPage;
    PIMPage pimPage;
    AddEmployeePage addEmployeePage;

    String[][] employees = {
        {"John", "Doe"},
        {"Alice", "Smith"},
        {"Bob", "Johnson"}
    };

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe"); // Change path
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        pimPage = new PIMPage(driver);
        addEmployeePage = new AddEmployeePage(driver);
    }

    @Test
    public void testAddEmployees() throws InterruptedException {
        loginPage.login("Admin", "admin123");
        dashboardPage.goToPIM();

        for (String[] emp : employees) {
            pimPage.clickAddEmployee();
            addEmployeePage.addEmployee(emp[0], emp[1]);
            Thread.sleep(2000); // wait to save
            dashboardPage.goToPIM(); // return to PIM
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
