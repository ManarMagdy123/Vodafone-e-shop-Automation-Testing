package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilites.BrowsersActions;

public class RegisterationPage extends HomePage {
    By mobileNumber = By.xpath("//input[@class=\"form-control js-input-mobile-number\"]");
    By robotButton = By.xpath("//div[@class=\"recaptcha-checkbox-border\"]");
    By smsMessage = By.xpath("//input[@class=\"btn btn-primary card-btn js-btn-proceed\"]");
    By verificationCode = By.xpath("//input[@class=\"form-control js-input-code\"]");
    By verifyButton = By.xpath("//input[@class=\"btn btn-primary card-btn js-btn-submit-sms\"]");
    By nameBox = By.xpath("//input[@class=\"form-control js-input-first-name\"]");
    By emailBox = By.xpath("//input[@class=\"form-control js-input-email\"]");
    By passwordBox = By.xpath("//input[@class=\"form-control js-input-password-register\"]");
    By retypePasswordBox = By.xpath("//input[@class=\"form-control js-input-password-confirm-register\"]");
    By createAccountButton=By.xpath("//input[@class=\"btn btn-primary btn-disabled card-btn js-btn-submit-create-account\"]");

    public RegisterationPage(WebDriver driver) {
        super(driver);
    }

    public void sendMobileNumber(String text) {
        BrowsersActions.sendDataToElement(mobileNumber, driver, text);
    }

    public void clickOnRobotButton() {
        BrowsersActions.clickOnElement(robotButton, driver);
    }
    public void clickONSMSMessage(){
        BrowsersActions.clickOnElement(smsMessage, driver);
    }
    public void sendVerificationCode(String text){
        BrowsersActions.sendDataToElement(verificationCode, driver, text);
    }
    public void clickOnVerifyButton() {
        BrowsersActions.clickOnElement(verifyButton, driver);
    }
    public void sendName(String text){
        BrowsersActions.sendDataToElement(nameBox, driver, text);
    }
    public void sendEmail(String text){
        BrowsersActions.sendDataToElement(emailBox, driver, text);
    }
    public void sendPassword(String text){
        BrowsersActions.sendDataToElement(passwordBox, driver, text);
    }
    public void sendRetypePassword(String text){
        BrowsersActions.sendDataToElement(retypePasswordBox, driver, text);
    }
    public void clickOnCreateAccountButton(){
        BrowsersActions.clickOnElement(createAccountButton,driver);
    }

}
