package testngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataProviderCode {
	WebDriver driver;
	@Test(dataProvider = "dataprovider")
	public void testActiTimeValidLogin(String invalidusername,String invalidpassword) 
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();  
	}
	@BeforeMethod
	public void Setup() 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("  http://desktop-r22th26/login.do");
	}

	@AfterMethod
	public void afterMethod() 
	{
		driver.quit(); 
	}


	@DataProvider
	public Object[][] dataprovider()
	{
		Object[][]data=new Object[3][2];
		data[0][0]="admin";
		data[0][1]="manager";
		return data;
	}
}

