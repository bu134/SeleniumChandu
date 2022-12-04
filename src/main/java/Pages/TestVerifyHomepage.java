package Pages;

import PageLocators.HomePageLocators;
import Utilities.BaseTestNG;
import Utilities.BrowserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVerifyHomepage extends BaseTestNG implements HomePageLocators {

    @Test
    public void verifyHomepageTest()
    {
        driver.get(baseurl);
        String ActualURL=driver.getCurrentUrl();
        String ExpectedURL="https://www.google.co.in/?gws_rd=ssl";
        Assert.assertEquals(ActualURL,ExpectedURL);

        driver.findElement(searchBox).sendKeys("Car");
        driver.findElement(searchButton).click();
        BrowserFactory.explicitWaitForElement(driver,nextButton);
        BrowserFactory.implicitWaitMethod(driver);
    }

    @Test
    public void verifyHomepageTest2()
    {
        driver.get(baseurl);
        String ActualURL=driver.getCurrentUrl();
        String ExpectedURL="https://www.google.co.in/?gws_rd=ssl";
        Assert.assertEquals(ActualURL,ExpectedURL);

        driver.findElement(searchBox).sendKeys("Bus");
        driver.findElement(searchButton).click();
        BrowserFactory.explicitWaitForElement(driver,nextButton);
    }
}
