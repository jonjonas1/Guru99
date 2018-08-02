package com.Guru99.step_definitions;

import com.Guru99.pages.LoginPage;
import com.Guru99.utilities.ConfigurationReader;
import com.Guru99.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefs {
	LoginPage loginPage = new LoginPage();
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	    System.out.println("User in the homePage");
	    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	    
	}

	@When("the user enters username and password")
	public void the_user_enters_username_and_password() {
		loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
		loginPage.LogginButton.click();
		
	}

	@Then("verify home page title {string}")
	public void verify_home_page_title(String string) {
	    
	}
	
	

}
