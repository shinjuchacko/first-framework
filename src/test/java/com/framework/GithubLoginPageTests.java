package com.framework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class GithubLoginPageTests extends BaseTestClass{
    @Test
    void verifyLogin(){
        driver.get(MAIN_URL+"login");
        driver.findElement(By.name("login")).sendKeys("shinjuchacko@gmail.com");
        driver.findElement(By.name("password")).sendKeys("hgggg");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.cssSelector("button[data-login='shinjuchacko']")).click();
        String actual = driver.findElement(By.cssSelector(".lh-condensed [title=\"shinjuchacko\"]")).getText();
        Assertions.assertEquals("shinjuchacko",actual);
    }
}
