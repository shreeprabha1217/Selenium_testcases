package exception;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class exceptPage implements exceptElement{
	public WebDriver driver=new ChromeDriver();
	public void edit() {
		driver.findElement(edit).click();
		driver.findElement(text).clear();
		driver.findElement(text).sendKeys("dosa");
		driver.findElement(save).click();
	}
	

}
