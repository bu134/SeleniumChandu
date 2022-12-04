package PageLocators;

import org.openqa.selenium.By;

public interface HomePageLocators {

    By searchBox = new By.ByXPath("//input[@title='Search']");
    By searchButton = new By.ByXPath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]");
    By nextButton = new By.ByXPath("//a[@id='pnnext']");

}
