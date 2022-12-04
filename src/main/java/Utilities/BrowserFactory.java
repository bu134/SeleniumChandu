package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserFactory {

    public static WebDriver driverSetup(WebDriver driver, String driverName, String webURL){
        if(driverName.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(driverName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else{
            System.out.println("Driver not recognized, Driver setup failed");
        }

        driver.manage().window().maximize();
        driver.get(webURL);

        return driver;
    }

    public static void quitBrowser(WebDriver driver){
        System.out.println("Quitting Browser");
        driver.quit();
    }

    public static void closeBrowser(WebDriver driver){
        System.out.println("Closing Browser");
        driver.close();
    }

    public static void implicitWaitMethod(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public static void explicitWaitForElement(WebDriver driver, By elementLocator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            if (wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator)) != null) {
                System.out.println("Element has been found");
            } else {
                System.out.println("Element not found");
            }
        }
        catch (Exception e){
            System.out.println("Error Occurred during waiting for element : " + e.getMessage());
        }
    }
}
