package multiselectdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByValue {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Desktop/htmldocument/multiselectdropdown.html");
		Thread.sleep(3000);
		WebElement ssdropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(ssdropdown);
		sel.selectByValue("v7");
		Thread.sleep(2000);
		sel.deselectByValue("v7");
	}

}
