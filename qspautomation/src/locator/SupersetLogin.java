package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SupersetLogin {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://app.joinsuperset.com/#/s/feed");
			driver.findElement(By.name("email")).sendKeys("shreyasomwanshi2018@gmail.com");
			driver.findElement(By.id("password")).sendKeys("9970304039");
			//Query
			driver.findElement(By.tagName("submit")).click();
		}

	}


