package com.brainpop.pages;

import com.brainpop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    public LogInPage() {
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

        @FindBy(xpath = "//div[@class='message_title']")
        public WebElement messageError;

    }



