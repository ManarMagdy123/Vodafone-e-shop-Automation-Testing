package TestCases;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilites.DriverSetUP;

import java.util.concurrent.TimeUnit;

public class TestClass {
    WebDriver driver;
    SoftAssert softAssert = new SoftAssert();
    HomePage homepage;
/*
    @Test
    public void navigated_to_login_page() {
        driver = DriverSetUP.driverSetUp("chrome", "https://eshop.vodafone.com.eg/eshop/");
        homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homepage.clickOnExitButton();
        homepage.clickOnLanguageButton();
        homepage.clickOnHomePageButton();
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("window.scrollBy(0,150)", "");
        homepage.clickOnAppleBrandButton();
        homepage.clickOnIphoneChargerButton();
        homepage.clickOnAddToCartButton();
        loginPage.sendMobileNumber("1036576586");
        loginPage.sendPassword("Manar@123456789");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        loginPage.clickOnGoToMyAccount();
//        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        homepage.clickOnCartLogo();
        homepage.clickOnCheckOutButton();
        homepage.clickOnNewAddress();
        homepage.chooseCity(" Cairo ");
        homepage.chooseDistrict(" Ain Shams ");
        homepage.sendStreetName("mahrous");
        homepage.sendFloorNumber("12");
        homepage.sendApartmentNumber("4");
        homepage.clickOnSaveAddressButton();
        homepage.clickOnGoToPayment();
        homepage.clickOnPaymentMethod();
        homepage.clickOnSubmitButton();
    }

 */
}
