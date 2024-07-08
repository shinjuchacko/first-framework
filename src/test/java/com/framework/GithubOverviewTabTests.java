package com.framework;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.*;

public class GithubOverviewTabTests extends BaseTestClass{
    String user ="shinjuchacko";


    @BeforeEach
    void navigateToOverviewPage(){
        driver.get(MAIN_URL +user);
    }

    @Test
    void verifyUserNameIsCorrect(){
        String actualUserName = driver.findElement(By.cssSelector(".p-nickname")).getText();
        assertEquals(user,actualUserName);
    }

    @Test
    void verifyLinkClinkIsNavigatedToCorrectPage(){
        String repo = "TestProject1";
        driver.findElement(By.linkText(repo)).click();
        String actualUrl = driver.getCurrentUrl();
        assertEquals(MAIN_URL +user+"/"+repo,actualUrl);
    }


}
