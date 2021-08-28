package com.softserve.edu.opencart.pages;

import com.softserve.edu.opencart.data.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends AccountSidebarGuestPart {

    private WebElement firstName;
    private WebElement lastName;
    private WebElement eMail;
    private WebElement telephone;
    private WebElement fax;
    private WebElement company;
    private WebElement address1;
    private WebElement address2;
    private WebElement city;
    private WebElement postCode;
    private WebElement region;
    private WebElement country;
    private WebElement password;
    private WebElement passwordConfirm;
    private WebElement  privacyPolicy;
    private WebElement continueButton;
    private WebElement accountCreated;


    public   final static String SUCCESSMESAGE= "Your Account Has Been Created!";



    public RegisterPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        firstName = driver.findElement(By.id("input-firstname"));
        lastName = driver.findElement(By.id("input-lastname"));
        eMail =  driver.findElement(By.id("input-email"));
        telephone = driver.findElement(By.id("input-telephone"));
        fax  =  driver.findElement(By.id("input-fax"));
        company = driver.findElement(By.id("input-company"));
        privacyPolicy = driver.findElement(By.xpath("//input[@name='agree']"));
        continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        address1 = driver.findElement(By.id("input-address-1"));
        address2 = driver.findElement(By.id("input-address-2"));
        city  = driver.findElement(By.id("input-city"));
        postCode = driver.findElement(By.id("input-postcode"));
        country =  driver.findElement(By.id("input-country"));
        region = driver.findElement(By.id("input-zone"));
        password = driver.findElement(By.id("input-password"));
        passwordConfirm = driver.findElement(By.id("input-confirm"));


    }

    // Page Object

    // Functional



    private void enterTextIntoTheFieldFirstName(String text){
        firstName.sendKeys(text);

    }
    private void enterTextIntoTheFieldLastName(String text){
        lastName.sendKeys(text);
    }
    private void enterTextIntoTheFieldEmail(String text){
        eMail.sendKeys(text);
    }
    private void enterTextIntoTheFieldTelephone(String text){
        telephone.sendKeys(text);
    }
    private void EnterTextIntoTheFieldFax(String text){
        fax.sendKeys(text);

    }
    private void enterTextIntoTheFieldCompany(String text){
        company.sendKeys(text);
    }
    private void enterTextIntoTheFieldAddress1(String text){
        address1.sendKeys(text);
    }
    private void enterTextIntoTheFieldAddress2(String text){
        address2.sendKeys(text);
    }
    private void enterTextIntoTheFieldCity(String text){
        city.sendKeys(text);
    }

    private void enterTextIntoTheFieldPostCode(String text){
        postCode.sendKeys(text);
    }
    private void enterTextIntoTheFieldRegion(String text){
        region.sendKeys(text);

    }
    private void enterTextIntoTheFieldPassword(String text){
        password.sendKeys(text);
    }
    private void enterTextIntoTheFieldPasswordConfirm(String text){
        passwordConfirm.sendKeys(text);
    }
    private void clickOnButtonPrivacyPolicy(){
        privacyPolicy.click();
    }
    private void clickOnContinueButton(){
        continueButton.click();
    }
    private void selectRegion(String text){
        Select select = new Select(region);
        select.selectByVisibleText(text);
    }

    private void selectCounty(String text){
        Select select = new Select(country);
        select.selectByVisibleText(text);
    }


    // Business Logic
    public RegisterPage fillTheRegistrationFields(User user){
        enterTextIntoTheFieldFirstName(user.getAddress1());

        enterTextIntoTheFieldLastName(user.getLastName());

        enterTextIntoTheFieldEmail(user.getE_Mail());

        enterTextIntoTheFieldTelephone(user.getTelephon());

        EnterTextIntoTheFieldFax(user.getFax());

        enterTextIntoTheFieldCompany(user.getCompany());

        enterTextIntoTheFieldAddress1(user.getAddress1());

        enterTextIntoTheFieldAddress2(user.getAddress2());

        enterTextIntoTheFieldCity(user.getCity());

        enterTextIntoTheFieldPostCode(user.getPostCode());

        enterTextIntoTheFieldRegion(user.getRegion());

        enterTextIntoTheFieldPassword(user.getPassword());

        enterTextIntoTheFieldPasswordConfirm(user.getPasswordConfirm());

        return new RegisterPage(driver);
    }

    public   LoggedDropdown clickOnTheConfirmButton(){
        clickOnButtonPrivacyPolicy();

        clickOnContinueButton();
        return new LoggedDropdown(driver);
    }

}
