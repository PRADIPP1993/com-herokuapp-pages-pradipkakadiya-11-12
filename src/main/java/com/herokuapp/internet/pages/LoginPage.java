package com.herokuapp.internet.pages;

import com.aventstack.extentreports.Status;
import com.herokuapp.internet.customlisteners.CustomListeners;
import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(name = "username")
    WebElement username ;

    @CacheLookup
    @FindBy(name = "password")
    WebElement password ;


    @CacheLookup
    @FindBy(xpath = "//i[contains(text(),'Login')]")
    WebElement loginButton ;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/h2[1]")
    WebElement verifytext2 ;

     @CacheLookup
    @FindBy(name = "username")
    WebElement invalidUsername ;

    @CacheLookup
    @FindBy(xpath = "//div[@class='flash error']")
    WebElement errorMessage ;

    @CacheLookup
    @FindBy(name = "password")
    WebElement invalidPassword ;

   @CacheLookup
   @FindBy(xpath= "//div[@class='flash error']")
   WebElement verifyText3 ;
    public void enterUserName(String usersname){
        Reporter.log("Enter username to the  field"+usersname+ username.toString());
        sendTextToElement(username,usersname);
        CustomListeners.test.log(Status.PASS,"Enter username" );
    }
    public void enterPassword(String psw){
        Reporter.log("Enter password to the  field"+psw+ password.toString());
        sendTextToElement(password,psw);
        CustomListeners.test.log(Status.PASS,"Enter username" );
    }
    public void clickonLoginButton(){
        Reporter.log("click on login button"+ loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"Enter username" );
    }
    public String veirfyTextSecureArea(){
        Reporter.log("verift the text secure area"+ verifytext2.toString());
        String message=getTextFromElement(verifytext2);
        CustomListeners.test.log(Status.PASS,"Enter username" );
        return message;

    }
    public void enterInvalidUsername(String usrn){
        Reporter.log("Enter username to the  field"+usrn+ invalidUsername.toString());
        sendTextToElement(invalidUsername,usrn);
        CustomListeners.test.log(Status.PASS,"Enter Invalidusername" );
    }


    public void enterValidPassowrd(String psswd){
        Reporter.log("Enter validpassword to the  field"+psswd+ password.toString());
        sendTextToElement(password,psswd);
        CustomListeners.test.log(Status.PASS,"Enter validpassword" );
    }
    public void clickonLoginButton1(){
        Reporter.log("click on login button"+ loginButton.toString());
        clickOnElement(loginButton);   //Click on ‘LOGIN’ button
        CustomListeners.test.log(Status.PASS,"click on login button" );
    }
    public String verifyErrorMessage(){
        Reporter.log("verify the error message"+ errorMessage.toString());
        String message=getTextFromElement(errorMessage);
        CustomListeners.test.log(Status.PASS,"errormessage" );
        return message;

    }
    public void enterInvalidPassword(String invaldpsw){
        Reporter.log("Enter username to the  field"+invaldpsw+ invalidUsername.toString());
        sendTextToElement(invalidPassword,invaldpsw);
        CustomListeners.test.log(Status.PASS,"Enter Invalidusername" );
    }
   public String verfiyTxtInvalidPassword(){
       Reporter.log("verift the text secure area"+ verifyText3.toString());
       String message= getTextFromElement(verifyText3);
       CustomListeners.test.log(Status.PASS,"Enter username" );
       return message;

   }






}