package com.example.newProject;

import org.openqa.selenium.By;
import org.testng.Assert;

public interface loginElements {
	
	By username=By.id("username");
	By password=By.id("password");
	By login=By.id("submit");
	By logout=By.xpath("//a[@href='https://practicetestautomation.com/practice-test-login/']");
	
}
