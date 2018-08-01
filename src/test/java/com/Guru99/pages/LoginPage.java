package com.Guru99.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Guru99.utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    
    @FindBy(name= "uid")
    public WebElement username;
    
    @FindBy(name= "password")
    public WebElement password;
    
    @FindBy(name = " btnLogin")
    public WebElement LogginButton;
    
}