package amazonAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AmazonHome {

    public static void main(String[] args) {

        // using chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/ahmed/intelliJ/WebAutomationMaven/driver/chromedriver");

        // using firefox driver
        // System.setProperty("webdriver.gecko.driver", "/Users/ahmed/intelliJ/SeleniumProject1/driver/geckodriver");

        WebDriver driver = new ChromeDriver(); // chrome
        // WebDriver driver = new FirefoxDriver();   //firefox friver

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com/");    // website address

        driver.manage().window().maximize();     // window commands

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);    // entering the keyword

        driver.findElement(By.id("twotabsearchtextbox")).clear();      // clearing the search box for new key input

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Honey", Keys.ENTER);     // new next input

        driver.close();  // closing the opened window after operation

    }
}
