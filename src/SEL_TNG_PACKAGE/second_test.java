package SEL_TNG_PACKAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class second_test {

    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method - Launching Browser");
        driver = new ChromeDriver();
        
    }

    @Test(priority = 1)
    public void openGoogle() throws InterruptedException {
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        System.out.println("Google Title: " + driver.getTitle());
    }

    @Test(priority = 2)
    public void openSelenium() throws InterruptedException {
        driver.get("https://www.selenium.dev/");
        Thread.sleep(1000);
        System.out.println("Selenium Title: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method - Closing Browser");
        driver.quit();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
}

