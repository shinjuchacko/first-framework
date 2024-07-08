package com.framework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GithubRepoTabTests extends BaseTestClass{
    @Test
    void verifyLinksCount(){
        String mainUrl = MAIN_URL+"/shinjuchacko?tab=repositories";
        driver.get(mainUrl);
        int repoSize= driver.findElements(By.xpath("//div[@id=\"user-repositories-list\"]//li")).size();
        assertEquals(2,repoSize);
    }
}
