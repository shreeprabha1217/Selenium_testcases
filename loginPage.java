package com.example.newProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class loginPage implements loginElements {
    public WebDriver driver=new ChromeDriver();
    SoftAssert softAssert=new SoftAssert();
    public void enterName(String name) {
    	driver.findElement(username).sendKeys(name);	
    	
    }
    public void enterPass(String pass) {
    	driver.findElement(password).sendKeys(pass);
    }
    public void submit() {
    	driver.findElement(login).click();
    	String expectedUrl="https://practicetestautomation.com/logged-in-successfully/";
    	String actualUrl=driver.getCurrentUrl();
    	System.out.print(actualUrl);
    	Assert.assertEquals(actualUrl,expectedUrl,"Login didn't succeed");
    	
    }
    public void logout() {
    	driver.findElement(logout).click();
    }
    
}
