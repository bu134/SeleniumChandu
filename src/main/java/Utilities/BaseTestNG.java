package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTestNG {

        public String baseurl="https://www.google.co.in/?gws_rd=ssl";
        public WebDriver driver;

        @BeforeTest
        public void SetupBrowserDriver()
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

//        @BeforeMethod
//        public void loginHomepage()
//        {
//            driver.findElement(By.name("uid")).sendKeys("****");
//            driver.findElement(By.name("password")).sendKeys("****");
//            driver.findElement(By.name("btnLogin")).click();
//        }

        @AfterTest
        public void closeBrowser()
        {
            driver.quit();
        }
}
