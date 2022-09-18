package webBasedPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDismiss {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Admin/Desktop/htmldocument/alert.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}
	}
