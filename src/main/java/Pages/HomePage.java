package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilites.BrowsersActions;

public class HomePage {
    WebDriver driver;
    By exitButton=By.xpath("//button[@class=\"onetrust-close-btn-handler banner-close-button ot-close-icon\"]");
    By languageButton=By.xpath("//button[@class=\"language\"]");
    By homePageButton=By.xpath("//a[@class=\"link\"]");
    By smartPhones= By.xpath("//div[@class=\"menu-tabs\"]//child::button[3]");
    By appleBrand=By.xpath("//div[@class=\"brands-tabs brands-tabs-start\"]//child::h5[3]");
    By iphoneCharger =By.xpath("//p[text()=\" Apple Original Wall Charger Type C 20W \"]");
    By addToCartButton=By.xpath("//button[@class=\"add-to-cart\"]");
    By registerButton=By.xpath("//a[@class=\"link-underline font-bold color-red align-baseline\"]");
    By cartLogo=By.xpath("//button[@class=\"cart-btn\"]");
    By goCheckOutButton=By.xpath("//button[@class=\"checkout-btn\"]");
    By newAddress=By.xpath("//div[@class=\"add-address\"]");
    By cityButton=By.xpath("//select[@formcontrolname=\"city\"]");
    By districtButton=By.xpath("//select[@formcontrolname=\"district\"]");
    By streetBox=By.xpath("//input[@formcontrolname=\"buildingNo\"]");
    By floorBox=By.xpath("//input[@formcontrolname=\"floorNo\"]");
    By apartmentBox=By.xpath("//input[@formcontrolname=\"appartmentNo\"]");
    By saveAddressButton=By.xpath("//button[@class=\"btn-primary delievry--btn--checkout\"]");
    By goTOPaymentButton=By.xpath("//button[@class=\"btn-primary\"]");
    By paymentMethod=By.xpath("//input[@value=\"Cash On Delivery\"]");
    By submitOrderButton=By.xpath("//button[@class=\"btn-primary place-order-btn\"]");
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickOnExitButton(){
        BrowsersActions.clickOnElement(exitButton,driver);
    }

    public void clickOnLanguageButton(){
        BrowsersActions.clickOnElement(languageButton,driver);
    }

    public void clickOnHomePageButton(){
        BrowsersActions.clickOnElement(homePageButton,driver);
    }
    public void clickOnSmartPhones(){
        BrowsersActions.clickOnElement(smartPhones,driver);
    }
    public void clickOnAppleBrandButton(){
        BrowsersActions.clickOnElement(appleBrand,driver);
    }
    public void clickOnIphoneChargerButton(){
        BrowsersActions.clickOnElement(iphoneCharger,driver);
    }
    public void clickOnAddToCartButton(){
        BrowsersActions.clickOnElement(addToCartButton,driver);
    }
    public void clickOnRegisterButton(){
        BrowsersActions.clickOnElement(registerButton,driver);
    }
    public void clickOnCartLogo(){
        BrowsersActions.clickOnElement(cartLogo,driver);
    }
    public void clickOnCheckOutButton(){
        BrowsersActions.clickOnElement(goCheckOutButton,driver);
    }
    public void clickOnSaveAddressButton(){
        BrowsersActions.clickOnElement(saveAddressButton,driver);
    }
    public void chooseCity(String text){
        BrowsersActions.selectDataFromCheckBox(cityButton,driver,text);
    }
    public void chooseDistrict(String text){
        BrowsersActions.selectDataFromCheckBox(districtButton,driver,text);
    }
    public void sendStreetName(String text){
        BrowsersActions.sendDataToElement(streetBox,driver,text);
    }
    public void sendFloorNumber(String text){
        BrowsersActions.sendDataToElement(floorBox,driver,text);
    }
    public void sendApartmentNumber(String text){
        BrowsersActions.sendDataToElement(apartmentBox,driver,text);
    }
    public void clickOnNewAddress(){
        BrowsersActions.clickOnElement(newAddress,driver);
    }
    public void clickOnGoToPayment(){
        BrowsersActions.clickOnElement(goTOPaymentButton,driver);
    }
    public void clickOnPaymentMethod(){
        BrowsersActions.clickOnElement(paymentMethod,driver);
    }
    public void clickOnSubmitButton(){
        BrowsersActions.clickOnElement(submitOrderButton,driver);
    }
}
