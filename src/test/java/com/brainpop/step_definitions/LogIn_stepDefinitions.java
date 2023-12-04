package com.brainpop.step_definitions;

import com.brainpop.pages.LogInPage;
import com.brainpop.utilities.BrowserUtils;
import com.brainpop.utilities.ConfigurationReader;
import com.brainpop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class LogIn_stepDefinitions {

   LogInPage logInPage = new LogInPage();

    @Given("user is on the BrainPOP homepage")
    public void the_user_is_on_the_brain_pop_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("brainPopUrl"));
    }

    @When("the user logs in with the username and password")
    public void theUserLogsInWithTheUsernameAndPassword() {

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", logInPage.allowCookies);


        logInPage.logInButtonDropdown.click();
        logInPage.grownUpButton.click();
        logInPage.inputUserName.sendKeys(ConfigurationReader.getProperty("username"));
        logInPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        logInPage.clickLogInButton.click();

    }

    @Then("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        String expectedTitle = "BrainPOP";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }

    @When("The user tries to login with {string} and {string}")
    public void the_user_tries_to_login_with_and(String username, String password){

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", logInPage.allowCookies);

        logInPage.logInButtonDropdown.click();
        logInPage.grownUpButton.click();
        logInPage.inputUserName.sendKeys(username);
        logInPage.inputPassword.sendKeys(password);
        logInPage.clickLogInButton.click();


    }
    @Then("The user sees {string} error message")
    public void the_user_sees_error_message(String expectedMessage) {
        String actualMessage = logInPage.messageError.getText();
        Assert.assertEquals(expectedMessage,actualMessage);



    }



    }

