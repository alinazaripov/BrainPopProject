package com.brainpop.pages;

import com.brainpop.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {
    public SearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@class='dropdown_label']")
    public WebElement logInButtonDropdown;

    @FindBy(id = "nli_grownup_button")
    public WebElement grownUpButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@id='password-input']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[contains(text(),'Allow all cookies')]")
    public WebElement allowCookies;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement clickLogInButton;

    @FindBy(xpath = "//div[@class='input_container']//input")
    public WebElement searchPlaceHolder;

    @FindBy(xpath = "//button[contains(@class,'button-wrapper medium')]")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@id='topic_list_results_container']//li")
    public List<WebElement> listOfResultTopic;

    @FindBy(xpath = "//div[contains(text(),'DNA')]")
    public WebElement dnaTopic;

    @FindBy(id = "topic_result_0")
    public WebElement dnaTopicClick;


    @FindBy(id = "feature_0")
    public WebElement movieOption;

    @FindBy(xpath = "//button[@id='play']")
    public WebElement videoPlayerButton;

    @FindBy(xpath = "//button[@id='fullscreen']")
    public WebElement screenSize;

    @FindBy(xpath = "//input[contains(@id,'video-slider-')]")
    public  WebElement videoSlider;


    @FindBy(xpath = "//span[@class='topics_results_number']")
    public WebElement topicResults;

    

    public void validateSearchResults() {
        SearchPage searchPage = new SearchPage();
        String expectedCountText = searchPage.topicResults.getText();
        int expectedCount = Integer.parseInt(expectedCountText);
        int actualCount = listOfResultTopic.size();
        Assert.assertEquals(expectedCount, actualCount);
    }

    //if attribute is greater than 0 that means user is playing the video..
    //Drag and drop and x and y value
    //if its not greater than 0 the time duration is 6:16


}
