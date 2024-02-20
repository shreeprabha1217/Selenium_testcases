package exception;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class exceptee extends exceptCall{
	String url="https://practicetestautomation.com/practice-test-exceptions/";
	@BeforeSuite
	public void open() {
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test
	public void getin() {
		exceptions();
	}
	@AfterSuite
	public void close() {
		driver.close();
		driver.quit();
	}
	

}
