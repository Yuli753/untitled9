package com.exampel.api;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {
    @Test
    public void testOpenWebPage() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/user?id=123");

        String bodyText = driver.findElement(By.tagName("body")).getText();
        assert bodyText.contains("John Doe");

        driver.quit();
    }
}
