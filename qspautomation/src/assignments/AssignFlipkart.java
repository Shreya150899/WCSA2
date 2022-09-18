package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone 12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_4rR01T' and .='APPLE iPhone 12 (Green, 64 GB)']")).click();
		Thread.sleep(2000);
		String parenthandle = driver.getWindowHandle();
		Set<String> alltabs = driver.getWindowHandles();
         for(String tab:alltabs)
         {
        	 
        driver.switchTo().window(tab);
        }
        	 driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]")).click();
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//a[.='256 GB']")).click();
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("410039");
        	 Thread.sleep(2000);
         }
         
	}

