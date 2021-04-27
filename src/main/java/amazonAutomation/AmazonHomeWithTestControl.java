package amazonAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonHomeWithTestControl {

    WebDriver driver = null;

    @BeforeMethod
    public void setUp() {

        // using firefox driver
        //System.setProperty("webdriver.gecko.driver", "/Users/ahmed/intelliJ/SeleniumProject1/driver/geckodriver");

        // using chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/ahmed/intelliJ/SeleniumProject1/driver/chromedriver");

        driver = new ChromeDriver();  //chrome
        //driver = new FirefoxDriver(); // firefox

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com/");  // website address

        driver.manage().window().maximize();  // commands to window
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();  // closing the opened window after operation

    }

    @Test
    public void test1() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);  // entering the keyword
        driver.findElement(By.id("twotabsearchtextbox")).clear();
    }

    @Test
    public void test2() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Honey", Keys.ENTER);  // entering the keyword
        driver.findElement(By.id("twotabsearchtextbox")).clear();
    }
}
