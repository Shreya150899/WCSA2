package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Shreya");
		driver.findElement(By.name("password")).sendKeys("Shrey@123");
		driver.findElement(By.cssSelector("button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
	}
}
			

