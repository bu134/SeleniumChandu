package Pages;

import PageLocators.HomePageLocators;
import Utilities.BaseTestNG;
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
        try{
            driver.wait(10000);
        }catch (Exception e){
            System.out.println("Error occured while waiting : " + e.getMessage());
        }
    }
}
