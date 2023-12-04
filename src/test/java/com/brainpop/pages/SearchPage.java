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

    @FindBy(xpath = "//input[contains(@id,'search-input-_')]")
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


}
