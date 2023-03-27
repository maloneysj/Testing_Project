package com.revature.runner;


import com.revature.pages.BugCatcherPage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/revature/features/login/login-positive.feature", glue="com.revature.steps")
public class Runner {

    public static WebDriver driver;

    public static BugCatcherPage bugCatcherPage;

    @BeforeClass
    public static void setup() {
        File chrome=new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());

        driver= new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        bugCatcherPage=new BugCatcherPage(driver);

    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }




}
