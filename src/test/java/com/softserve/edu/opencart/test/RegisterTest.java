package com.softserve.edu.opencart.test;

import com.softserve.edu.opencart.pages.LoggedDropdown;
import com.softserve.edu.opencart.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.softserve.edu.opencart.data.User;

public class RegisterTest extends TestRunner {

    @DataProvider
    public Object[][] dataRegister() {
        //
        User user = new User(); // TODO
        return new Object[][] {
                { user },
        };
    }

    @Test(dataProvider = "dataRegister")
    public void checkRegister(User user) {
        User user1 = user;

        RegisterPage registerPage = loadApplication()
                .gotoRegisterPage()
                .fillTheRegistrationFields(user1);
        LoggedDropdown log = registerPage.clickOnTheConfirmButton();

        Assert.assertEquals(log.getMessageAboutSuccessfulRegistration(), RegisterPage.SUCCESSMESAGE);
    }

}
