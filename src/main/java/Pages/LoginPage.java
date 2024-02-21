package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilites.BrowsersActions;

public class LoginPage extends HomePage{
    By mobileNumber= By.xpath("//input[@class=\"form-control js-input-mobile\"]");
    By password= By.xpath("//input[@class=\"form-control js-input-password\"]");
    By goToMyAccount= By.xpath("//input[@class=\"btn btn-primary card-btn js-btn-submit2\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void sendMobileNumber(String text){
        BrowsersActions.sendDataToElement(mobileNumber,driver,text);
    }
    public void sendPassword(String text){
        BrowsersActions.sendDataToElement(password,driver,text);
    }
    public void clickOnGoToMyAccount(){
        BrowsersActions.clickOnElement(goToMyAccount,driver);
    }
}
