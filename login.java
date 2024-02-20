package com.example.newProject;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class login extends loginCall{
	String url="https://practicetestautomation.com/practice-test-login/";
	@BeforeSuite
	public void open() {
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test
	public void getin() {
		login();
	}
	@AfterSuite
	public void close() {
		driver.close();
		driver.quit();
	}
	
}
