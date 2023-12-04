package com.brainpop.step_definitions;

import com.brainpop.pages.SearchPage;
import com.brainpop.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

public class Search_stepDefinitions {
    SearchPage searchPage = new SearchPage();
    Actions actions = new Actions(Driver.getDriver());

    @And("the user enters and submits the search query {string}")
    public void theUserEntersAndSubmitsTheSearchQuery(String searchChallenge){
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
        searchPage.screenSize.click();



    }
}

