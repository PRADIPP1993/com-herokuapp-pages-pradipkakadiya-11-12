package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.customlisteners.CustomListeners;
import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage=new LoginPage();
    }


    @Test(groups = {"sanity","regression"})
    public void UserSholdLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickonLoginButton();
        loginPage.veirfyTextSecureArea();
        Assert.assertEquals(loginPage.veirfyTextSecureArea(),"Secure Area","Error message not displayed");

    }
    @Test(groups = {"smoke","regression"})
    public void verifyTheUsernameErrorMessage  (){
      loginPage.enterInvalidUsername("tomsmith1");
      loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickonLoginButton1();
        loginPage.verifyErrorMessage();
        String expectedErrorMessage = "Your username is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.verifyErrorMessage(),expectedErrorMessage,"Error message not displayed");
    }
    @Test(groups = "regression")
    public void verifyThePasswordErrorMessage(){
        loginPage.enterUserName("tomsmith");
        loginPage.enterInvalidPassword("SuperSecretPassword");
        loginPage.clickonLoginButton1();
        loginPage.verfiyTxtInvalidPassword();

        String expectedErrorMessage = "Your password is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.verifyErrorMessage(),expectedErrorMessage,"Error message not displayed");

    }

}
