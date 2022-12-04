package Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTestNG {

        public String baseurl="https://www.google.co.in/?gws_rd=ssl";
        public WebDriver driver;

        @BeforeTest
        public void driverLaunch(){
                System.out.println("Inside Before test method");
                driver = BrowserFactory.driverSetup(driver, "chrome", baseurl);
                BrowserFactory.implicitWaitMethod(driver);
        }
        @AfterTest
        public void closeBrowser()
        {
                System.out.println("Inside After test method");
                BrowserFactory.quitBrowser(driver);
        }

        @AfterClass
        public void afterClassMethod()
        {
                System.out.println("Inside After class method");
        }

        @AfterMethod
        public void afterMethod(){
                System.out.println("Inside After Method method");
        }

}
