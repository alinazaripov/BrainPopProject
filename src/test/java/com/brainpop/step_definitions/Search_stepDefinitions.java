package com.brainpop.step_definitions;

import com.brainpop.pages.SearchPage;
import com.brainpop.utilities.ConfigurationReader;
import com.brainpop.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class Search_stepDefinitions {
    SearchPage searchPage = new SearchPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("the user is on the BrainPOP homepage")
    public void the_user_is_on_the_brain_pop_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("brainPopUrl"));
    }

    @When("the user logs in with the username and password")
    public void theUserLogsInWithTheUsernameAndPassword() throws InterruptedException {

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", searchPage.allowCookies);

        Thread.sleep(8000);

        searchPage.logInButtonDropdown.click();
        searchPage.grownUpButton.click();
        searchPage.inputUserName.sendKeys(ConfigurationReader.getProperty("username"));
        searchPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        searchPage.clickLogInButton.click();

    }

    @And("the user enters and submits the search query {string}")
    public void theUserEntersAndSubmitsTheSearchQuery(String searchChallenge) {

        searchPage.searchPlaceHolder.sendKeys(searchChallenge);
        searchPage.searchButton.click();

        //validate search result

        searchPage.validateSearchResults();

    }

    @Then("the user selects the topic from the search results page")
    public void theUserSelectsTheTopicFromTheSearchResultsPage() {
        actions.moveToElement(searchPage.dnaTopic).perform();
        searchPage.dnaTopicClick.click();

    }

    @Then("the user performs various actions with the movie player")
    public void the_user_performs_various_actions_with_the_movie_player() {
        searchPage.movieOption.click();
        searchPage.videoPlayerButton.click();
        //maximize the screen
        searchPage.screenSize.click();

        //Confirm that the User can play the Movie and see its End Screen
        actions.dragAndDropBy(searchPage.videoSlider, 509, 0).build().perform();

        // Wait for the video duration to be visible
        WebElement durationElement = Driver.getDriver().findElement(By.id("duration"));

        String expectedDuration = "6:16";
        String actualDuration = durationElement.getText();


        //Validate that the Closed Caption feature can be toggled [On/Off]


    }
}

