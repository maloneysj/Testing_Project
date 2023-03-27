package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BugCatcherPage {


    public WebDriver driver;

    public BugCatcherPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/fieldset/input[1]")
    public WebElement userNameIn;
    //*[@id="root"]/fieldset/input[1]

    @FindBy(xpath = "//*[@id=\"root\"]/fieldset/input[2]")
    public WebElement passwordIn;



    @FindBy(xpath = "/html/head/title")
    public WebElement title;
    @FindBy(xpath = "//*[@id=\"root\"]/fieldset/button")
    public WebElement loginButton;

    @FindBy(xpath = "/html/body/div/nav/p/text()[2]")
    public WebElement fname;
    @FindBy(xpath = "/html/body/div/nav/p/text()[3]")
    public WebElement lname;





}
