package com.revature.steps.login;


import com.revature.pages.BugCatcherPage;
import com.revature.runner.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;




public class LoginPositiveImpl {

    //public WebDriver driver = WikiRunner.driver;
    //public WikiPage wikiPage = WikiRunner.wikiPage;

    public WebDriver driver = Runner.driver;
    public BugCatcherPage bugCatcherPage = Runner.bugCatcherPage;

    @Given("The employee is on the login page")
    public void the_employee_is_on_the_login_page() {
        driver.get("https://bugcatcher-primer.coe.revaturelabs.com/?dev=83");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("The employee types {string} into username input")
    public void the_employee_types_into_username_input(String string) {
        // Write code here that turns the phrase above into concrete actions
        bugCatcherPage.userNameIn.sendKeys(string);



        //throw new io.cucumber.java.PendingException();
    }


    @When("The employee types {string} into password input")
    public void the_employee_types_into_password_input(String string) {
        // Write code here that turns the phrase above into concrete actions
        bugCatcherPage.passwordIn.sendKeys(string);
        //throw new io.cucumber.java.PendingException();
    }
    @When("The employee clicks on the login button")
    public void the_employee_clicks_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/fieldset/button"));
        loginButton.click();
        //String logoutButton = driver.findElement(By.linkText("Logout")).getText();
        //Assert.assertTrue(logoutButton.contains("Logout"));

        //throw new io.cucumber.java.PendingException();
    }



    @Then("the employee should be on the {string} page")
    public void the_employee_should_be_on_the_page(String string) {
        // Write code here that turns the phrase above into concrete actions

        //WebElement webRole = driver.findElement(By.xpath("//*[@id=\"root\"]/h1"));

        WebElement firstResult = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(string));



        assertEquals(string.concat(" Home"), firstResult.getText());



       /*WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/h1")));

        */




        //assertEquals(string.concat(" Home"), driver.getTitle());
        //firstResult.isDisplayed();
        //throw new io.cucumber.java.PendingException();
        // //html/head/title
        // //*[@id="root"]/h1
    }


    @Then("The employee should see their name {string} {string} on the home page")
    public void the_employee_should_see_their_name_on_the_home_page(String string, String string2) {


        WebElement secondResult = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/nav/p")));
        assertEquals( "Welcome " + string + " " + string2, secondResult.getText());


        //*[@id="root"]/nav/p






        // Write code here that turns the phrase above into concrete actions
        /*WebElement fname = driver.findElement(By.cssSelector("#root > nav > p"));
        WebElement lname = driver.findElement(By.cssSelector("#root > nav > p"));
        //WebElement spanishLink = driver.findElement(By.cssSelector("a#js-link-box-es"));

        //WebElement title = driver.findElement(By.tagName("title"));
        //assertEquals("Wikipedia", title.getDomProperty("innerHTML"));
        assertEquals(string, driver.getTitle());
        assertEquals(string2, driver.getTitle());

         */

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException()

    }




    /*@Then("The employee should see their name {string} {string} on the home page")
    public void the_employee_should_see_their_name_on_the_home_page(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    /*@When("When the employee sees {string} on the page")
    public void the_employee_should_be_on_the_page(String string) {
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //WebElement role= driver.findElement(By.xpath("//*[@id=\"root\"]/h1"));

        assertEquals(string, driver.getTitle());

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

/*
    @Then("The employee should see their name {string} {string} on the home page")
    public void the_employee_should_see_their_name_on_the_home_page(String string, String string2) {
;
    }

    /*@Test
    public void locateByName() {

        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("mario" + Keys.ENTER);
        assertEquals("Mario - Wikipedia", driver.getTitle());
    }





*/
}


